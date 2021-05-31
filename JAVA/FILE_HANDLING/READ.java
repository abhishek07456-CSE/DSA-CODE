package JAVA.FILE_HANDLING;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFilePermission;
import java.util.HashSet;
import java.util.Set;


public class READ {
    public static void main(String[] args) {
        String type = "CHECK_PERMISSION";
        File file = new File("JAVA/FILE_HANDLING/a.txt");
        try{
           if(type == "READ" && !file.exists() && file.createNewFile())
              System.out.println("File Created Successfully");
           else if(type == "DELETE"){
              System.out.println("File deleted Successfully");
              file.deleteOnExit();
           } else if(type== "CHECK_PERMISSION"){
              System.out.println("Absolute path : " + file.getAbsolutePath());
              System.out.println("File READ : " + file.canRead());
              System.out.println("File WRITE : " + file.canWrite());
           } else if(type == "SET_PERMISSION"){
              file.setExecutable(true,true);
              file.setWritable(true,true);
              file.setWritable(true, true);
           }
        }catch(IOException e){
             System.out.println(e.getMessage());
        }
    }
}
