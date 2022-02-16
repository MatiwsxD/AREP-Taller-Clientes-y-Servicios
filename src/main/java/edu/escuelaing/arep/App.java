package edu.escuelaing.arep;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {

        httpServer server = new httpServer();
        server.start();
    }
}
