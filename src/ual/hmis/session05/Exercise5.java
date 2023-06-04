package ual.hmis.session05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercise5 {
    
    public static List<Integer> mergeSortedLists(List<Integer> list1, List<Integer> list2) {
        // Create a new list to hold the merged result
        List<Integer> mergedList = new ArrayList<Integer>();

        // Add all elements from the first and second list
        mergedList.addAll(list1);
        mergedList.addAll(list2);

        // Sort the merged list
        Collections.sort(mergedList);

        return mergedList;
        
        
    }
   
}