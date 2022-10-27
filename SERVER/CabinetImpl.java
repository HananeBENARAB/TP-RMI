package JavaRMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

import common.IntCabinet;
import common.IntAnimal;
import common.IntEspece;

public class CabinetImpl extends UnicastRemoteObject implements IntCabinet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<IntAnimal> listAnimals;
	
	public CabinetImpl() throws RemoteException {
	
			this.listAnimals = new ArrayList<IntAnimal>();
		}
	
	public IntAnimal recherche(String nomAnimal) throws RemoteException {
		for (IntAnimal animal : listAnimals) {
			if (animal.Verif(nomAnimal)) {
				System.out.println(nomAnimal + " Trouvé ! ");
				return animal;
			}
		}
		   System.out.println("Animal introuvable");
		return new AnimalImp();
	}
	
	public boolean addAnimal(String nom, String NomMaitre, String NomEspece, int DureeVie, String race, String suivi) throws RemoteException {
		
			IntAnimal patient = new AnimalImp(nom, NomMaitre, NomEspece ,race, DureeVie, suivi);
			
			return listAnimals.add(patient);
			
			}
	
			
    public boolean addAnimal(String nom, String NomMaitre, IntEspece espece,String race, String suivi) throws RemoteException {
				
			IntAnimal patient = new AnimalImp(nom, NomMaitre, espece, race, suivi);
			
			return listAnimals.add(patient) ;}
			
	public String alertes() {
		if (listAnimals.size()==500 )
			return "vous avez atteint les 500 patients" ;
		else if (listAnimals.size()==1000)
			return "vous avez atteint les 1000 Patients";
		else if (listAnimals.size()==100)
			return "vous avez atteint les 100 patients";
		else if (listAnimals.size()==200)
			return "vous avez atteint les 200 patients";
	return null;
		
	

}

	}

			
		
	

	


