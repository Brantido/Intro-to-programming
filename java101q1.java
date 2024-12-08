public class java101q1 {
    public static int repeat(int x, int y){
        int numberRepeated = 0;
        if (x == y){
            numberRepeated += 1;
        }
        return numberRepeated;
    }
    public static int countOccurrences(int[] arr, int n) {
        int numberRepeated = 0; 
        
        for (int i = 0; i < arr.length; i++) {
            numberRepeated += repeat(arr[i], n);
        }

        return numberRepeated;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 2, 5}; //PUT YOUR NUMBERS IN HERE
        int target = 2; //PUT TARGET NUMBER IN HERE
        System.out.println("The number " + target + " appears " + countOccurrences(numbers, target) + " times.");
    }
}
