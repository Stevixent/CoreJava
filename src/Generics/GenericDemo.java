package Generics;

public class GenericDemo{
    public <M> M display(M val){
      return val;
    };

    public static void main(String[] args) {
        GenericDemo ment = new GenericDemo();
        System.out.println("String: " + ment.display("John"));
        System.out.println("Integer: " + ment.display(10));
    }
}
