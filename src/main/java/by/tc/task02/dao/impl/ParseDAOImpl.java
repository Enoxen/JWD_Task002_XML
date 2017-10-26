package by.tc.task02.dao.impl;

import by.tc.task02.dao.EntityDAO;
import by.tc.task02.dao.read.Parser;
import by.tc.task02.entities.ComplexEntity;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by Y50-70 on 25.10.2017.
 */
public class ParseDAOImpl implements EntityDAO {

    private Scanner reader = new Scanner(
            new InputStreamReader(ParseDAOImpl.class.getResourceAsStream("/resources.xml")));

    public ComplexEntity parseXml(){
        Parser parser = new Parser();
        String line;
        while (reader.hasNext()){
            line = reader.nextLine();
            parser.parse(line);
        }
        //парсинг xml файла
        return null;
    }
}
