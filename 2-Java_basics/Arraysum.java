class Arraysum {
    /* Function to return the sum of
    the 1st and last element of the array */
    public int sumOfFirstAndLast(int[] nums) {
        // Check if the array is empty
        if (nums.length == 0) {
            return 0; // Return 0
        }

        // Get the first element
        int first = nums[0];
        // Get the last element
        int last = nums[nums.length - 1];
        
        // Return sum of the first and last elements
        return first + last;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5, 6};
        
        // Creating an instance of Solution class
        Solution sol = new Solution();
        
        /* Function call to return the sum of
        the 1st and last element of the array */
        int ans = sol.sumOfFirstAndLast(nums);

        System.out.println("Sum of first and last element: " + ans);
    }
}
