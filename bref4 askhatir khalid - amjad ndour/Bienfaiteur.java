package bref4;

import java.util.ArrayList;

public class Bienfaiteur extends Person{
	
	
	
	
	
	public void Ajouter(Bienfaiteur L,ArrayList<Bienfaiteur> LecteurL) {
		LecteurL.add(L);
	}
	
	public void Modifier(int I , Bienfaiteur L, ArrayList<Bienfaiteur> LecteurL ) {
		int cmp=0;
		for(int i=0 ;i<LecteurL.size();i++) {
			if(LecteurL.get(i).getIdentifiant()==I) {
				LecteurL.get(i).setIdentifiant(L.getIdentifiant());
				LecteurL.get(i).setMail(L.getMail());
				LecteurL.get(i).setIdFidélité(L.getIdFidélité());
				LecteurL.get(i).setNom(L.getNom());
				System.out.print("été Modifier");
				cmp++;
			}
		}
		if(cmp==0) System.out.print("Votre Id n'existe Pas");	
	}
	public void Supprimer(int I, ArrayList<Bienfaiteur> LecteurL) {
		int cmp=0;
		for(int i=0 ;i<LecteurL.size();i++) {
			if(LecteurL.get(i).getIdentifiant()==I) {
				LecteurL.remove(LecteurL.get(i));
				System.out.print("été suprimer");
				cmp++;
			}
		}
		if(cmp==0) System.out.print("Votre Id n'existe Pas");
	}
	public void Rechercher(int I, ArrayList<Bienfaiteur> LecteurL) {
		int cmp=0;
		for(int i=0 ;i<LecteurL.size();i++) {
			if(LecteurL.get(i).getIdentifiant()==I) cmp++;
		}
		if(cmp==0) System.out.print("Votre Id n'existe Pas");
		else System.out.print("Votre Id trouve " +cmp+ "fois");
	}
	public void affiche(ArrayList<Bienfaiteur> LecteurL) {
		int cmp=0;
		for(int i=0;i<LecteurL.size();i++)System.out.print("ID :" + LecteurL.get(i).getIdentifiant() + "Nome :"+LecteurL.get(i).getNom()  + " mail :"+LecteurL.get(i).getMail() + "carte de fidélité:" +LecteurL.get(i).getIdFidélité() +"\n");cmp++;
		System.out.print("le nombre total des Bienfaiteur :"+cmp);
		
	}

}
