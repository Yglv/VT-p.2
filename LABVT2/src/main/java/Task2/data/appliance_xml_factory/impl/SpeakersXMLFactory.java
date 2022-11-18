package Task2.data.appliance_xml_factory.impl;

import Task2.entity.Appliance;
import Task2.entity.Speakers;
import Task2.entity.criteria.SearchCriteria;
import Task2.data.constant.ApplianceTagName;
import Task2.data.appliance_xml_factory.ApplianceXMLFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
public class SpeakersXMLFactory extends ApplianceXMLFactory {

    @Override
    public Node createApplianceXML(Document document, Appliance appliance) {
        Speakers speakers = (Speakers) appliance;
        Element speakersElement = document.createElement(ApplianceTagName.SPEAKERS.name().toLowerCase().replace('_', '-'));

        speakersElement.appendChild(createElement(document, SearchCriteria.Speakers.PRICE.name(), speakers.getPrice()));
        speakersElement.appendChild(createElement(document, SearchCriteria.Speakers.POWER_CONSUMPTION.name(), speakers.getPowerConsumption()));
        speakersElement.appendChild(createElement(document, SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.name(), speakers.getNumberOfSpeakers()));
        speakersElement.appendChild(createElement(document, SearchCriteria.Speakers.CORD_LENGTH.name(), speakers.getCordLength()));
        return speakersElement;
    }
}
