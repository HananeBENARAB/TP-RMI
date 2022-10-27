package JavaRMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import common.EspeceImpl;
import common.IntAnimal;
import common.IntDossierSuivie;
import common.IntAnimal;
import common.IntEspece;

public class AnimalImp extends UnicastRemoteObject implements IntAnimal{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public String nom;
	public String nomMaitre;
	public String race;
	public IntDossierSuivie DossierSuivie;
	public IntEspece Espece;
	
	
	

    public AnimalImp() throws RemoteException {}
		
	
	public AnimalImp (String nom,String nomMaitre,String race,String nomEspece, int DureeVie, String suivi) throws RemoteException {
		this.nom = nom;
		this.nomMaitre = nomMaitre;
		this.race = race;
		this.DossierSuivie=new DossierSuivieImpl(suivi);
		Espece =new EspeceImpl(nomEspece,DureeVie); }
	

	public AnimalImp(String nom2, String nomMaitre2, IntEspece espece2, String race2, String suivi) throws RemoteException {
		
		this.nom = nom;
		this.nomMaitre = nomMaitre;
		this.race = race;
		this.DossierSuivie=new DossierSuivieImpl(suivi);
		Espece =new EspeceImpl();
	}


	public String getNom() {
		return nom;
	}
	
	public String getNomDuMaitre() {

		return nomMaitre;
	}


	public String getRace() {
		return race;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setNomMaitre(String nomMaitre) {
		this.nomMaitre = nomMaitre;
	}


	public void setRace(String race) {
		this.race = race;
	}


	public void setInterfaceDossierSuivie(IntDossierSuivie DossierSuivie) {
		this.DossierSuivie = DossierSuivie;
	}



public IntDossierSuivie getDossierSuivi() throws RemoteException {
	return this.DossierSuivie;
}
	
public void setDossierSuivi(IntDossierSuivie DossierSuivie) throws RemoteException {
	this.DossierSuivie=DossierSuivie;
	}


public void setSuivi(String suivi) throws RemoteException {
	DossierSuivie.setSuivi(suivi);
}

public String getSuivi() throws RemoteException {
	return DossierSuivie.getSuivi();
}


public IntEspece getEspece() throws RemoteException{
	return Espece;
}

public void setEspece(String Espece) throws RemoteException{
	this.Espece.setNomEspece(Espece);
}

public boolean Verif(String nomAnimal) throws RemoteException {
       return getNom().equals(nom);
}
}


	
	
	
	
	


