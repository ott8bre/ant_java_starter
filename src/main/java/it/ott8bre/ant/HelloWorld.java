package it.ott8bre.ant;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

/**
 * An Ant HelloWorld Class
 * @author Francesco
 *
 */
public class HelloWorld {
    static Logger logger = Logger.getLogger(HelloWorld.class);

    /**
     * a dummy main method
     * @param args
     */
    public static void main(String[] args) {
        BasicConfigurator.configure();
        logger.info("Hello World");          // the old SysO-statement
    }
}
