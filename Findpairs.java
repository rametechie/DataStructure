import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Findpairs {

    //Find all the pairs of numbers from an array of numbers summing up to K [another integer]

    public static void main(String[] args) {
        int[] a = {3, 5, 6, 1, 2, 7, 9};

        int k = 9;
       // findPairs(k);
        //findUsing2Pointer(k);
        findTwoSum(k);
    }

    private static void findPairs( int k) {
        int[] a = {1, 2, 4,5,5, 6,  7};
        for (int i = 0; i < a.length; i++) {
            int firstNum = a[i];

            for (int j = i+1; j < a.length; j++) {
                int secondNum = a[j];

                int sum =firstNum + secondNum;
                if (sum == k) {
                    System.out.println(a[i] + " " + a[j]);
                }
            }
        }
    }

    //n square

    private static void findUsing2Pointer(int k) {
        //      int[] b = {1, 2 , 3 ,5,, 6, 7};
        int[] b = {1, 2, 4,5,5, 6,  7};
        int start = 0;
        int end = b.length - 1;
        while (start <= end) {
           // System.out.println( "check ==>" + b[start] + "check ==>" +b[end]);
            int sum = b[start] + b[end];
            if (sum == k) {
                System.out.println("two number" + b[start] + "and ==" + b[end]);
                start++;
                end--;
            } else if (sum < k) {
                System.out.println("never goes in this" );
                start++;
            } else {
                System.out.println("never goes in this");
                end--;
            }
        }
    }

    //On sorted array
    //O Log N  for the unsorted

    private static void findTwoSum(int target) {
        int[] nums = {1,3,2,5,7,6};
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
               // return new int[] { numMap.get(complement), i };
                System.out.println("two number" +  complement + "and ==" + nums[i] );
            } else {
                numMap.put(nums[i], i);
            }
        }
       // return new int[] {};
    }

    //complexity time complexity On


}




