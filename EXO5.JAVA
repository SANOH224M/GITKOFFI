// Ecrire un programme qui demande un nombre compris entre 10 et 20, jusqu’à ce que la réponse 
// convienne. En cas de réponse supérieure à 20, on fera apparaître un message : « Plus petit ! », et 
// inversement, « Plus grand ! » si le nombre est inférieur à 10.
import java.util.*;
class EXO5
{
    public static void main (String args[])
    {
        Scanner clavier= new Scanner (System.in);
        int a;
     do{
        System.out.print(" donner un nombre compris entre 10 et 20 ");
        a = clavier.nextInt();
        if(a > 20)  System.out.print(" Plus petit ! ");
        else if( a < 10) System.out.print(" Plus grand ! ");
     }while( a < 10 || a > 20); 
     System.out.print(" felicitation vous avez saisi la bonne valeur " + a);      


        clavier.close();
    }
}