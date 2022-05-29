package entreprise;

import java.util.HashMap;


public class Entreprise {
	private String nomEntreprise ; 
 HashMap<Integer, Salarie> listeSal;
	public Entreprise() {
		listeSal = new HashMap<Integer, Salarie>();
	}
public Entreprise(String nomEntreprise) {
	super();
	this.nomEntreprise = nomEntreprise;
}
public String getNomE() {
	return nomEntreprise;
}
public void setNomE(String nomEntreprise) {
	this.nomEntreprise = nomEntreprise;
}

@Override
public String toString() {
	return "entreprise [nomE=" + nomEntreprise + ", liste=" + listeSal + "]";
}
}
