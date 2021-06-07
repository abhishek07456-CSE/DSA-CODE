package JAVA.FILE_HANDLING;

import java.io.IOException;

public class SystemConsoleRead {
    public static void main(String[] args) throws IOException {
        int i  = System.in.read();
        System.out.println(i);
    }
}
