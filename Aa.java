import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class ProcessDemo {

   public static void main(String[] args) {
      try {
         ProcessBuilder pb = new
            ProcessBuilder("cal", "2022");
         final Process p=pb.start();
         BufferedReader br=new BufferedReader(
            new InputStreamReader(
               p.getInputStream()));
               BufferedWriter bw=new BufferedWriter(
                  new FileWriter(new File("mycal2022.txt")));
                  String line;
                  while((line=br.readLine())!=null){
                     bw.write(line);
                  }
                  bw.close();
      } catch (Exception ex) {
         System.out.println(ex);
      }
   }
}
