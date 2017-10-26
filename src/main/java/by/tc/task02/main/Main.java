package by.tc.task02.main;

import by.tc.task02.entities.ComplexEntity;
import by.tc.task02.service.EntityService;
import by.tc.task02.service.ServiceFactory;

/**
 * Created by Y50-70 on 25.10.2017.
 */
public class Main {
    public static void main(String[] args){
        ComplexEntity root;

        ServiceFactory factory = ServiceFactory.getInstance();

        EntityService entityService = factory.getEntityService();

        root = entityService.parseXml();
    }
}
