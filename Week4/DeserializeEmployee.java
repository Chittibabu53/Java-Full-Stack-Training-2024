import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeEmployee {
    public static void main(String[] args) {
        Serialization emp = null;

        try (FileInputStream fileIn = new FileInputStream("employee.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            emp = (Serialization) in.readObject();
        } catch (IOException | ClassNotFoundException i) {
            i.printStackTrace();
        }

        System.out.println("Deserialized Employee: " + emp);
    }
}
