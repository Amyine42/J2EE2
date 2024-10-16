package ma.emsi.soap_server.server;

import jakarta.xml.ws.Endpoint;
import ma.emsi.soap_server.webService.ProductWebService;

public class serverWS {
    public static void main(String[] args) {
        String url = "http://0.0.0.0/8088/";
        Endpoint.publish(url, new ProductWebService());
        System.out.println(url + " deployed");
    }
}
