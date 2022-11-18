package Task2.data.appliance_factory.impl;

import Task2.entity.Appliance;
import Task2.entity.Refrigerator;
import Task2.entity.criteria.SearchCriteria;
import Task2.data.appliance_factory.ApplianceFactory;
import Task2.data.constant.DaoExceptionMessage;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class RefrigeratorFactory extends ApplianceFactory {
    private double price;
    private double powerConsumption;
    private double weight;
    private double freezerCapacity;
    private double overallCapacity;
    private double height;
    private double width;

    @Override
    public Appliance createAppliance(NodeList nodeList) {
        for (int i = 0; i < nodeList.getLength(); i++) {
            if (nodeList.item(i).getNodeType() == Node.ELEMENT_NODE) {
                String value = nodeList.item(i).getTextContent();
                String refrigeratorSearchCriteria = nodeList.item(i).getNodeName().toUpperCase().replace('-', '_');

                switch (SearchCriteria.Refrigerator.valueOf(refrigeratorSearchCriteria)) {
                    case PRICE -> price = Double.parseDouble(value);
                    case POWER_CONSUMPTION -> powerConsumption = Double.parseDouble(value);
                    case WEIGHT -> weight = Double.parseDouble(value);
                    case FREEZER_CAPACITY -> freezerCapacity = Double.parseDouble(value);
                    case OVERALL_CAPACITY -> overallCapacity = Double.parseDouble(value);
                    case HEIGHT -> height = Double.parseDouble(value);
                    case WIDTH -> width = Double.parseDouble(value);
                    default -> throw new IllegalArgumentException(DaoExceptionMessage.ILLEGAL_ARGUMENT_APPLIANCE_FACTORY_EXCEPTION_MSG.getMessage());
                }

            }
        }
        return new Refrigerator(price, powerConsumption, weight, freezerCapacity, overallCapacity, height, width);
    }

}
