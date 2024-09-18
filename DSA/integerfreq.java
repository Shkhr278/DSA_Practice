/*
 Question: 
 */

package DSA;

public class integerfreq {

    //Main Function
    public static void main(String[] args) {

        //Taking number as a string input
        String n = "12452245867";

    //Calling find function
     find(n);

    //  0 -> 48
    //  1 -> 49
    //  .
    //  .
    //  9 -> 57
    }

    //Function to find frequency
    public static void find(String n) {

        //Array to store frequency of each digit
        int[] freq = new int[10];

        //Index to iterate over the String
        int l=0;

        //Iterating over the String
        while (l<n.length()) {

            //Extracting ASCII value of each number character
            int r=(int)n.charAt(l);

            //Incrementing the frequency of that number
            freq[r-48]++;       

            //Updating the index
            l+=1;           
        }

        //
        for(int i=0; i<10; i+=1)
            if(freq[i]>0) System.out.println("Frequency of "+ i + " is:"+freq[i]);

    }
}