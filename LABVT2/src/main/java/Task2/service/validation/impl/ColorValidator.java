package Task2.service.validation.impl;

import Task2.entity.Color;
import Task2.service.validation.CriteriaValidator;

public class ColorValidator implements CriteriaValidator {

    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            Color.valueOf((String) value);
            return true;
        } catch (IllegalArgumentException | NullPointerException e) {
            return false;
        }
    }

}
