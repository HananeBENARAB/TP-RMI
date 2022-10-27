package JavaRMI;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import common.IntAnimal;
import common.IntCabinet;


public class serveur {
	
public serveur() {}

	public static void main(String[] args) throws AlreadyBoundException{

		try {
			
			IntCabinet cabinet=new CabinetImpl();
			
			//IntAnimal Animal=new AnimalImp();
			
			Registry registry = LocateRegistry.createRegistry(1096);
	
			
			    if (registry == null)
				
				     System.err.println("Registry not found");
			
				else {
					
				 registry.bind("objCabinet", cabinet);
					
					//registry.bind("objAnimal", Animal);
				
				// Mise en place du Gestionnaire du sécurité :
				String PATH = "C:\\\\Users\\\\Utilisateur\\\\eclipse-workspace\\\\server\\\\bin\\\\JavaRMI";
						
				System.setProperty( "java.security.policy",PATH);
				SecurityManager securityManager = new SecurityManager();
	         	System.setSecurityManager(securityManager);
				
				System.err.println("Server is ready");}
		}
			    catch (RemoteException e) {
			
			    e.printStackTrace();
		}
	}
}

