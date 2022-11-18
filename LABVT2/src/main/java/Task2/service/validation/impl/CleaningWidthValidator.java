package Task2.service.validation.impl;

import Task2.service.validation.CriteriaValidator;

public class CleaningWidthValidator implements CriteriaValidator {
    private final static double MIN_CLEANING_WIDTH = 0.0;
    private final static double MAX_CLEANING_WIDTH = 1000.0;

    @Override
    public boolean isCriteriaValid(Object value) {
        if (value instanceof Double) {
            double cleaningWidth = (Double) value;
            return ((cleaningWidth > MIN_CLEANING_WIDTH) && (cleaningWidth < MAX_CLEANING_WIDTH));
        } else {
            return false;
        }
    }
}
