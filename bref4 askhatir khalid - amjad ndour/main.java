package bref4;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		ArrayList<Livre> livre=new ArrayList<Livre>();
		ArrayList<Lecteur> L=new ArrayList<Lecteur>();
		ArrayList<Bienfaiteur> LL=new ArrayList<Bienfaiteur>();


		while(true) {
			System.out.println("1-Livre\n2-Lecteur\n3- Bienfaiteur ");
			Scanner in=new Scanner(System.in);
			int x=in.nextInt();
			switch(x) {
			case 1:
				   System.out.println("1-Ajouter un livre\r\n"+ 
				   		"2-Modifier un livre \r\n"  + 
				   		"3-Supprimer un livre \r\n " + 
				   		"4-Rechercher un livre (selon l’identifiant)\r\n" + 
				   		"5-Lister des livres et afficher le nombre total des livres disponibles");
                   int z=in.nextInt();
                   switch(z) {
                   case 1: System.out.println("Donner ID");
					       int y=in.nextInt();
					       System.out.println("Donner title");
					       String titre=in.next();
					       System.out.println("Donner édition");
					       String édition=in.next();
					       System.out.println("Donner bienfaiteur");
					       String bienfaiteur=in.next();
					       System.out.println("Donner date édition");
					       int date=in.nextInt();
					       Livre Livre1=new Livre(y, date, titre, édition, bienfaiteur);
					       livre.add(Livre1);
					       break;
                   case 5:  for (int i = 0; i < livre.size(); i++) {
                       System.out.println("ID :"+livre.get(i).identifiant +" Title : "+livre.get(i).titre+" édition :"+livre.get(i).édition+ " bienfaiteur : "+livre.get(i).bienfaiteur +" date édition :"+livre.get(i).date_édition+"\n");
                   }
                   if(livre.size()==0) System.out.println("la liste des livre et vide");
                   break;
                   case 2:System.out.println("Donner ID");
			             int y1=in.nextInt();
			             for (int i = 0; i < livre.size(); i++) {
			            	 if(livre.get(i).identifiant==y1) {
			            		 System.out.println("Donner nv title");
							     String titre1=in.next();
							     System.out.println("Donner édition");
							     String édition1=in.next();
							     System.out.println("Donner bienfaiteur");
							     String bienfaiteur1=in.next();
							     System.out.println("Donner date édition");
							     int date1=in.nextInt();
							     livre.get(i).titre=titre1;
							     livre.get(i).édition=édition1;
							     livre.get(i).bienfaiteur=bienfaiteur1;
							     livre.get(i).date_édition=date1;
							     
			            	 }
			             }
			             break;
                   case 3:System.out.println("Donner ID");
		                  int y2=in.nextInt();
		                  int t=0;
		                  for (int i = 0; i < livre.size(); i++) {
		                	  if(livre.get(i).identifiant==y2) {
		                		   livre.remove(i);
		                		   t=1;
				            	 }
		                  }
		                  if(t==0) System.out.println("cette livre n'existe pas");
		                  else System.out.println("cette livre a ete suprimer");
                          break;
                   case 4:System.out.println("Donner ID");
	                     int y3=in.nextInt();
	                     int cmp=0;
	                     for (int i = 0; i < livre.size(); i++) {
		                	  if(livre.get(i).identifiant==y3) {
		    
		                		   cmp++;
				            	 }
		                  }
	                     if(cmp==0) System.out.println("cette livre n'existe pas");
		                  else System.out.println("cette livre a ete existe "+cmp+" fois");
	                  
                   }
				   

			       
			case 2:  Lecteur  Lecteur=new Lecteur();
				System.out.println("1-Ajouter un lecteur\r\n"+ 
			   		"2-Modifier un lecteur \r\n"  + 
			   		"3-Supprimer un lecteur \r\n " + 
			   		"4-Rechercher un lecteur (selon l’identifiant)\r\n" + 
			   		"5-Lister des lecteur et nbr totale disponibles");
               int w=in.nextInt();
               switch(w) {
               case 1:System.out.print("donner id");
                     Lecteur.setIdentifiant(in.nextInt());
                     System.out.print("donner nom");
                     Lecteur.setNom(in.next());
                     System.out.print("donner prenom");
                     Lecteur.setPrénom(in.next());
                     System.out.print("numéro téléphone");
                     Lecteur.setN(in.nextInt());
                     System.out.print("Email");
                     Lecteur.setMail(in.next());
                     System.out.print("ID fidélité");
                     Lecteur.setIdFidélité(in.nextInt());
                     Lecteur.Ajouter(Lecteur,L);
                     break;
               case 2:System.out.print("donner id");
                      int z1=in.nextInt();
                      Lecteur L1=new Lecteur();
                      System.out.print("donner nom");
                      L1.setNom(in.next());
                      System.out.print("donner prenom");
                      L1.setPrénom(in.next());
                      System.out.print("numéro téléphone");
                      L1.setN(in.nextInt());
                      System.out.print("Email");
                      L1.setMail(in.next());
                      System.out.print("ID fidélité");
                      L1.setIdFidélité(in.nextInt());
                      Lecteur.Modifier(z1, L1, L);
                      break;
               case 3:System.out.print("donner id");
                      int z2=in.nextInt();
                      Lecteur.Supprimer(z2, L);
                      break;
               case 4:System.out.print("donner id");
                      int z3=in.nextInt();
                      Lecteur.Rechercher(z3, L);
                      break;
               case 5:Lecteur.affiche(L);
                      break;
               }
			case 3:Bienfaiteur  Bienfaiteur=new Bienfaiteur();
				System.out.println("1-Ajouter un Bienfaiteur\r\n"+ 
			   		"2-Modifier un Bienfaiteur \r\n"  + 
			   		"3-Supprimer un Bienfaiteur \r\n " + 
			   		"4-Rechercher un lecteur (selon l’identifiant)\r\n" + 
			   		"5-Lister des lecteur et nbr totale disponibles");
               int m=in.nextInt();
               switch(m) {
               case 1:System.out.print("donner id");
                     Bienfaiteur.setIdentifiant(in.nextInt());
                     System.out.print("donner nom");
                     Bienfaiteur.setNom(in.next());
                     System.out.print("Email");
                     Bienfaiteur.setMail(in.next());
                     System.out.print("ID fidélité");
                     Bienfaiteur.setIdFidélité(in.nextInt());
                     Bienfaiteur.Ajouter(Bienfaiteur,LL);
                     break;
               case 2:System.out.print("donner id");
                      int z1=in.nextInt();
                      System.out.print("donner nom");
                      Bienfaiteur.setNom(in.next());
                      System.out.print("Email");
                      Bienfaiteur.setMail(in.next());
                      System.out.print("ID fidélité");
                      Bienfaiteur.setIdFidélité(in.nextInt());
                      Bienfaiteur.Modifier(z1, Bienfaiteur, LL);
                      break;
               case 3:System.out.print("donner id");
                      int z2=in.nextInt();
                      Bienfaiteur.Supprimer(z2, LL);
                      break;
               case 4:System.out.print("donner id");
                      int z3=in.nextInt();
                      Bienfaiteur.Rechercher(z3, LL);
                      break;
               case 5:Bienfaiteur.affiche(LL);
                      break;
			       
			}
		}
	}

	

	}
}
