public class java101q1 {
    public static int repeat(int x, int y){
        int numberRepeated = 0;
        if (x == y){
            numberRepeated += 1;
        }
        return numberRepeated;
    }
    public static int countOccurrences(int[] arr, int n) {
        int numberRepeated = 0; // Initialize the counter to 0.

        // Iterate through the array to compare each element with n.
        for (int i = 0; i < arr.length; i++) {
            numberRepeated += repeat(arr[i], n); // Use the repeat method to check and count.
        }

        return numberRepeated; // Return the total count of occurrences of n.
    }

    // Main method for testing the countOccurrences function.
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 2, 5}; // Example array
        int target = 2; // The number to count occurrences of

        // Call countOccurrences and print the result.
        System.out.println("The number " + target + " appears " + countOccurrences(numbers, target) + " times.");
    }
}
