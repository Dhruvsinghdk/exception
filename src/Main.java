

class A{
    void show() throws Exception {                   // exception in this function only
        for (int i = 1; i <=10; i++) {
            if(i==5){
               Thread.sleep(2000);

            }

            System.out.println(i);
        }
    }
}

public class Main {
    public static void main(String[] args) throws Exception {            // declare exception here also
        A n = new A();
        n.show();
    }
}
