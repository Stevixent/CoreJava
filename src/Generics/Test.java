package Generics;

public class Test<X,Y> {
   // int num = 20;
    private X first;
    private Y second;
    public Test(X a1, Y a2){
        first = a1;
        second = a2;
    }

    //public void run(){return num;};
    //public String run(){return "num";};
    //public int run(){return num;};

    public static void main(String[] args) {




















































































































































        Test<String , Integer> ment = new Test<>("John",10);
        System.out.println("String: " + ment.first );
        System.out.println("Integer: " + ment.second );
    }
}