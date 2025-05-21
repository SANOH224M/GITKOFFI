//  Ecrire un programme qui demande à l’utilisateur un nombre compris entre 1 et 3 jusqu’à ce que 
// la réponse convienne. 
import java.util.*;
class EXO4
{
    public static void main (String args[])
    {
        Scanner clavier= new Scanner (System.in);
        int a;

     do{
        System.out.print(" donner un nombre compris entre 1 et 3 ");
        a = clavier.nextInt();
     }while( a < 1 || a > 3);
     System.out.print(" felicitation vous avez saisi la bonne valeur " + a);      
        
        clavier.close();
    }
}
