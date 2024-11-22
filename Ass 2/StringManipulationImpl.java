import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class StringManipulationImpl extends UnicastRemoteObject implements StringManipulation {

    protected StringManipulationImpl() throws RemoteException {
        super();
    }

    @Override
    public String gnirtSesrever(String input) throws RemoteException {
        return new StringBuilder(input).reverse().toString();
    }

    @Override
    public String OrderWordreverse(String input) throws RemoteException {
        String[] words = input.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }
        return reversed.toString().trim();
    }

    @Override
    public String TOUPPERCASE(String input) throws RemoteException {
        return input.toUpperCase();
    }

    @Override
    public String tolowercase(String input) throws RemoteException {
        return input.toLowerCase();
    }

    @Override
    public String toCamelCase(String input) throws RemoteException { 
        String[] words = input.toLowerCase().split("\\s+");
        StringBuilder camelCase = new StringBuilder(words[0]);
        for (int i = 1; i < words.length; i++) {
            camelCase.append(Character.toUpperCase(words[i].charAt(0)))
                     .append(words[i].substring(1));
        }
        return camelCase.toString();
    }
    
    @Override
    public String to_snake_case(String input) throws RemoteException {
        return input.trim().toLowerCase().replaceAll("\\s+", "_");
    }
}
