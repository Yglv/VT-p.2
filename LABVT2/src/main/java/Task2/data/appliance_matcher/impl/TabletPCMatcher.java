package Task2.data.appliance_matcher.impl;

import Task2.entity.Appliance;
import Task2.entity.Color;
import Task2.entity.TabletPC;
import Task2.entity.criteria.SearchCriteria;
import Task2.data.constant.ApplianceTagName;
import Task2.data.appliance_matcher.ApplianceMatcherFactory;

public class TabletPCMatcher extends ApplianceMatcherFactory {

    @Override
    public boolean isMatchesCriteria(Appliance appliance, String criteriaName, Object value) {
        TabletPC tabletPC = (TabletPC) appliance;

        return switch (SearchCriteria.TabletPCWithPriceFilter.valueOf(criteriaName)) {
            case MORE_THAN_CURRENT_PRICE -> tabletPC.getPrice() > (double) value;
            case LESS_THAN_CURRENT_PRICE -> tabletPC.getPrice() < (double) value;
            case PRICE, EQUAL_CURRENT_PRICE -> tabletPC.getPrice() == (double) value;
            case NAME -> ApplianceTagName.TABLET_PC.equals(value);
            case BATTERY_CAPACITY -> tabletPC.getBatteryCapacity() == (double) value;
            case DISPLAY_INCHES -> tabletPC.getDisplayInches() == (double) value;
            case MEMORY_ROM -> tabletPC.getMemoryRom() == (double) value;
            case FLASH_MEMORY_CAPACITY -> tabletPC.getFlashMemoryCapacity() == (double) value;
            case COLOR -> tabletPC.getColor().equals(Color.valueOf((String) value));
        };
    }
}
