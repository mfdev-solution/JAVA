//exercice 2 
import java.util.Scanner;

public class Chaine
{ 
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String nom = new String();
      nom =  sc.next();
      //<une lettre sur deux>
        for(int i=0;i<nom.length();i++){
            if((i+1)%2!=0)
                System.out.print(nom.charAt(i));
        }
        System.out.println();
      //</une lettre sur deux>

      //<le premier et le dernier>
        System.out.println(nom.charAt(0)+" "+nom.charAt(nom.length()-1
      ));
      //</le premier et le dernier>
        sc.close();
  }
}