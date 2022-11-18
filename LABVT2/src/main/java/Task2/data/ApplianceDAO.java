package Task2.data;

import Task2.entity.Appliance;
import Task2.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceDAO {
    List<Appliance> find(Criteria criteria) throws DaoException;

    boolean add(String applianceName, Appliance appliance) throws DaoException;
}
