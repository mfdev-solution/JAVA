public class Calcul {

    public static void main(String[] args) {
        if(args.length == 3  )
        {
            int b=0;
            int a=0;
            try {
                a = Integer.parseInt(args[0]);//nombre 1
                b = Integer.parseInt(args[2]);//nombre 2
            } catch (Exception e) {
                System.out.println("the first and the third argument must be Integer");
                return;
            }
            switch (args[1]) {
                case "+"://addition
                    System.out.println(a+b);
                    break;
                case "-":
                    System.out.println(a-b);
                    break;
                case "x":
                    System.out.println(a*b);
                    break;
                case "/":
                    System.out.println(a/b);
                    break;                
            
                default:
                    System.out.println(" the second argument must be +-/ or *");
                    break;
            }
        }
        else
        {
            System.out.println("argument incorrect : 3 arguments necessaires __ int char int");
        }
    }
}
