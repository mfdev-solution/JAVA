package exercice1;

import java.util.Scanner;

public class TestPersonne {
    
    public static Personne initPersonne(Scanner sc){
        String firstName = setFirstName(sc);
        String lastName  = setSecondName(sc);
        int     age      = setAge(sc);
        String  sexe     = setSexe(sc);

        return new Personne(firstName,lastName,age,sexe);

    }
    public static String setFirstName(Scanner sc){
        System.out.println("votre nom : \t");
        String name = sc.next();
        return name;
    }
    public static String setSecondName(Scanner sc){
        System.out.println("votre prenom : \t");
        String prenom = sc.next();
        return prenom;
    }
    public static int setAge(Scanner sc){
        int age=0;
        do{

            System.out.println("votre age : \t");
            age = sc.nextInt();
        }while(age<=0 || age >=130);
        return age;

    }
    public static String setSexe( Scanner sc){
        String sexe= "";
        do{

            System.out.println("votre sexe : \t");
            sexe = sc.next();
        }while((!(sexe.toUpperCase().equals("FEMININ")))&&(!(sexe.toUpperCase().equals("MASCULIN"))));
        return sexe;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Personne person = initPersonne(in);
        
        System.out.println(person.toString());

    }
}
