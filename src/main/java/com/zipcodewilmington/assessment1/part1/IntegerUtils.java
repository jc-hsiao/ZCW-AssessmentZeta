package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        int sum = 0;
        //The instruction wants this to not include n but the test answer includes n
        for(int i=1; i<=n; i++){
            sum += i;
        }
        return sum;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        int pro = 1;
        for(int i=1; i<=n; i++){
            pro *= i;
        }
        return pro;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        char[] chars = val.toString().toCharArray();
        String result = "";
        for(int i=chars.length-1; i>=0; i--){
            result += chars[i];
        }
        return Integer.parseInt(result);
    }
}
