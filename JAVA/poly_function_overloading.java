public class poly_function_overloading {
    static int sum(int a ,int b){
        System.out.println("int type called");
        return a+b;
    }
    static String sum(String a ,String b){
        System.out.println("String type called");
        return a+b;
    }
    static int sum(int a ,int b,int c ){
        return  a + b;
    }
    public static void main(String[] args) {
       System.out.println(poly_function_overloading.sum('a', 1,1));
    }
}
