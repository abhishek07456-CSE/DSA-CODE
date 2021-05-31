package JAVA.FILE_HANDLING;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterStream {
  public static void main(String[] args) {
    File file = new File("JAVA/FILE_HANDLING/file_output_stream.txt");
    try(
      FileWriter fw = new FileWriter(file,true);
      BufferedWriter bw = new BufferedWriter(fw)
     ){
      if(!file.exists()) file.createNewFile();
      String data = "helloqqq we are introducing this feature\n";
      bw.write(data);
      // System.out.println(bs.toString());
    }catch(IOException e){
       System.out.println(e.getMessage());
    }
  }
}
