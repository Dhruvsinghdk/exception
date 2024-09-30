


public class Runtime {
    public static void main(String[] args) {
        int x[] = {1,2,3};
        int y = 0;


       try{
           int z = x[3];
           System.out.println(z);
       }
       catch (Exception e){
           System.out.println(e.getMessage());
           System.out.println("Error..");
       }
//        System.out.println("Not continue");
    }
}