
//Peut etre tete doit etre un truc vide qui pointe par tete.suivant sur le premier, et n'est pas le premier lui meme
class EnsembleListeEntiers implements EnsembleEntiers{
	int element;
	EnsembleListeEntiers suivant;
	
	public EnsembleListeEntiers(){
		tete = new EnsembleListeEntiers;
	}
	
	public EnsembleListeEntiers(int elem){
		tete = new EnsembleListeEntiers;
		tete.element = elem;
	}
	
	void ajoute(int elem){
		nouveau = new EnsembleListeEntiers(elem);
		nouveau.suivant = tete.suivant;
		tete.suivant = nouveau;		
	}
	
	void supprime(int elem){
		if(tete.suivant.element == elem){				//Traitement du cas ou on doit supprimer la tete
			tete.suivant = tete.suivant;
		}
		else{
			while(courant.element != elem && courant.suivant != null){
				EnsembleListeEntiers dernier = courant;
				EnsembleListeEntiers courant = courant.suivant;
			}
			if(courant.suivant == null){
				if(courant.element != elem){	//Cas ou on a pas trouvé un element à supprimer
					throw new Exception("Entier "+entier+" non trouvé");
				}
				else{							//Cas ou on doit supprimer le dernier element de la liste chainee
					dernier.suivant = null;
				}
			}
			else{
				dernier.suivant = courant.suivant;	//Suppression d'un element pas dans les extremités de la liste
			}
		}
		
		
	}
	
	
}