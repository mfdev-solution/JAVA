package ex123;
public class Hello {
    
    public static void main(String[] args) {

        //System.out.println("Hello world !");
        if(args.length!=0){
            int i = 0;
            while (i<args.length) {
                
                System.out.println("Hello "+args[i]);
                i++;
            }
        
        }

        else
            //si aucun argument n'est renseigne une erreur va se produire a l'execution
            //le controle permet de dejouer cette erreure
            System.out.println("aucun argument en entre");
    }
}
