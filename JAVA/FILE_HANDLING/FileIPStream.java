package JAVA.FILE_HANDLING;

import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

public class FileIPStream {
    public static void main(String[] args) {
        try{
         FileInputStream file = new FileInputStream(new File("F:\\Abhishek Chaudhary.pdf"));
         int i ;
         while((i = file.read())!= -1){
           System.out.print((char)i);
         }
        }catch(IOException E){

        }finally{
        //   file.close();
        }
    }
}
