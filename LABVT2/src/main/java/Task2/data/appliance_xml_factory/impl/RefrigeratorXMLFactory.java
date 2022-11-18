package Task2.data.appliance_xml_factory.impl;

import Task2.entity.Appliance;
import Task2.entity.Refrigerator;
import Task2.entity.criteria.SearchCriteria;
import Task2.data.constant.ApplianceTagName;
import Task2.data.appliance_xml_factory.ApplianceXMLFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class RefrigeratorXMLFactory extends ApplianceXMLFactory {
    @Override
    public Node createApplianceXML(Document document, Appliance appliance) {
        Refrigerator refrigerator = (Refrigerator) appliance;
        Element refrigeratorElement = document.createElement(ApplianceTagName.REFRIGERATOR.name().toLowerCase().replace('_', '-'));

        refrigeratorElement.appendChild(createElement(document, SearchCriteria.Refrigerator.PRICE.name(), refrigerator.getPrice()));
        refrigeratorElement.appendChild(createElement(document, SearchCriteria.Refrigerator.POWER_CONSUMPTION.name(), refrigerator.getPowerConsumption()));
        refrigeratorElement.appendChild(createElement(document, SearchCriteria.Refrigerator.WEIGHT.name(), refrigerator.getWeight()));
        refrigeratorElement.appendChild(createElement(document, SearchCriteria.Refrigerator.FREEZER_CAPACITY.name(), refrigerator.getFreezerCapacity()));
        refrigeratorElement.appendChild(createElement(document, SearchCriteria.Refrigerator.OVERALL_CAPACITY.name(), refrigerator.getOverallCapacity()));
        refrigeratorElement.appendChild(createElement(document, SearchCriteria.Refrigerator.HEIGHT.name(), refrigerator.getHeight()));
        refrigeratorElement.appendChild(createElement(document, SearchCriteria.Refrigerator.WIDTH.name(), refrigerator.getWidth()));
        return refrigeratorElement;
    }
}
