class Person{
    private String name;  
    private String mobileNumber;  
    // getter
    public String getName(){
        return name;
    }
    public String getMobileNumber(){
        return mobileNumber;
    }
    // Setter
    public void setName(String newName){
        this.name = newName;
    }
    public void setMobileNumber(String newNumber){
        this.mobileNumber = newNumber;
    }
}

public class Test1 {
    public static void main(String[] args) {
        Person obj = new Person();
        // obj.name = "ganesh";
        // System.out.println(obj.name);
        obj.setName("Ganesh");
        obj.setMobileNumber("9575556665");
        System.out.println(obj.getName());
        System.out.println(obj.getMobileNumber());
    }
}
