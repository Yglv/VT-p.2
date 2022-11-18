package Task2.service.validation.impl;

import Task2.service.validation.CriteriaValidator;
import Task2.data.constant.ApplianceTagName;

public class ApplianceNameValidator implements CriteriaValidator {

    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            ApplianceTagName.valueOf((String) value);
            return true;
        } catch (IllegalArgumentException | NullPointerException e) {
            return false;
        }
    }
}
