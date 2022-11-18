package Task2.data.appliance_matcher.impl;

import Task2.entity.Appliance;
import Task2.entity.Oven;
import Task2.entity.criteria.SearchCriteria;
import Task2.data.constant.ApplianceTagName;
import Task2.data.appliance_matcher.ApplianceMatcherFactory;

public class OvenMatcher extends ApplianceMatcherFactory {

    @Override
    public boolean isMatchesCriteria(Appliance appliance, String criteriaName, Object value) {
        Oven oven = (Oven) appliance;

        return switch (SearchCriteria.OvenWithPriceFilter.valueOf(criteriaName)) {
            case MORE_THAN_CURRENT_PRICE -> oven.getPrice() > (double) value;
            case LESS_THAN_CURRENT_PRICE -> oven.getPrice() < (double) value;
            case PRICE, EQUAL_CURRENT_PRICE -> oven.getPrice() == (double) value;
            case NAME -> ApplianceTagName.OVEN.equals(value);
            case POWER_CONSUMPTION -> oven.getPowerConsumption() == (double) value;
            case WEIGHT -> oven.getWeight() == (double) value;
            case CAPACITY -> oven.getCapacity() == (double) value;
            case DEPTH -> oven.getDepth() == (double) value;
            case HEIGHT -> oven.getHeight() == (double) value;
            case WIDTH -> oven.getWidth() == (double) value;
        };
    }
}
