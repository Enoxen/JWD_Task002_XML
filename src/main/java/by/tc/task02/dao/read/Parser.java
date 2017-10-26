package by.tc.task02.dao.read;

import static by.tc.task02.dao.help.RegExpPatterns.*;
import by.tc.task02.entities.Entity;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Y50-70 on 26.10.2017.
 */
public class Parser {
    private Stack<Entity> stack = new Stack<>();
    private TagStack tagStack = new TagStack();
    private Pattern pattern;
    private Matcher matcher;
    public Parser(){}

    public void parse(String line){
        pattern = Pattern.compile(XML_TAG);
        matcher = pattern.matcher(line);

    }

}

