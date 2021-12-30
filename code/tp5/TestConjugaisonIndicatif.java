import java.util.Arrays;
import java.util.Scanner;

public class TestConjugaisonIndicatif {
    

    public static void main(String[] args) {
        
        String help = "-java TestConjugaisonIndicatif –v verbeAConjuguer : Dans ce cas, le "+
        "\ndonnera en sortie la conjugaison du verbe spécifié dans tous les temps (passé, futur, etc.)"+
        "\n-java TestConjugaisonIndicatif –v verbeAConjuguer –t tempsDeConjugaison : Dans ce\n"+
        "cas, le programme donnera en sortie la conjugaison du verbe au temps spécifié. L’option\n"+
        "« -t » ne pourra prendre que les valeurs « présent », « passé », « imparfait » et « futur ».\n"+
        "-java TestConjugaisonIndicatif : Dans ce cas, le programme demande à l’utilisateur le\n"+
        "verbe qu’il souhaite conjuguer puis le temps de conjugaison. La validation de ces\n"+
        "informations devra se faire et si l’utilisateur ne met rien pour le temps, on considère que\n"+
        "la conjugaison se fera sur tous les temps.\n"+
        "-java TestConjugaisonIndicatif –h devront fournir en sortie l’aide du programme qui\n"+
        "donne les instructions sur l’utilisation du programme. Cette aide devrait aussi être\n"+
        "affichée à chaque fois que les options « -v » ou « -t » sont fournies avec une valeur\nincorrecte.\n";
        
        Scanner scanner = new Scanner(System.in);
        ConjugaisonIndicatif  conjugaisonIndicatif;
        if(args.length>0){
            if(args.length==2){//<tous les temps>
                if(args[0].toLowerCase().equals("-v")){    
                    conjugaisonIndicatif = new ConjugaisonIndicatif(args[1]);
                    conjugaisonIndicatif.present();
                    conjugaisonIndicatif.passe();
                    conjugaisonIndicatif.futur();
                    conjugaisonIndicatif.imparfait();
                }else
                    System.out.println(help);
            }//</tous les temps>
            //<temps indique en parametre>
             else if(args.length == 4&&args[0].toLowerCase().equals("-v")&&args[2].toLowerCase().equals("-t") ){
                conjugaisonIndicatif = new ConjugaisonIndicatif(args[1]);
                switch (args[3]) {
                    case "present":
                        conjugaisonIndicatif.present();
                        break;
                    case "passe":
                        conjugaisonIndicatif.passe();
                        break;
                    case "futur":
                        conjugaisonIndicatif.futur();
                        break;
                    case "imparfait":
                        conjugaisonIndicatif.imparfait();
                        break;
                    default:
                        System.out.println("le temps indique n'est pas valide");
                        break;
                }
                
            }//</temps indique en parametre>
            else if(!args[0].toLowerCase().equals("-v")|| !args[2].toLowerCase().equals("-t")){
                System.out.println(help);
                System.out.println("you need help");
            }
           else if (args.length==1){
                if(args[0].equals("-h")){
                    System.out.println(help);
                    System.out.println("you need help");
                }
                else
                    System.out.println("argument invalide");
    
                
            }
         }
        else{//<aucun argument>
            // System.out.println("aucun argument dons pas de conjugaison");
            System.out.println("Rendeigner le verbe à conjuguer");
            String verbe =  scanner.next();
            //System.out.println("Renseigner le temps ");
            String temps = "" ;
            String[] tTemps = {"present","passe","futur","imparfait"};
            do {
                System.out.println("Renseigner le temps ");
                temps = scanner.next();
            } while (!Arrays.toString(tTemps).contains(temps)&&!temps.equals("rien"));
            conjugaisonIndicatif = new ConjugaisonIndicatif(verbe);
            switch (temps) {
                case "present":
                    conjugaisonIndicatif.present();
                    break;
                case "passe":
                    conjugaisonIndicatif.passe();
                    break;
                case "futur":
                    conjugaisonIndicatif.futur();
                    break;
                case "imparfait":
                    conjugaisonIndicatif.imparfait();
                    break;
                case "rien":
                    conjugaisonIndicatif.present();
                    conjugaisonIndicatif.passe();
                    conjugaisonIndicatif.futur();
                    conjugaisonIndicatif.imparfait();
                    break;
                default:
                    System.out.println("le temps indique n'est pas valide");
                    break;
            }
        }//<aucun argument>
        scanner.close();
    }

    
}
