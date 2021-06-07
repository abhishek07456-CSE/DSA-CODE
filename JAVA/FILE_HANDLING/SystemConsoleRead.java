package JAVA.FILE_HANDLING;

import java.io.IOException;
import java.util.Scanner;

public class SystemConsoleRead {
    public static String pureNumber(int n){
        StringBuilder st = new StringBuilder();
        while (n > 0) {
            n--;
            if (n % 2 == 0)
                st.append("4");
            else
                st.append("5");

            n /= 2;
        }
        String s = st.toString();
        st.reverse();
        st.append(s);
        return st.toString();
    }
    public static void main(String[] args) throws IOException {
        // int i  = System.in.read();
        Scanner s = new Scanner(System.in);
        System.out.println(pureNumber(7));
    }
}
