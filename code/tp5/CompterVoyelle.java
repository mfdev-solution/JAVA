import java.util.Scanner;

public class CompterVoyelle  {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String voyelles = "aeiouy";
        System.out.println("Entrer le mot");
        String mot = scanner.next();
        for (int i=0;i<voyelles.length();i++){
            int counter = 0;
            for(int j=0;j<mot.length();j++){
                if(mot.charAt(j)==voyelles.charAt(i)){
                    counter++;
                }
            }
            System.out.println(counter+" fois la lettre "+voyelles.charAt(i));

        }
        scanner.close();
    }
}
