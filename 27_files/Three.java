import java.io.File;
// import java.io.FileNotFoundException;
// import java.io.IOException;
// import java.util.Scanner;
/*// --------------Read a File------------------------
public class Three{
    public static void main(String args[]){
        try{
            File myObj = new File("Filename.txt");
            Scanner myReader = new Scanner(myObj);
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }
        catch(FileNotFoundException e){
            System.out.println("An error accured");
            e.printStackTrace();
        }
    }
}

// ------------Get File Information----------------------*/
/*
public class Three{
    public static void main(String args[]){
        File myObj = new File("Filename.txt");
        if(myObj.exists()){
            System.out.println(myObj.getName());
            System.out.println(myObj.getAbsolutePath());
            System.out.println(myObj.canWrite());
            System.out.println(myObj.canRead());
            System.out.println(myObj.length());
        }
        else{
            System.out.println("File doesn't exist.");
        }
    }
} */

//---------------- Java Delete Files-------------------------
/*
public class Three{
    public static void main(String[] args) {
        File myObj = new File("Filename.txt");
        if(myObj.delete()){
            System.out.println("Deleted the file"+myObj.getName());
        }
        else{
            System.out.println("Failed to delete the file");
        }
    }
} */
//------------------------- Delete a Folder---------------------------
public class Three{
    public static void main(String[] args) {
        File myObj = new File("Delete");
        if(myObj.delete()){
            System.out.println("Folder deleted :"+myObj.getName());
        }
        else{
            System.out.println("Folder not deleted");
        }
    }
}