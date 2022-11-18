package Task2.service.validation.impl;

import Task2.entity.BagType;
import Task2.service.validation.CriteriaValidator;

public class BagTypeValidator implements CriteriaValidator {

    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            BagType.valueOf((String) value);
            return true;
        } catch (IllegalArgumentException | NullPointerException e) {
            return false;
        }
    }

}
