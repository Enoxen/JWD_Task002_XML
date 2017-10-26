package by.tc.task02.entities;

import java.util.List;

/**
 * Created by Y50-70 on 25.10.2017.
 */
public class ComplexEntity extends Entity {
    List<Entity> complexEntityList;
    public ComplexEntity(){
    }
    void add(Entity obj){
        complexEntityList.add(obj);
    }



}

