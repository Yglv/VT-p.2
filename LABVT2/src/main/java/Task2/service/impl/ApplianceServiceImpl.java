package Task2.service.impl;

import Task2.data.ApplianceDAO;
import Task2.data.DAOFactory;
import Task2.data.DaoException;
import Task2.service.ServiceException;
import Task2.service.constant.ServiceExceptionMessage;
import Task2.service.validation.Validator;
import Task2.entity.Appliance;
import Task2.entity.criteria.Criteria;
import Task2.service.ApplianceService;

import java.util.List;

public class ApplianceServiceImpl implements ApplianceService {

    @Override
    public List<Appliance> find(Criteria criteria) throws ServiceException {
        if (!Validator.isCriteriaValid(criteria)) {
            throw new ServiceException(ServiceExceptionMessage.INVALID_CRITERIA_EXCEPTION_MSG.getMessage());
        }

        List<Appliance> appliances;
        try {
            DAOFactory factory = DAOFactory.getInstance();
            ApplianceDAO applianceDAO = factory.getApplianceDAO();
            appliances = applianceDAO.find(criteria);
        } catch (DaoException e) {
            throw new ServiceException(e);
        }
        return appliances;
    }

    @Override
    public boolean add(String applianceName, Appliance appliance) throws DaoException, ServiceException {
        if (applianceName.isEmpty() || appliance == null) {
            throw new ServiceException(ServiceExceptionMessage.INVALID_CRITERIA_EXCEPTION_MSG.getMessage());
        }

        boolean isApplianceAdded;
        try {
            DAOFactory factory = DAOFactory.getInstance();
            ApplianceDAO applianceDAO = factory.getApplianceDAO();
            isApplianceAdded = applianceDAO.add(applianceName, appliance);
        } catch (DaoException e) {
            throw new ServiceException(e);
        }
        return isApplianceAdded;
    }

}
