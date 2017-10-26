package by.tc.task02.dao.help;

/**
 * Created by Y50-70 on 27.10.2017.
 */
public class RegExpPatterns {
    public static final String OPEN_TAG = "(<([^\\?\\s/]+)\\s*((\\S+=\"[^\"]*\"\\s*)*)>)";
    public static final String CLOSE_TAG = "(</\\s*([^\\?\\s<]+)\\s*>)";
    public static final String XML_TAG = "(<?.+?>)";
    public static final String FINDER = "(<.*?>)|([^<]+)";
}
