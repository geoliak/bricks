import java.util.*;

class Essai_Scanner {
    public static void main(String [] args) {
        Scanner my_scanner;
        String ligne;
        boolean read_int = false;

        my_scanner = new Scanner(System.in);
        
        //boucle infinie
        while(read_int == false){
        	try{
                System.out.println("Saisissez une ligne");
                
        		int integer = my_scanner.nextInt();
        		System.out.println("Vous avez saisi l'entier : " + integer);
        		read_int = true;
        	}        
    catch(InputMismatchException d){
    	System.out.println("Vous devez saisir un entier");}
    catch(NoSuchElementException s){
    	System.out.println("Aucune ligne saisie");}
        }
    }
}