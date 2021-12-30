public class Palindrome {
    
    public static boolean palindInt(int[] tab){
        int i=0;
        int l = tab.length/2;
        while(i<l && tab[i]==tab[tab.length-i-1]){
            i++;
        }
        if(i<l )
            return false;
        else
            return true;
    }
    public static boolean palindString(String str){
        int i=0;
        int l = str.length()/2;
        while(i<l && str.charAt(i)==str.charAt(str.length()-i-1)){
            i++;
        }
        if(i<l )
            return false;
        else
            return true;
    }
    public static void main(String[] args) {
        int[] tab = {5,2,3,3,2,5};
        System.out.println(" is this tab a palidrome "+(palindInt(tab)?"Yes":"No"));
        if(args.length != 0){
            System.out.println(" is "+args[0]+" a palidrome "+(palindString(args[0])?"Yes":"No"));
        }
        else
            System.out.println("Aucun argument n'est passe en parametre");
    }
}
