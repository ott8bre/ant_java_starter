package it.ott8bre.ant;

import org.apache.log4j.Logger;

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
        logger.info(new HelloWorld().greet());
    }
    
    public String greet(){
    	return "Hello World";
    }
}
