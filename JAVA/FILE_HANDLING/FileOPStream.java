package JAVA.FILE_HANDLING;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileOPStream {
  public static void main(String[] args) {
      File file = new File("JAVA/FILE_HANDLING/file_output_stream.txt");
      try( FileOutputStream fo = new FileOutputStream(file)){
        if(!file.exists()) file.createNewFile();
        String data = "hello \n we are introducing this feature";
        byte[] bs = data.getBytes();
        fo.write(bs);
        System.out.println(bs.toString());
      }catch(IOException e){
         System.out.println(e.getMessage());
      }
  }
}
