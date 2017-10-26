package by.tc.task02.dao.read;

import javax.swing.text.html.HTML;
import java.util.Stack;

/**
 * Created by Y50-70 on 27.10.2017.
 */
public class TagStack {
    Stack<String> tagStack;
    public TagStack(){
        tagStack = new Stack<>();
    }

    public void push(String str){
        tagStack.add(str);
    }
    public String pop(){
        return tagStack.pop();
    }

}
