public class ArrayUtilities2 {

    public static void printArray(int[] arr) {
        for(int value : arr) {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {5, 10, 15};
        printArray(arr);
        printArray(new int[] {30, 40, 50, 60});
    }

    public static int matchUp(int[] nums1, int[] nums2) {
        int count = 0; // count of times that the two elements differ by 2 or less, but are not equal.

        // for every element in nums1, consider the corresponding element in nums2
        for(int i=0; i < nums1.length; i++) {
            if(nums1[i] != nums2[i] && Math.abs(nums1[i] - nums2[i]) <= 2) {
                count++;
            }
        }
        return count;
    }

    public static boolean twoTwo(int[] nums) {
        // first, check for the special case of the array having only 1 element
        if(nums.length == 1) {
            return nums[0] != 2;
        }

        // check each location in the array to see if it's a 2
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 2) { // if we're looking at a 2

                if(i==0) { // only look to the right when we're at the left-most element
                    if(nums[i+1] != 2) { // the number to the right must be another 2
                        return false;
                    }
                } else if(i == nums.length -1) {
                    // only look to the left when we're at the right-most element
                    if(nums[i-1] != 2) { // the number to the right must be another 2
                        return false;
                    }
                } else if(nums[i-1] != 2 && nums[i+1] != 2) { // look for 2's on either side
                    return false;
                }
            }
        }

        return true; // all 2's have been checked and are next to another 2
    }
}