public class Tri {
    
    /**
     * Soit l la longueur du tableau t 
     * Pour i allant de 0 à l-1 :
     *  Pour j allant de 1 à l-i-1 :
     *      si t[j]<t[j+1] 
     *          permuter les deux valeurs.
     */
    public static void bubble(int[] tab){
        for(int i =0;i<tab.length;i++)
            for (int j=0;j<tab.length-i-1;j++)
                if (tab[j]>tab[j+1]){
                    int tmp = tab[j];
                    tab[j]=tab[j+1];
                    tab[j+1]=tmp;
                }
    }
    public static void printTab(int[] tab){
        System.out.print("{");
            for(int i=0;i<tab.length;i++)
                System.out.print(i!=tab.length-1?tab[i]+",":tab[i]+"}");
            System.out.println();
    }

    public static void main(String[] args) {
        
        int[] tab = {1, 23, 12, -4, 6, 89, 2};
        printTab(tab);
        bubble(tab);
        System.out.println("Apres tri");
        printTab(tab);

    }
}