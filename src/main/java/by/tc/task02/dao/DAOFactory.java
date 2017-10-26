package by.tc.task02.dao;

import by.tc.task02.dao.impl.ParseDAOImpl;

/**
 * Created by Y50-70 on 25.10.2017.
 */
public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();

    private final EntityDAO entityDAO = new ParseDAOImpl();

    private DAOFactory(){}
    public EntityDAO getEntityDAO(){
        return entityDAO;
    }
    public static DAOFactory getInstance(){
        return instance;
    }
}
