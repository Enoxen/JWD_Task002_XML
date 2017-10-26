package by.tc.task02.entities;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Y50-70 on 26.10.2017.
 */
public class Entity {
    private String name;
    private int depth;
    private Map<String, String> attributes = new HashMap<>();

    public Entity(){}
    public Entity(String name, int depth, Map<String, String> attributes){
        this.name = name;
        this.depth = depth;
        this.attributes = attributes;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }
}
