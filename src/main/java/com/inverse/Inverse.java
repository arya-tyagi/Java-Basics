package com.inverse;

public class Inverse {

    /**
     * The inverse of a number is defined as the number created by
     * interchanging the face value and index of digits of number.
     * e.g. for 426135
     * (reading from right to left, 5 is in place 1, 3 is in place 2, 1 is in place 3,
     * 6 is in place 4, 2 is in place 5 and 4 is in place 6),
     * <p>
     * the inverse will be 416253
     * <p>
     * (reading from right to left, 3 is in place 1, 5 is in place 2,2 is in place 3, 6 is in place 4,
     * 1 is in place 5 and 4 is in place 6) More examples - inverse of 2134 is 1243 and inverse of 24153
     * is 24153
     */

    public static int inverse(int input) {
        int temp;
        int output = 0;
        while (input > 0) {
            temp=input%10; // gives the value
            output+= temp *(int)Math.pow(10,temp-1);
            input/=10;
        }
        return output;
    }
}
