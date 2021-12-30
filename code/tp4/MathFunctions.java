import java.util.Scanner;

class MathFunctions {
    static Scanner sc = new Scanner(System.in);
    //1) Remplire les elements d'un tableau
    public static int [] saisir(int[] t){
        System.out.println("le nombre d'elements ?");
        int nbr = sc.nextInt();
        t = new int[nbr];
        int i = 0;
        while (i < nbr){
            System.out.println("element N° "+(i+1));
            t[i] = sc.nextInt();
                i++;
        }
        return t;
    }
    //2 sommer les elements d'un tableau
    public static int somme(int[] t){
        int somme =0;
        for(int i=0;i<t.length;i++){
            somme+= t[i];
        }
        return somme;
    }
    //3 rechercher le maximun
    public static int maximun(int[] t){
        int max=0;
        for (int i=0;i<t.length;i++){
            max= t[i]>max?t[i]:max;
        }
        return max;
    }
    //3 bus min
    public static int minimum(int[] t ){
        int min=0;
        for (int i=0;i<t.length;i++){
            min= t[i]<min?t[i]:min;
        }
        return min;
    }
    //4difference entre le min et le max
    public static int delta(int[] t){
       return maximun(t) - minimum(t);

    }
    //5 tri des elements
    public static void tri(int[] t){
    for(int i =0;i<t.length;i++)
        for (int j=0;j<t.length-i-1;j++)
            if (t[j]>t[j+1]){
                int tmp = t[j];
                t[j]=t[j+1];
                t[j+1]=tmp;
            }
    }

    //6 egalite de tableaux
    public static boolean egalite(int[] t1 , int[] t2){
        int i =0;
        while (i<t1.length&&t1[i]==t2[i]){
            i++;
        }
        return i==t1.length;
    }
    //7 egalite de tableau a tailles differentes

    public static boolean equivalence(int[] t1, int[] t2){
        int i =0;
        boolean bool =false;
        while ((i<t1.length&&i<t2.length)&&t1[i]==t2[i]){
            i++;
        }
        if(i==t1.length)
            bool =true;
        if (i==t2.length)
            bool =true;
        return bool;
    }

    //8 test des fonctions
    
    public static void main(String[] args) {
        int[] t ={};
        t = saisir(t);
        System.out.println(somme(t));
    }
}