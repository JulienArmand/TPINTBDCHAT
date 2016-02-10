import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

public class HelloServer {
	public static void main(String [] args){
		try{
			HelloImpl h = new HelloImpl("Hello World !");
			Hello h_stub = (Hello) UnicastRemoteObject.exportObject(h, 0);
			Registry registry = LocateRegistry.getRegistry();
			registry.bind("Hello1", h_stub);
			System.out.println("Server ready");
		} catch(Exception e){
			System.err.println("Error on server : "+e);
			e.printStackTrace();
		}
	}
}
