package Task2.data.appliance_matcher.impl;

import Task2.entity.Appliance;
import Task2.entity.Speakers;
import Task2.entity.criteria.SearchCriteria;
import Task2.data.constant.ApplianceTagName;
import Task2.data.appliance_matcher.ApplianceMatcherFactory;

public class SpeakersMatcher extends ApplianceMatcherFactory {
    @Override
    public boolean isMatchesCriteria(Appliance appliance, String criteriaName, Object value) {
        Speakers speakers = (Speakers) appliance;

        return switch (SearchCriteria.SpeakersWithPriceFilter.valueOf(criteriaName)) {
            case MORE_THAN_CURRENT_PRICE -> speakers.getPrice() > (double) value;
            case LESS_THAN_CURRENT_PRICE -> speakers.getPrice() < (double) value;
            case PRICE, EQUAL_CURRENT_PRICE -> speakers.getPrice() == (double) value;
            case NAME -> ApplianceTagName.SPEAKERS.equals(value);
            case POWER_CONSUMPTION -> (double) value == speakers.getPowerConsumption();
            case NUMBER_OF_SPEAKERS -> (int) value == speakers.getNumberOfSpeakers();
            case CORD_LENGTH -> (double) value == speakers.getCordLength();
        };
    }
}
