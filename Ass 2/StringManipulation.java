import java.rmi.Remote;
import java.rmi.RemoteException;

public interface StringManipulation extends Remote {
    String gnirtSesrever(String input) throws RemoteException; //reverseString
    String OrderWordreverse(String input) throws RemoteException; //reverseWordOrder
    String TOUPPERCASE(String input) throws RemoteException; //toUpperCase
    String tolowercase(String input) throws RemoteException; //toLowerCase
    String toCamelCase(String input) throws RemoteException; //toCamelCase
    String to_snake_case(String input) throws RemoteException; //toSnakeCase
}