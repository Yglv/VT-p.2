package Task2.service.validation.impl;

import Task2.entity.WandType;
import Task2.service.validation.CriteriaValidator;

public class WandTypeValidator implements CriteriaValidator {

    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            WandType.valueOf((String) value);
            return true;
        } catch (IllegalArgumentException | NullPointerException e) {
            return false;
        }
    }

}
