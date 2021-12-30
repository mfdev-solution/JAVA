public interface Occ {
    
    public static void main(String[] args) {
        
        if(args.length != 0){
            int find = -1;
            String tmp = args[0];
            for(int i=0 ; i<args.length;i++){
                System.out.print(args[i]+" ");
                if (i!=0 && tmp.equals(args[i]))
                    find=1;
            }
            System.out.println(find== 1 ?"\nTrouve":"\nNon trouve");
        }
        else
            System.out.println("No argument");
    }
}
