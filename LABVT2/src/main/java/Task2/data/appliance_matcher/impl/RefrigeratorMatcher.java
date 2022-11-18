package Task2.data.appliance_matcher.impl;

import Task2.entity.Appliance;
import Task2.entity.Refrigerator;
import Task2.entity.criteria.SearchCriteria;
import Task2.data.constant.ApplianceTagName;
import Task2.data.appliance_matcher.ApplianceMatcherFactory;

public class RefrigeratorMatcher extends ApplianceMatcherFactory {

    @Override
    public boolean isMatchesCriteria(Appliance appliance, String criteriaName, Object value) {
        Refrigerator refrigerator = (Refrigerator) appliance;

        return switch (SearchCriteria.RefrigeratorWithPriceFilter.valueOf(criteriaName)) {
            case MORE_THAN_CURRENT_PRICE -> refrigerator.getPrice() > (double) value;
            case LESS_THAN_CURRENT_PRICE -> refrigerator.getPrice() < (double) value;
            case PRICE, EQUAL_CURRENT_PRICE -> refrigerator.getPrice() == (double) value;
            case NAME -> ApplianceTagName.REFRIGERATOR.equals(value);
            case POWER_CONSUMPTION -> (double) value == refrigerator.getPowerConsumption();
            case WEIGHT -> refrigerator.getWeight() == (double) value;
            case FREEZER_CAPACITY -> refrigerator.getFreezerCapacity() == (double) value;
            case OVERALL_CAPACITY -> refrigerator.getOverallCapacity() == (double) value;
            case HEIGHT -> refrigerator.getHeight() == (double) value;
            case WIDTH -> refrigerator.getWidth() == (double) value;
        };
    }
}
