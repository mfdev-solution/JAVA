import java.util.Scanner;
public class Devine {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int inf = 0;
        // int sup = 0;
        int nbDevine =(int)( Math.random()*100);
        System.out.println(nbDevine);
        int nb = 0;
        do {
            System.out.print("Est-ce ? ");
            nb = sc.nextInt();
            
            if(nb>nbDevine)
                System.out.println("moins");
            if(nb<nbDevine)
                System.out.println("plus");
        } while (nb!=nbDevine);
        sc.close();
    }
}
