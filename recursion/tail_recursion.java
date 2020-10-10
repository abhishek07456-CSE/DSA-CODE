public class tail_recursion {
    public static int fac(int a,int b){
        if(a==1)
        return b;
        System.out.println("before" + a);
        int k = fac(a-1,a*b);
        System.out.println("before" + a);
        return k;

    }
    public static void main(String[] args) {
        System.out.print(fac(5,1));
    }
}
