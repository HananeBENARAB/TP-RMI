package JavaRMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import common.IntDossierSuivie;


public class DossierSuivieImpl extends UnicastRemoteObject implements IntDossierSuivie{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public String suivi;
	

	public DossierSuivieImpl() throws RemoteException{}

	
	public DossierSuivieImpl(String suivi) throws RemoteException {
	}


	public String getSuivi() throws RemoteException {
		
		 return suivi;
	}
	
	public void setSuivi(String suivi) throws RemoteException {
		this.suivi=suivi;
	}
	}
	
	






 

