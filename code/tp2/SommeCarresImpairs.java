public class SommeCarresImpairs {
    public static void main(String[] args) {
        int nbr=-1;
        try {
            if (args.length !=0 &&(nbr = Integer.parseInt(args[0]))!=0 )
            {           
                int sommeCarre=0;
                while (nbr>0) 
                {
                    if(nbr%2!=0)
                        sommeCarre += Math.pow(nbr,2) ;
                        nbr--;
                }
                System.out.println("la somme des carres impaires :  compris entre 0 et "+args[0]+" : "+sommeCarre);
            }
            else
            {
                System.out.println("aucun argument n'est renseigne");
            }
        } 
        catch (Exception e) 
        {   
            System.out.println("Veillez entrer un argument valide");
        }
    }
}
