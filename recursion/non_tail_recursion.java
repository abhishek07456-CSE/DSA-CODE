public class non_tail_recursion {
    static public int fac(int n){
        if(n==1)
        return 1;
        System.out.println("before" + n);
        int k = n*fac(n-1);
        System.out.println("after" + n);
        return k;
     
    }

    /*
  1 * f(1)
  -------
   2 * f(2)
    ---
    3* f(3)
    ----
    4* f(4)
     ---
     f(5)

    */
    public static void main(String[] args) {
        System.out.print(fac(5));
    }
}
