package Task2.data.appliance_factory;

import Task2.data.appliance_factory.impl.*;
import Task2.entity.Appliance;
import Task2.data.constant.ApplianceTagName;
import by.bsuir.task02.dao.appliance_factory.impl.*;
import org.w3c.dom.NodeList;

public abstract class ApplianceFactory {

    public abstract Appliance createAppliance(NodeList nodeList);

    public static ApplianceFactory getApplianceFactory(String applianceName) throws EnumConstantNotPresentException {
        try {
            return switch (ApplianceTagName.valueOf(applianceName)) {
                case LAPTOP -> new LaptopFactory();
                case OVEN -> new OvenFactory();
                case REFRIGERATOR -> new RefrigeratorFactory();
                case SPEAKERS -> new SpeakersFactory();
                case TABLET_PC -> new TabletPCFactory();
                case VACUUM_CLEANER -> new VacuumCleanerFactory();
            };
        } catch (IllegalArgumentException e) {
            throw new EnumConstantNotPresentException(ApplianceTagName.class, applianceName);
        }
    }

}
