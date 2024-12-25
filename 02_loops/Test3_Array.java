class Test3_Array{
    public static void main(String args []){
        // String [] cars= {"Thor","Verna","Fortuner"};
        // int [] nums = {10,20,30};
        //     cars[0] = "Scorpio"; // Change an Array Element
        //     cars[2] = "Thor";    // Change an Array Element   
        // System.out.println(cars[2]);
        // System.out.println(nums[2]);
        // System.out.println(nums.length); // To find out how many elements an array has, use the length property:

// ---------------- Loop Through an Array -----------------------
        // for(int i =0; i<cars.length; i++){
        //     System.out.println(cars[i]);            
        // } 
        
// ----------------------- Loop Through an Array with For-Each ----------------
        // for (String i : cars){
        //     System.out.println(i);
        // }     
        
// ----------------- Real-Life Example ----------------- Find out the Avr age
        // int [] ages = {20,22,26,21,28,27};
        // int avr, sum = 0;
        // int length = ages.length;
        // System.out.println("Length="+length);
        // for(int age :ages){
        //     System.out.println("Ages are :"+age);
        //     sum += age;
        // }
        
        // avr = sum/length;
        // System.out.println(sum);
        // System.out.println(avr);

    //    int lowestAge = ages[0];
    //     for (int age : ages){
    //         if(age < lowestAge){
    //             lowestAge = age;
    //         }
    //     }
    //     System.out.println(lowestAge);

// ------------------- Multidimensional Arrays -------------    
            // int [][] myNumbers = {{1,2,3},{4,3,6}};
        //     if(myNumbers[1][1] == 5){  // SELF ------------
        //     myNumbers[1][1] = 9;
        //     System.out.println(myNumbers[1][1]);
        // }
        // else{
        //     myNumbers[1][1] = 100;
        //     System.out.println(myNumbers[1][1]);
        // }

// ----------------- Loop Through a Multi-Dimensional Array -----------------------
            // int [][] myNumbers = {{1,2,3,4},{5,6,7}};
            // for(int i = 0; i<myNumbers.length; i++){
            //     for(int j = 0; j<myNumbers[i].length; j++){
            //         System.out.println(myNumbers[i][j]);
                
            //     }
            // }
            // System.out.println(myNumbers[0].length+myNumbers[1].length);

// ----------------------- Or you could just use a for-each loop, which is considered easier to read and write:------------------            
            int [][] myNumbers = {{1,2,3,4},{5,6,7}};
            for(int [] row : myNumbers){
                for(int i : row){
                    System.out.println(i);
                }
            }
}
}