import java.net.URI;

import javax.websocket.ContainerProvider;
import javax.websocket.WebSocketContainer;


public class WebSocket356ClientMain {

 

    public static void main(String[] args) {

     

        try {

 

            String dest = "ws://localhost:8080/Sample/jsr356toUpper";

            ToUpper356ClientSocket socket = new ToUpper356ClientSocket();

            WebSocketContainer container = ContainerProvider.getWebSocketContainer();

            container.connectToServer(socket, new URI(dest));

 

            socket.getLatch().await();

            socket.sendMessage("hi this is srinivas");

            socket.sendMessage("hello this venky");

            Thread.sleep(100000l);

 

        } catch (Throwable t) {

            t.printStackTrace();

        }

    }

}
