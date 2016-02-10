import java.rmi.*;
import java.rmi.registry.*;
public class SecondClient {
	public static void main(String[] args){
		try{
			if(args.length < 1){
				System.out.println("Usage : java HelloClient <rmi registry host>");
				return;
			}
			String host = args[0];
			Registry registry = LocateRegistry.getRegistry(host);
			Hello h = (Hello) registry.lookup("Hello1");
			Second s = (Second) registry.lookup("second");
			
			Person p = new Person("Jean", "Dupont");
			String res = h.sayHello();
			System.out.println(res);
			String res2 = s.sayHi(10, h, p);
			System.out.println(res2);
		}catch(Exception e){
			System.err.println("Error on client : "+e);
		}
	}
}
