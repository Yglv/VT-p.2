package Task2.service.validation.impl;

import Task2.service.validation.CriteriaValidator;

public class WidthValidator implements CriteriaValidator {
    private final static double MIN_WIDTH = 0.0;

    @Override
    public boolean isCriteriaValid(Object value) {
        if (value instanceof Double) {
            return (Double) value > MIN_WIDTH;
        } else {
            return false;
        }
    }
}
