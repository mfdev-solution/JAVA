import java.util.Arrays;
import java.util.Scanner;

public class ConjugaisonIndicatif {
    
    private String verbe;
    public String voyelles = "aouieh";
    // private Pronoms[] pronoms = Pronoms.values() ;
    // //= {Pronoms.Je,Pronoms.Tu,Pronoms.Il,Pronoms.Elle,Pronoms.Nous,Pronoms.Vous,Pronoms.Ils,Pronoms.Elles}; 
    // private TerminaisonPresent[] terminaisonPresent = TerminaisonPresent.values();
    // private TerminaisonPasse[] terminaisonPasse = TerminaisonPasse.values();
    // private TerminaisonFutur[] terminaisonFutur = TerminaisonFutur.values();
    // private TerminaisonImparfait[] terminaisonImparfait = TerminaisonImparfait.values();

    private String[] pronoms ={"Je","Tu","Il","Elle","Nous","Vous","Ils","Elles"} ;
    //= {Pronoms.Je,Pronoms.Tu,Pronoms.Il,Pronoms.Elle,Pronoms.Nous,Pronoms.Vous,Pronoms.Ils,Pronoms.Elles}; 
    private String[] terminaisonPresent ={"e","es","e","e","ons","ez","ent","ent"};
    private String[] terminaisonPasse ={"ai","as","a","a","âmes","âtes","èrent","èrent"};
    private String[] terminaisonFutur = {"erai","eras","era","era","erons","erez","eront","eront"};
    private String[] terminaisonImparfait = {"ais","ais","ait","ait","ions","iez","aient","aient"};
    /**
     * construteur a un parametre
     * @param verbe
     */
    public ConjugaisonIndicatif(String verbe){
        setVerbe(verbe);
    }
    public String getVerbe(){
        return this.verbe;
    }
    
    public String[] getPronoms() {
        return pronoms;
    }

    public String[] getTerminaisonPresent() {
        return terminaisonPresent;
    }

    public String[] getTerminaisonPasse() {
        return terminaisonPasse;
    }

    public String[] getTerminaisonFutur() {
        return terminaisonFutur;
    }

    public String[] getTerminaisonImparfait() {
        return terminaisonImparfait;
    }

    /*
     * cette fonction permet de d'assigner une valeur a l'attribut verbe
     * @param verbe de type String
     * 
     */
    public void setVerbe(String verbe) {
        if(verbe.substring(verbe.length()-2, verbe.length()).toLowerCase().equals("er")&&(!verbe.toLowerCase().equals("aller"))){
            if(voyelles.contains(verbe.substring(0,1)))
                this.pronoms[0]="j'";
            this.verbe = verbe;
        }
        else if(verbe.toLowerCase().equals("aller")){
            System.out.println(" le verbe aller n'est pas un verbe su premier groupe");
            System.exit(0);
        }
        else{
            System.out.println("terminaison incorrect "+verbe.substring(verbe.length()-2, verbe.length()));
            System.exit(0);
        }
    }
    public void present(){
        System.out.println("\t\t\t\t\t\tconjugaison du verbe "+this.getVerbe()+" au present de l'indicatif\n");
        for (int i=0;i<this.getPronoms().length;i++) {
           String pronom = this.getPronoms()[i];
           String term = this.getTerminaisonPresent()[i];
           System.out.println("\t\t\t\t\t\t\t\t"+pronom+" "+this.getVerbe().substring(0,this.getVerbe().length()-2)+term);
        }
        System.out.println();
    }
    public void passe(){
        System.out.println("\t\t\t\t\t\tconjugaison du verbe "+this.getVerbe()+" au passe de l'indicatif\n");
        for (int i=0;i<this.getPronoms().length;i++) {
           String pronom = this.getPronoms()[i];
           String term = this.getTerminaisonPasse()[i];
           System.out.println("\t\t\t\t\t\t\t\t"+pronom+" "+verbe.substring(0,verbe.length()-2)+term);
        }
        System.out.println();
    }
    public void futur(){
        System.out.println("\t\t\t\t\t\tconjugaison du verbe "+this.getVerbe()+" au futur de l'indicatif\n");
        for (int i=0;i<this.getPronoms().length;i++) {
           String pronom = this.getPronoms()[i];
           String term = this.getTerminaisonFutur()[i];
           System.out.println("\t\t\t\t\t\t\t\t"+pronom+" "+verbe.substring(0,verbe.length()-2)+term);
        }
        System.out.println();
    }
    public void imparfait(){
        System.out.println("\t\t\t\t\t\tconjugaison du verbe "+this.getVerbe()+" au imparfait de l'indicatif\n");
        for (int i=0;i<this.getPronoms().length;i++) {
           String pronom = this.getPronoms()[i];
           String term = this.getTerminaisonImparfait()[i];
           System.out.println("\t\t\t\t\t\t\t\t"+pronom+" "+verbe.substring(0,verbe.length()-2)+term);
        }
        System.out.println();
    }

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
