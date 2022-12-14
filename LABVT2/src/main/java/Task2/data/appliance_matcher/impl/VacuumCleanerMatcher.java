package Task2.data.appliance_matcher.impl;

import Task2.data.appliance_matcher.ApplianceMatcherFactory;
import Task2.entity.*;
import Task2.entity.criteria.SearchCriteria;
import Task2.data.constant.ApplianceTagName;
import by.bsuir.task02.entity.*;

public class VacuumCleanerMatcher extends ApplianceMatcherFactory {
    @Override
    public boolean isMatchesCriteria(Appliance appliance, String criteriaName, Object value) {
        VacuumCleaner vacuumCleaner = (VacuumCleaner) appliance;

        return switch (SearchCriteria.VacuumCleanerWithPriceFilter.valueOf(criteriaName)) {
            case MORE_THAN_CURRENT_PRICE -> vacuumCleaner.getPrice() > (double) value;
            case LESS_THAN_CURRENT_PRICE -> vacuumCleaner.getPrice() < (double) value;
            case PRICE, EQUAL_CURRENT_PRICE -> vacuumCleaner.getPrice() == (double) value;
            case NAME -> ApplianceTagName.VACUUM_CLEANER.equals(value);
            case POWER_CONSUMPTION -> vacuumCleaner.getPowerConsumption() == (double) value;
            case FILTER_TYPE -> vacuumCleaner.getFilterType().equals(FilterType.valueOf((String) value));
            case BAG_TYPE -> vacuumCleaner.getBagType().equals(BagType.valueOf((String) value));
            case WAND_TYPE -> vacuumCleaner.getWandType().equals(WandType.valueOf((String) value));
            case MOTOR_SPEED_REGULATION -> vacuumCleaner.getMotorSpeedRegulation() == (double) value;
            case CLEANING_WIDTH -> vacuumCleaner.getCleaningWidth() == (double) value;
        };
    }
}
