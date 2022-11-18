package Task2.service;

import Task2.data.DaoException;
import Task2.entity.Appliance;
import Task2.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceService {

    List<Appliance> find(Criteria criteria) throws DaoException, ServiceException;

    boolean add(String applianceName, Appliance appliance) throws DaoException, ServiceException;

}
