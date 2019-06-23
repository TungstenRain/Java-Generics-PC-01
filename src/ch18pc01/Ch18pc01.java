package ch18pc01;

import ch18pc01.MyList.*;
/**
 * 
 * @author frank
 */
public class Ch18pc01 {

    /**
     * The Main Method
     * @param args String[] The command line arguments
     */
    public static void main(String[] args) {
        // Variables
        int[] myArray = {1, 5, 65, 789, -321, 215, 35};
        
        // Instantiate MyList
        MyList thisIsMyList = new MyList();
        
        System.out.println("Welcome to the MyList Class demonstration.");
        System.out.println("The following numbers are in my array.");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
        
        System.out.println("Adding these values to the generic class.");
        for (int i = 0; i < myArray.length; i++) {
            thisIsMyList.add(myArray[i]);
        }
        
        System.out.println("Here is the largest value: " + thisIsMyList.largest());
        System.out.println("Here is the smallest value: " + thisIsMyList.smallest());
    }

}
