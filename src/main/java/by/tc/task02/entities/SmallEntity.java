package by.tc.task02.entities;

import java.io.Serializable;
import java.util.Map;
import java.util.HashMap;
/**
 * Created by Y50-70 on 25.10.2017.
 */
public class SmallEntity extends Entity {
    String content;
    public SmallEntity(){}
    public SmallEntity(String content){
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}