package edu.escuelaing.arep;
import java.net.Socket;

public class typeObject {
    public static genObject build(ContentType type, Socket clientSocket){
        switch(type){
            case html:
                return new ObjectHtml(clientSocket);
            case jpg :
                return new ObjectImg(clientSocket,type);
        }

        return null;
    }
}
