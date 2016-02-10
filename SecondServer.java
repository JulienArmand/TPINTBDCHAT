import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

public class SecondServer {

	public static void main(String[] args){
		try{
			HelloImpl h = new HelloImpl("Hellow World !");
			Hello h_stub = (Hello) UnicastRemoteObject.exportObject(h, 0);
			
		} catch(Exception e){
			
		}
		
	}
	
}
