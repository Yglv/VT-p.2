package Task2.data.appliance_xml_factory.impl;

import Task2.entity.Appliance;
import Task2.entity.TabletPC;
import Task2.entity.criteria.SearchCriteria;
import Task2.data.constant.ApplianceTagName;
import Task2.data.appliance_xml_factory.ApplianceXMLFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class TabletPCXMLFactory extends ApplianceXMLFactory {
    @Override
    public Node createApplianceXML(Document document, Appliance appliance) {
        TabletPC tabletPC = (TabletPC) appliance;
        Element tabletPCElement = document.createElement(ApplianceTagName.TABLET_PC.name().toLowerCase().replace('_', '-'));

        tabletPCElement.appendChild(createElement(document, SearchCriteria.TabletPC.PRICE.name(), tabletPC.getPrice()));
        tabletPCElement.appendChild(createElement(document, SearchCriteria.TabletPC.BATTERY_CAPACITY.name(), tabletPC.getBatteryCapacity()));
        tabletPCElement.appendChild(createElement(document, SearchCriteria.TabletPC.DISPLAY_INCHES.name(), tabletPC.getDisplayInches()));
        tabletPCElement.appendChild(createElement(document, SearchCriteria.TabletPC.MEMORY_ROM.name(), tabletPC.getMemoryRom()));
        tabletPCElement.appendChild(createElement(document, SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.name(), tabletPC.getFlashMemoryCapacity()));
        tabletPCElement.appendChild(createElement(document, SearchCriteria.TabletPC.COLOR.name(), tabletPC.getColor()));
        return tabletPCElement;
    }
}
