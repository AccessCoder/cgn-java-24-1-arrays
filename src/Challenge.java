public class Challenge {

    /**
     * Step 1: Create an array with numbers from 1 to 10 and print it to the console.
     *
     * Step 2: Calculate the sum of all numbers in the array and print the result to the console.
     *
     * Step 3: Find the largest number in the array and print it to the console.
     *
     * Step 4: Create a second array with numbers from 11 to 20.
     *
     * Step 5: Perform element-wise addition of both arrays and
     * store the result in a third array. Print the result array to the console.
     */

    public static void main(String[] args) {

        int[] numbers1 = {1,2,3,4,5,6,7,8,9,10};
        int[] numbers2 = {11,12,13,14,15,16,17,18,19,20};
        printSum(numbers1);
        printLargestNum(numbers1);
        printSumOfArrays(numbers1, numbers2);
    }
    public static void printNumbers(int[] currywurst) {
        for (int i = 0; i < currywurst.length; i++) {
            System.out.println(currywurst[i]);
        }
    }
    public static void printSumOfArrays(int[] nums1, int[] nums2){
        int[] results = new int[nums1.length];
        for (int i = 0; i<results.length; i++){
            results[i] = nums1[i] + nums2[i];
        }
        printNumbers(results);
    }
    public static void printLargestNum(int[] nums){
        int largestNum = nums[0];
        for (int i = 1; i<nums.length; i++){
            if (nums[i]>largestNum){
                largestNum = nums[i];
            }
        }
        System.out.println(largestNum);
    }

    public static void printSum(int[] nums){
        int sum = 0;
        for (int i = 0; i<nums.length; i++){
            sum += nums[i]; // Kurzschreibweise für sum = sum+nums[i];
        }
        System.out.println(sum);
    }
}
