package Task2.data.appliance_matcher.impl;

import Task2.entity.Appliance;
import Task2.entity.CPU;
import Task2.entity.Laptop;
import Task2.entity.OS;
import Task2.entity.criteria.SearchCriteria;
import Task2.data.appliance_matcher.ApplianceMatcherFactory;
import Task2.data.constant.ApplianceTagName;

public class LaptopMatcher extends ApplianceMatcherFactory {
    @Override
    public boolean isMatchesCriteria(Appliance appliance, String criteriaName, Object value) {
        Laptop laptop = (Laptop) appliance;

        return switch (SearchCriteria.LaptopWithPriceFilter.valueOf(criteriaName)) {
            case MORE_THAN_CURRENT_PRICE -> laptop.getPrice() > (double) value;
            case LESS_THAN_CURRENT_PRICE -> laptop.getPrice() < (double) value;
            case PRICE, EQUAL_CURRENT_PRICE -> laptop.getPrice() == (double) value;
            case NAME -> ApplianceTagName.LAPTOP.equals(value);
            case BATTERY_CAPACITY -> laptop.getBatteryCapacity() == (double) value;
            case OS -> laptop.getOs().equals(OS.valueOf((String) value));
            case MEMORY_ROM -> laptop.getMemoryRom() == (double) value;
            case CPU -> laptop.getCpu().equals(CPU.valueOf((String) value));
            case DISPLAY_INCHES -> laptop.getDisplayInches() == (double) value;
        };
    }
}
