package by.tc.task02.service;

import by.tc.task02.entities.ComplexEntity;
import by.tc.task02.service.impl.ServiceImpl;

/**
 * Created by Y50-70 on 25.10.2017.
 */
public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private final EntityService entityService = new ServiceImpl();

    private ServiceFactory(){}

    public EntityService getEntityService(){
        return entityService;
    }
    public static ServiceFactory getInstance(){
        return instance;
    }
}

