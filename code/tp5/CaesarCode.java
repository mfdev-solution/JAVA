public class CaesarCode {
    

    public static String decrypter(String message,int cle ){
        String messageDecrypte = " ";
        String specialCaracts = " ,.';!?!\0\"";
        cle = (Integer)(cle/25)>=1?cle%25:cle;
        for(int i=0;i<message.length();){
            if(specialCaracts.contains(String.valueOf(message.charAt(i)))){
                messageDecrypte+=String.valueOf(message.charAt(i));
                i++;
            }else{
                int codeCaract = (int)message.charAt(i);
                if((codeCaract>=65+cle&&codeCaract<=90)||(codeCaract>=97+cle&&codeCaract<=122)){
                    codeCaract-=cle;
                }else if(codeCaract>=65&&codeCaract<=65+cle){
                    codeCaract=90 + (codeCaract-65 ) -cle +1;
                }else if(codeCaract>=97&&codeCaract<=97+cle){
                    codeCaract=122 + (codeCaract-97 ) -cle +1;
                }
                messageDecrypte+=String.valueOf((char)codeCaract);
                i++;
            }
        }
        return messageDecrypte;
    }
    public static String crypter(String message,int cle){
        String messageCrypte = "";
        String specialCaracts = " ,.';!?!\0\"";
        cle = (Integer)(cle/25)>=1?cle%25:cle;
        for(int i=0;i<message.length();){
            if(specialCaracts.contains(String.valueOf(message.charAt(i)))){
                messageCrypte+=String.valueOf(message.charAt(i));
                i++;
                
            }else{
                int codeCaract = (int)message.charAt(i);
                if((codeCaract >= 65&& codeCaract <= 90-cle)||(codeCaract >= 97&&codeCaract <=122-cle)){
                    codeCaract+=cle;
                }
                else if((codeCaract > 90-cle && codeCaract <=90)){
                    codeCaract= 64 + cle -( 90 - codeCaract) ;
                }else if((codeCaract > 122-cle && codeCaract <=122)){
                    codeCaract = 96 + cle - (122 - codeCaract);
                }
                messageCrypte+=String.valueOf((char)codeCaract);
                i++;
            }
        }
        return messageCrypte;
    }
    public static void main(String[] args) {
        
        String help = "-java CaesarCode –c messageACrypter –k clé pour crypter un message avec la clé"+
        "spécifiée\n-java CaesarCode –d messageADecrypter –k clé pour décrypter un message avec la clé"+
        "spécifiée\n NB : L’option « -k » devra être optionnelle et prendra la valeur « 13 » si elle n’est\n"+
        " pas spécifiée.L’une des options « -c » ou « -d » doit impérativement être présente pour qu’un cryptage\n"+
        "CaesarCode --help devront fournir en sortie l’aide du programme qui donnera des instructionssur comment l’utiliser.";
        // int cle = 6;
        // String message = "abcdefghijklmnopqrstuvwxyz".toUpperCase();
        // System.out.println(message+" => "+crypter(message,cle));
        // System.out.println("\n");
        // System.out.println(crypter(message,cle)+" => "+decrypter(crypter(message,cle),cle));

        if(args.length>=1){
            if(args.length==4){
                int cle = 0;
                try {
                    cle =Integer.parseInt(args[3]);
                } catch (Exception e) {
                    System.out.println("la cle ' "+args[3]+" ' doit etre entiere");
                    System.exit(-1);
                }
                if(args[2].equals("-k")){

                    if(args[0].equals("-c")){
                        System.out.println(crypter(args[1],cle));
                    }else if(args[0].equals("-d")){
                        System.out.println(decrypter(args[1],cle));
                    }else{
                        System.out.println("l'argument '"+args[0]+"' de cryptage n'existe pas!:\nsoit -c pour crypter \nsoit -d pour decrypter ");
                    }
                }else{
                    System.out.println("L'argument ' "+args[2]+" ' de la cle doit etre -k");
                }
            }else if(args.length==2){
                if(args[0].equals("-c")){
                    System.out.println(crypter(args[1],13));
                }else if(args[0].equals("-d")){
                    System.out.println(decrypter(args[1],13));
                }else{
                    System.out.println("l'argument '"+args[0]+"' de cryptage n'existe pas!");
                }

            }else if(args.length==1){
                if(args[0].equals("-h")||args[0].equals("--help")){
                    System.out.println(help);
                }else{
                    System.out.println("pour avior de l'aide taper :java CaesaarCode -help ou java CaesarCode --help");
                }

            }else{
                System.out.println(help);
            }

        }else{
            System.out.println("aucun argument");
            System.out.println(help);
        }

        
        
    }
}
