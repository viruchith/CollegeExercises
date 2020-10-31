// To copy content of one file to another using FileInputStream and FileOutputStream
import java.io.*;

class CopyFile{

    String inputFile,outputFile;

    CopyFile(String inputFile , String outputFile){
        this.inputFile = inputFile;
        this.outputFile = outputFile;
    }

    protected void copy(){
        String content="";

        try{
            FileInputStream fis=new FileInputStream(inputFile);
            FileOutputStream fos = new FileOutputStream(outputFile);
            int i=0;
            while((i=fis.read())!=-1){
                content+=String.valueOf((char)i);
            }
            fis.close();
            byte[] contentBytes = content.getBytes();
            fos.write(contentBytes);
            fos.close();
            System.out.println("File Copied Successfully.");
          }catch(Exception e){
              System.out.println(e);

          }
    }


}
public class CopyFileTo
{
        public static void main(String[] args) {

            CopyFile cf = new CopyFile("input.txt","output.txt");
            cf.copy();
        }
}

