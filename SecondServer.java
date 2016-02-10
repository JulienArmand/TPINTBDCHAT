import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

public class SecondServer {

	public static void main(String[] args){
		try{
			HelloImpl h = new HelloImpl("Hello World !");
			//On appelle le port 0 car cela signifie qu'on utilise le premier port libre
			Hello h_stub = (Hello) UnicastRemoteObject.exportObject(h,0);
			SecondImpl s = new SecondImpl();
			Second s_stub = (Second) UnicastRemoteObject.exportObject(s,0);
			Registry registry = LocateRegistry.getRegistry();
			registry.bind("Hello1", h_stub);
			registry.bind("second", s_stub);
			System.out.println("Server ready");
			
		} catch(Exception e){
			System.err.println("Error on server : "+e);
			e.printStackTrace();
		}
		
	}
	
}
