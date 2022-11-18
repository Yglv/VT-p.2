package Task2.data.appliance_factory.impl;

import Task2.entity.Appliance;
import Task2.entity.CPU;
import Task2.entity.Laptop;
import Task2.entity.OS;
import Task2.entity.criteria.SearchCriteria;
import Task2.data.appliance_factory.ApplianceFactory;
import Task2.data.constant.DaoExceptionMessage;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class LaptopFactory extends ApplianceFactory {
    private double price;
    private double batteryCapacity;
    private OS os;
    private double memoryRom;
    private CPU cpu;
    private double displayInches;

    @Override
    public Appliance createAppliance(NodeList nodeList) {
        for (int i = 0; i < nodeList.getLength(); i++) {
            if (nodeList.item(i).getNodeType() == Node.ELEMENT_NODE) {
                String value = nodeList.item(i).getTextContent();
                String laptopSearchCriteria = nodeList.item(i).getNodeName().toUpperCase().replace('-', '_');

                switch (SearchCriteria.Laptop.valueOf(laptopSearchCriteria)) {
                    case PRICE -> price = Double.parseDouble(value);
                    case BATTERY_CAPACITY -> batteryCapacity = Double.parseDouble(value);
                    case OS -> os = OS.valueOf(value);
                    case MEMORY_ROM -> memoryRom = Double.parseDouble(value);
                    case CPU -> cpu = CPU.valueOf(value);
                    case DISPLAY_INCHES -> displayInches = Double.parseDouble(value);
                    default -> throw new IllegalArgumentException(DaoExceptionMessage.ILLEGAL_ARGUMENT_APPLIANCE_FACTORY_EXCEPTION_MSG.getMessage());
                }
            }
        }

        return new Laptop(price, batteryCapacity, os, memoryRom, cpu, displayInches);
    }

}
