import java.rmi.*;
import java.rmi.server.*;

public class SecondImpl implements Second {
	public SecondImpl(){super();}
	public String sayHi(int c, Hello o, Person p) throws RemoteException{
		return p.toString() + "says "+ o.sayHello() +" "+c+" times !";
	}

}
