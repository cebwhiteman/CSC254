import org.junit.Assert;
import org.junit.Test;
public class Lab10 {

    public static int sum2(int[] nums) {
        if(nums.length == 0) {
            return 0; //if the array is empty, return 0
        }
        if(nums.length == 1) {
            return nums[0]; //if there is only one element in the array, return that element, which is an int
        }
        return nums[0]+nums[1]; //returns the sum of the first two ints in the array
    }


    public static int start1(int[] a, int[] b) {
        int sum = 0; //creates variable sum of int type and sets its value to zero
        if(a.length > 0 && a[0] == 1){
            sum++ ;
            //if array a is not empty and the first int is 1, increase the value of variable sum by one
        }
        if(b.length > 0 && b[0] == 1){
            sum++;
            //if array b is not empty and the first int is 1, increase the value of variable sum by one
        }
        return sum; //tells the user the number of arrays whose first element is 1
    }


    public static int countEvens(int[] nums) {
        int evens = 0; //creates variable evens of int type and sets its value to zero
        for(int i = 0; i < nums.length; i++) {
            //goes through ints in array as long as i is shorter than the length of nums
            if(nums[i]%2 == 0) {
                evens++;
                //if the element in nums is divisible by two, it is even, so increase the value of evens by one
            }
        }
        return evens; //tells the user the number of ints that are even in the array

    }

}


