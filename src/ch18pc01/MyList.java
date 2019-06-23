package ch18pc01;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 * @author frank
 */
public class MyList<T extends Number & Comparable<? super T>> {
    // Fields
    private ArrayList<T> myArray = new ArrayList<T>(0);
    
    public void add(T num) {
        myArray.add(num);
    }
    
    public T largest() {
        return Collections.max(myArray);
    }
    
    public T smallest() {
        return Collections.min(myArray);
    }
}
