import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class StringServer {
    public static void main(String[] args) {
        try {
            StringManipulationImpl obj = new StringManipulationImpl();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("StringManipulation", obj);
            System.out.println("Server is ready.");
        } catch (Exception e) {
            System.out.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}