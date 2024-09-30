
// methords of exception

public class New {
    public static void main(String[] args) {
        int x = 20;
        int y = 0;

        try{
            int z = x/y;
            System.out.println(z);
        }
        catch (Exception e){

          e.printStackTrace();
        }


    }
}
