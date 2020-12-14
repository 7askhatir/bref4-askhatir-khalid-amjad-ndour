package bref4;

import java.util.ArrayList;

public class Lecteur extends Person {
     private String prénom;
     private int N;

     
    
	public String getPrénom() {
		return prénom;
	}
	public void setPrénom(String prénom) {
		this.prénom = prénom;
	}
	public int getN() {
		return N;
	}
	public void setN(int n) {
		N = n;
	}
	public void Ajouter(Lecteur L,ArrayList<Lecteur> LecteurL) {
		LecteurL.add(L);
	}
	public void Modifier(int I , Lecteur L, ArrayList<Lecteur> LecteurL ) {
		int cmp=0;
		for(int i=0 ;i<LecteurL.size();i++) {
			if(LecteurL.get(i).getIdentifiant()==I) {
				LecteurL.get(i).setIdentifiant(L.getIdentifiant());
				LecteurL.get(i).setN(L.getN());
				LecteurL.get(i).setPrénom(L.getPrénom());
				LecteurL.get(i).setMail(L.getMail());
				LecteurL.get(i).setIdFidélité(L.getIdFidélité());
				LecteurL.get(i).setNom(L.getNom());
				System.out.print("été Modifier");
				cmp++;
			}
		}
		if(cmp==0) System.out.print("Votre Id n'existe Pas");	
	}
	public void Supprimer(int I, ArrayList<Lecteur> LecteurL) {
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
	public void Rechercher(int I, ArrayList<Lecteur> LecteurL) {
		int cmp=0;
		for(int i=0 ;i<LecteurL.size();i++) {
			if(LecteurL.get(i).getIdentifiant()==I) cmp++;
		}
		if(cmp==0) System.out.print("Votre Id n'existe Pas");
		else System.out.print("Votre Id trouve " +cmp+ "fois");
	}
	public void affiche(ArrayList<Lecteur> LecteurL) {
		int cmp=0;
		for(int i=0;i<LecteurL.size();i++)System.out.print("ID :" + LecteurL.get(i).getIdentifiant() + "Nome :"+LecteurL.get(i).getNom() +"prénom :"+ LecteurL.get(i).getPrénom() +"numéro téléphone :"+ LecteurL.get(i).getN()+ " mail :"+LecteurL.get(i).getMail() + "carte de fidélité:" +LecteurL.get(i).getIdFidélité() +"\n");cmp++;
		System.out.print("le nombre total des lecteurs :"+cmp);
		
	}
	
	
}
