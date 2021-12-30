package src;
import java.util.Scanner;
public class Cadenes_5{
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        
        //Definim variables i demanem una cadena
        int numbers = 0;
        System.out.print("Introdueix una cadena: ");
        String phrase = in.nextLine();
        
        //Per cada car�cter mira si �s un n�mero i �s suma en una temporal
        for (int i=0; i<phrase.length(); i++) {
        	if (phrase.charAt(i)>'1' && phrase.charAt(i)<'9') {
        		int temp = phrase.charAt(i)-48;
        		numbers += temp;
        	}
        }
        //Output
        System.out.println("La suma dels números apareguts és: "+numbers);
    }
}
