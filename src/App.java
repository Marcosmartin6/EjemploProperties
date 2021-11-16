import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        FileReader reader = new FileReader(".\\src\\configuracion.properties");
        Properties prop = new Properties();
        prop.load(reader);
        String nombre = prop.getProperty("nombre");
        String apellido = prop.getProperty("basededatos");
        System.out.println(nombre);
        System.out.println(apellido);
        prop.setProperty("nota", "notable");
        prop.store(new BufferedWriter(new FileWriter(".\\src\\configuracion.properties")), "Ejemplo Properties");
        //String servidor
    }
}
