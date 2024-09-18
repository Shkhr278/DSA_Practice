package DSA;

public class RemoveElement {
        public int removeElement(int[] nums, int val) {
            int k = 0; // This will be the index to place the non-val elements
            
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val) {
                    nums[k] = nums[i]; // Place the current element in the correct position
                    k++; // Move to the next position for the next non-val element
                }
            }
            
            return k; // k is the length of the array with all val elements removed
        }
    }

    