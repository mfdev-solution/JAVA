
public class Addition {
    
    public static void main(String[] args) {
        if(args.length>0 ){
            if(args.length == 2){
                int a=0,b=0;
                try {
                    a = Integer.parseInt(args[0]);
                    b = Integer.parseInt(args[1]);
                } catch (Exception e) {
                    return;
                }
                System.out.println(a+" + "+b+" = "+(a+b));
            }else
            {
                System.out.println("veillez renseigner deux argument entiers");
            }
        }
        else{
            System.out.println("aucun argument");
        }
    }
}