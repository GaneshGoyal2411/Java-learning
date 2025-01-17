/*import java.util.Scanner;
public class One{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter your Username");
        double userName = myScanner.nextDouble();

        System.out.println("Username :"+userName);
    }
}*/

import java.util.Scanner;
public class One{
    public static void main(String[] args) {
        try{
        Scanner basicInfo = new Scanner(System.in);
        System.out.println("Inter your name, age and salary");

        System.out.println("Name ?");
        String name = basicInfo.nextLine();

        System.out.println("Age ?");
        int age = basicInfo.nextInt();

        System.out.println("Salary ?");
        double salary = basicInfo.nextDouble();

        System.out.println("Name: "+name+" Age: "+age+" Salary: "+salary);
    }
    catch{
        System.out.println("")
    }

    }
}