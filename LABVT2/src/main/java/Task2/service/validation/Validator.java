package Task2.service.validation;

import Task2.entity.criteria.Criteria;

public class Validator {

    public static boolean isCriteriaValid(Criteria criteria) {
        if (criteria == null) {
            return false;
        }

        return criteria.getCriteriaMap().entrySet().stream().allMatch(
                entry -> CriteriaValidatorFactory.getInstance()
                        .getValidator(entry.getKey())
                        .isCriteriaValid(entry.getValue()));
    }

}