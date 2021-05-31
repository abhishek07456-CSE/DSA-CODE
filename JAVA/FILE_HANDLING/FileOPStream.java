package JAVA.FILE_HANDLING;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileOPStream {
  public static void main(String[] args) {
      File file = new File("JAVA/FILE_HANDLING/file_output_stream.txt");
      try( FileOutputStream fo = new FileOutputStream(file,true)){
        if(!file.exists()) file.createNewFile();
        String data = "hello we are introducing this feature\n";
        byte[] bs = data.getBytes();
        fo.write(bs,1,bs.length-1);
        // FileDescriptor fd = fo.getFD();
        System.out.println(bs.toString());
      }catch(IOException e){
         System.out.println(e.getMessage());
      }
  }
}
