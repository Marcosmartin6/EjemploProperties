import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class xml {
    public static void main(String[] args) {

        FileInputStream reader;
        try {
            Properties prop = new Properties();
            reader = new FileInputStream(".\\src\\configuracionxml.xml");

            prop.loadFromXML(reader);
            String nombre = prop.getProperty("nombre");
            System.out.println(nombre);
            reader.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
