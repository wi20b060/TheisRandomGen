import com.sun.net.httpserver.HttpServer;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;

import java.io.IOException;
import java.net.URI;

public class Main {

    public static void main(String[] args) {
        System.out.println("Starting Server ...");
        ResourceConfig rc = new ResourceConfig().packages("org.theis");
        HttpServer server = JdkHttpServerFactory.createHttpServer(URI.create("http://localhost:8080/"), rc);
        System.out.println("Server has started!");
        try {
            System.in.read();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        server.stop(0);
        System.out.println("Server has stopped!");
    }

}
