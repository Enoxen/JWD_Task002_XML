package by.tc.task02.service.impl;

import by.tc.task02.dao.DAOFactory;
import by.tc.task02.dao.EntityDAO;
import by.tc.task02.entities.ComplexEntity;
import by.tc.task02.service.EntityService;

/**
 * Created by Y50-70 on 25.10.2017.
 */
public class ServiceImpl implements EntityService {
    @Override
    public ComplexEntity parseXml(){
        DAOFactory daoFactory = DAOFactory.getInstance();

        EntityDAO entityDAO = daoFactory.getEntityDAO();

        ComplexEntity root = entityDAO.parseXml();

        return root;
    }
}
