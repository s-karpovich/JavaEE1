package by.tut.mdcatalog.web;

import by.tut.mdcatalog.services.Result;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //System.out.println( "Hello World!" );
        final Logger logger = LogManager.getLogger(App.class);
        Result result = new Result();
        logger.info(result.getSumm("e:/testFile.txt"));
        logger.debug(result.getSumm("e:/testFile.txt"));
    }
}
