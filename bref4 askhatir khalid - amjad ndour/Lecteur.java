package bref4;

import java.util.ArrayList;

public class Lecteur extends Person {
     private String pr�nom;
     private int N;

     
    
	public String getPr�nom() {
		return pr�nom;
	}
	public void setPr�nom(String pr�nom) {
		this.pr�nom = pr�nom;
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
				LecteurL.get(i).setPr�nom(L.getPr�nom());
				LecteurL.get(i).setMail(L.getMail());
				LecteurL.get(i).setIdFid�lit�(L.getIdFid�lit�());
				LecteurL.get(i).setNom(L.getNom());
				System.out.print("�t� Modifier");
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
				System.out.print("�t� suprimer");
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
		for(int i=0;i<LecteurL.size();i++)System.out.print("ID :" + LecteurL.get(i).getIdentifiant() + "Nome :"+LecteurL.get(i).getNom() +"pr�nom :"+ LecteurL.get(i).getPr�nom() +"num�ro t�l�phone :"+ LecteurL.get(i).getN()+ " mail :"+LecteurL.get(i).getMail() + "carte de fid�lit�:" +LecteurL.get(i).getIdFid�lit�() +"\n");cmp++;
		System.out.print("le nombre total des lecteurs :"+cmp);
		
	}
	
	
}
