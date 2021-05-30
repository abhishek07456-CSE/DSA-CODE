package JAVA.FILE_HANDLING;

import java.io.File;
import java.io.IOException;

public class READ {
    public static void main(String[] args) {
        File file = new File("data.txt");
        try{
           if(file.createNewFile())
             System.out.println("File Created Successfully");
        }catch(IOException e){
             System.out.println(e.getMessage());
        }
    }
}
