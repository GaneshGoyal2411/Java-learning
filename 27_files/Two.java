import java.io.FileWriter;
import java.io.IOException;

public class Two{
    public static void main(String[] args) {
        try{
            FileWriter myWriter = new FileWriter("Filename.txt");
            myWriter.write("File in java might be Tricky, but have fur too");
            myWriter.close();
            System.out.println("Successfull wrote the file");
        }
        catch(IOException e){
            System.out.println("An error accured");
            e.printStackTrace();
        }
    }
}