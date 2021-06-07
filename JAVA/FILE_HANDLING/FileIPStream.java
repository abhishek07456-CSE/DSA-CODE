package JAVA.FILE_HANDLING;

import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

public class FileIPStream {
    public static void main(String[] args) {
        try{
         FileInputStream file = new FileInputStream(new File("JAVA/FILE_HANDLING/file_output_stream.txt"));
         int i ;
         long start = System.nanoTime();
         while((i = file.read())!= -1){
           System.out.print((char)i);
         }
         long end = System.nanoTime();
         System.out.println(end-start);

        }catch(IOException E){

        }finally{
        //   file.close();
        }
    }
}
