class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        // If the array is empty or has only one element, return its length
        if (nums.length == 0) {
            return 0;
        }

        // Initialize a pointer for the position of the last unique element
        int uniqueIndex = 0;

        // Loop through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // If the current element is not equal to the element at uniqueIndex,
            // it's a new unique element.
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;      // Move the unique pointer
                nums[uniqueIndex] = nums[i]; // Update the element at the new unique position
            }
        }

        // The number of unique elements is uniqueIndex + 1
        return uniqueIndex + 1;
    }
}
