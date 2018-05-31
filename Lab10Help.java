public class Lab10Help {
    public static int sum2(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        if(nums.length == 1) {
            return nums[0];
        }
        return nums[0] + nums[1];
    }

    public int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }

    public static int start1(int[] a, int[] b) {
        int total = 0;
        if(a.length > 0 && a[0] == 1) {
            total++;
        }
        if(b.length > 0 && b[0] == 1) {
            total++;
        }
        return total;
    }


    public int[] makePi() {

        // long, piece by piece, way of doing this:
  /*
  int[] piArray = new int[3];
  piArray[0] = 3;
  piArray[1] = 1;
  piArray[2] = 4;
  return piArray;
  */

        // shortcut
  /*
  int[] piArray = {3, 1, 4};
  return piArray;
  */

        // my favorite way:
        return new int[] {3, 1, 4};
    }




    public static int countEvens(int[] arr) {
        return 0; // TODO: fix this
    }
}