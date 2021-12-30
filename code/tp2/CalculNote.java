
import java.util.Scanner;


public class CalculNote {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("le nombre de notes ?");
        int nbr = sc.nextInt();
        int[] notes = new int[nbr];
        int i = 0;
        int min = 20 , max = 0 , somme=0;
        while (i < nbr){
            System.out.println("note N° "+(i+1));
            notes[i] = sc.nextInt();
            if (notes[i]>=0 && notes[i]<=20){
                if(min>notes[i])
                    min=notes[i];
                if(max<notes[i])
                    max=notes[i];
                somme+=notes[i];
                i++;
            }
        }
        System.out.println("min = "+min+
                           " max = "+max+
                           " moyenne = "+(double)(somme/notes.length));
        sc.close();
    }
}
