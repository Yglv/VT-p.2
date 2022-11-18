package Task2.service.validation.impl;

import Task2.entity.FilterType;
import Task2.service.validation.CriteriaValidator;

public class FilterTypeValidator implements CriteriaValidator {

    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            FilterType.valueOf((String) value);
            return true;
        } catch (IllegalArgumentException | NullPointerException e) {
            return false;
        }
    }

}
