import java.io.File;
import java.i0.IOException;

public class One{
    public static void main(String[] args) {
        try{
            File myObj = new File("Filename.txt");
            if(myObj.createNewFile()){
                System.out.println("File created: "+myObj.getName());
            }
            else{
                System.out.println("File already exist");
            }
        }
        catch(java.io.IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}