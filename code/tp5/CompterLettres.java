import java.util.Scanner;

public class CompterLettres {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer le mot");
        String mot = scanner.next();
        
        int i = 0 ;
        String letExist="";
        while(i<mot.length()){
            if(letExist.contains(String.valueOf(mot.charAt(i)))){
                i++;
                continue;
            }else{
                int counter = 0;
                for(int j = 0;j<mot.length();j++){
                    counter += mot.charAt(i) == mot.charAt(j)?1:0; 
                }
                System.out.println(counter+" fois la lettre "+mot.charAt(i));
                letExist+=mot.charAt(i);
                i++;
            }
        }
        scanner.close();
    }
}
