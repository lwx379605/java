package rmi.test.client;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import rmi.common.infc.ISay;



public class CliMain {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			System.setProperty("java.security.policy",CliMain.class.getResource("/client.policy").toString());
			System.setSecurityManager(new java.rmi.RMISecurityManager()); 	
			ISay cli = (ISay)Naming.lookup("rmi://192.168.0.103:8888/sub");
			System.out.println(cli.say("limincheng"));
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
