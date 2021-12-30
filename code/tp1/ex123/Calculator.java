package ex123;

public class Calculator {
    
    public static int somme(int tab[]){
        int somme = 0;
        for(int i=0;i<tab.length;i++)
            somme+=tab[i];
        return somme;
    }

    public static int produit(int[] tab){
        int produit = 1;
        for(int i=0;i<tab.length;i++)
            produit*=tab[i];

        return produit;
    }

    public static double moyenne(int[] tab){

        return somme(tab)/tab.length;
    }


    public static void main(String[] args) {
       //<question 1>
            int[] tab = {1, 23, 12, -4, 6, 89, 2};
            System.out.print("{");
            for(int i=0;i<tab.length;i++)
                System.out.print(i!=tab.length-1?tab[i]+",":tab[i]+"}");
            System.out.println();
        //< /question 1>

        //<question 2>
            System.out.println(somme(tab));
        //< /question 2>
        //<question 3.1>
            System.out.println(produit(tab));
        //< /question 3.1>

        //<question 3.2>
            System.out.println(moyenne(tab));
        //< /question 3.2>
    }
}
