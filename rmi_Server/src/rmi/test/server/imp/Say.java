package rmi.test.server.imp;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import rmi.common.infc.ISay;



public class Say extends UnicastRemoteObject implements ISay{

	protected Say() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static ISay getInstant() throws RemoteException{
		return new Say();
	}

	@Override
	public String say(String name) throws RemoteException{
		System.out.println("hello! "+name);
		return "hello! "+name;
	}

}
