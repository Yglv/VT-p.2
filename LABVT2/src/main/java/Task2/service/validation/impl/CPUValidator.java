package Task2.service.validation.impl;

import Task2.entity.CPU;
import Task2.service.validation.CriteriaValidator;

public class CPUValidator implements CriteriaValidator {

    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            CPU.valueOf((String) value);
            return true;
        } catch (IllegalArgumentException | NullPointerException e) {
            return false;
        }
    }

}
