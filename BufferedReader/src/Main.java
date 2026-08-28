import java.io.BufferedReader;
import java.util.*;
import java.io.*;

public class Main {
    private static BufferedReader reader;
    public static void main(String[] args) {
        String configFile = "ConfigFile";
        BufferedReader br = null;
        try{
            reader = new BufferedReader(new BufferedReader(congFile));
            String className = reader.readLine();
            if(className == null || className.equals(" ")) {
                System.out.println(configFile + "is empty");
                return;
            }
            className = className.substring(className.lastIndexOf(".")
            System.out.println(className);
             Class <?> reportClass = null;
             try {
                 reportClass = Class.forName(className);
             }catch(Class)
             }


        }
    }

}