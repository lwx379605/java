package rmi.common.infc;


import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ISay extends Remote{
	public String say(String name) throws RemoteException;
}
