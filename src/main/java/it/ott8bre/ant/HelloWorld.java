package it.ott8bre.ant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * An Ant HelloWorld Class
 * @author Francesco
 *
 */
public class HelloWorld {
    static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);

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