package Task2.service.impl;

import Task2.data.DaoException;
import Task2.data.constant.ApplianceTagName;
import Task2.entity.*;
import by.bsuir.task02.entity.*;
import Task2.entity.criteria.Criteria;
import Task2.entity.criteria.SearchCriteria;
import Task2.service.ApplianceService;
import Task2.service.ServiceException;
import Task2.service.ServiceFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ApplianceServiceImplTest {

    @Test
    public void find() {
        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        List<Appliance> appliances = new ArrayList<>();
        Appliance expectedAppliance = new Oven(200.0, 1500.0, 12.0, 33.0, 60.0, 45.0, 60.0);

        Criteria criteriaOven = new Criteria(ApplianceTagName.OVEN.name());
        criteriaOven.add(SearchCriteria.Oven.HEIGHT.name(), 45.0);
        criteriaOven.add(SearchCriteria.Oven.DEPTH.name(), 60.0);
        criteriaOven.add(SearchCriteria.Oven.POWER_CONSUMPTION.name(), 1500.0);

        try {
            appliances = service.find(criteriaOven);
        } catch (ServiceException | DaoException e) {
            e.printStackTrace();
        }

        Assert.assertEquals(expectedAppliance, appliances.get(0));
    }

    @Test
    public void add() {
        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        boolean isAdded = false;
        try {
            isAdded = service.add(ApplianceTagName.LAPTOP.name(), new Laptop(1000.0, 1000.0, OS.LINUX, 100.0, CPU.AMD_RYZEN_5_5600X, 13.6));
        } catch (DaoException | ServiceException e) {
            e.printStackTrace();
        }

        Assert.assertTrue(isAdded);
    }
}