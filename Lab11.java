import org.junit.Assert;
import org.junit.Test;
public class Lab11 {
    public static void main(String[] args) {

    }

    public boolean isEverywhere(int[] nums, int val) {
        //check to see if the value at index i or at index i+1 is equal to val

        for (int i = 0; i < nums.length - 1; i++) {
            //look through array until the second to last value
            //we don't need to look at the last value here because it is included
            //in i + 1 in the if statement

            if (nums[i] == val || nums[i + 1] == val) {
                //check to see if for each "pair" of adjacent values, at least one is the
                //value being searched for

            } else {
                return false;
            }
            //if neither number is the value being searched for, the if-statement
            //conditions are not met
        }
        return true;

    }
}