package JAVA.OOPS.Inheritence;

public class MethodOverriding {
  public static void main(String[] args) {
      child c = new child();
      c.method();
  }
}

class Parent{
    public static int a = 1;
    Parent(){
        System.out.println("parent cosn called");
    }
   static void method2(){
        System.out.println("Parent Method called" + a);
    }
}
class child extends Parent{
    public static int a = 2;
    static void method(){
        System.out.println("child Method called" + a);
    }
}