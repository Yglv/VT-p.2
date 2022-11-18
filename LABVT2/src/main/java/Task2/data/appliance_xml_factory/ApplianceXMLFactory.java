package Task2.data.appliance_xml_factory;

import Task2.data.appliance_xml_factory.impl.*;
import Task2.entity.Appliance;
import by.bsuir.task02.dao.appliance_xml_factory.impl.*;
import Task2.data.constant.ApplianceTagName;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public abstract class ApplianceXMLFactory {

    public abstract Node createApplianceXML(Document document, Appliance appliance);

    protected final Node createElement(Document document, String fieldTagName, Object value) {
        Element node = document.createElement(fieldTagName.toLowerCase().replace('_', '-'));
        node.appendChild(document.createTextNode(String.valueOf(value)));
        return node;
    }

    public static ApplianceXMLFactory getApplianceXMLFactory(String applianceName) throws EnumConstantNotPresentException {
        try {
            return switch (ApplianceTagName.valueOf(applianceName)) {
                case LAPTOP -> new LaptopXMLFactory();
                case OVEN -> new OvenXMLFactory();
                case REFRIGERATOR -> new RefrigeratorXMLFactory();
                case SPEAKERS -> new SpeakersXMLFactory();
                case TABLET_PC -> new TabletPCXMLFactory();
                case VACUUM_CLEANER -> new VacuumCleanerXMLFactory();
            };
        } catch (IllegalArgumentException e) {
            throw new EnumConstantNotPresentException(ApplianceTagName.class, applianceName);
        }

    }
}
