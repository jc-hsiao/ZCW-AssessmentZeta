package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int c = 0;
        for(int i=0; i<objectArray.length; i++){
            if(objectArray[i].equals(objectToCount)){
                c++;
            }
        }
        return c;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        ArrayList<Object> newA = new ArrayList<>();
        for(int i=0; i<objectArray.length; i++){
            if(!objectArray[i].equals(objectToRemove)){
                newA.add(objectArray[i]);
            }
        }
        return newA.toArray(new Integer[0]);
        //I have to specify 'new Integer' here to avoid the array casting error in the Tests
        //so unfortunately this method can only work for Integers for now.
        //If the tests uses Arrays.copy to cast instead of (Integer[])
        //then I won't need to specify the class type here, and this will work for any classes
        //https://stackoverflow.com/questions/1115230/casting-object-array-to-integer-array-error
        //https://stackoverflow.com/questions/2745338/convert-an-arraylist-to-an-object-array
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        ArrayList<Object> temp = new ArrayList<>();
        ArrayList<Integer> occ = new ArrayList<>();

        for(int i=0; i<objectArray.length; i++){
            if(!temp.contains(objectArray[i])){
                //if the element in the old array has not appear before, add it to temp array
                temp.add(objectArray[i]);
                occ.add(1);
            }else{
                int n = temp.indexOf(objectArray[i]);
                occ.set(n,occ.get(n)+1);
            }
        }
        return temp.get(occ.indexOf(Collections.max(occ)));
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        ArrayList<Object> temp = new ArrayList<>();
        ArrayList<Integer> occ = new ArrayList<>();

        for(int i=0; i<objectArray.length; i++){
            if(!temp.contains(objectArray[i])){
                //if the element in the old array has not appear before, add it to temp array
                temp.add(objectArray[i]);
                occ.add(1);
            }else{
                int n = temp.indexOf(objectArray[i]);
                occ.set(n,occ.get(n)+1);
            }
        }
        return temp.get(occ.indexOf(Collections.min(occ)));
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        ArrayList<Object> temp = new ArrayList<>();
        for(int i=0; i<objectArray.length; i++){
            temp.add(objectArray[i]);
        }
        for(int j=0; j<objectArrayToAdd.length; j++){
            temp.add(objectArrayToAdd[j]);
        }
        return temp.toArray(new Integer[0]);
        //I have to specify 'new Integer' here to avoid the array casting error in the Tests
        //so unfortunately this method can only work for Integers for now.
        //If the tests uses Arrays.copy to cast instead of (Integer[])
        //then I won't need to specify the class type here, and this will work for any classes
        //https://stackoverflow.com/questions/1115230/casting-object-array-to-integer-array-error
        //https://stackoverflow.com/questions/2745338/convert-an-arraylist-to-an-object-array
    }
}
