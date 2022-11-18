package Task2.service.validation.impl;

import Task2.entity.OS;
import Task2.service.validation.CriteriaValidator;

public class OSValidator implements CriteriaValidator {

    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            OS.valueOf((String) value);
            return true;
        } catch (IllegalArgumentException | NullPointerException e) {
            return false;
        }
    }

}
