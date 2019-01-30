package tp1;

import java.util.Arrays;

public class CV {

	String nom;
	 String prenom;
	 String formation;
	 int annee;
	 String[] competence;
	 String attente;
		
	

	public CV(String nom2, String prenom2, String formation2, int annee2, String[] competence2, String attente2) {
		// TODO Auto-generated constructor stub
		nom = nom2;
		prenom = prenom2;
		formation = formation2;
		annee = annee2;
		competence = competence2;
		attente = attente2;
	}

	 static String[] compet = {"JAVA","C#","SQL"} ;
	
	 static CV pascal = new CV("Raymond", "Pascal", "Etudiant" , (int) 0.5, compet , "Un prof qui explique clairement le cours/but de celui-ci" );
	 static CV yassine = new CV("Choujaaaa", "Yassine", "Etudiant" , (int) 0,compet, "Aucune" );
	
	 public void affiche() {
			
			System.out.println("____________CV____________");
			System.out.println("Nom: "+ nom);
			System.out.println("Prenom: "+ prenom);
			System.out.println("Formation: "+ formation);
			System.out.println("Nombre d'annee d'experience: "+ annee);
			System.out.println("Competence: "+ Arrays.toString(competence));
			System.out.println("Attentes vis a vis au cours: "+ attente);
			System.out.println();
		}
	 
}
