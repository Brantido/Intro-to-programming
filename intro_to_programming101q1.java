public class intro_to_programming101q1{
    //calling method of max
    public static double max(double x, double y){
        //creates an operation where it compares two values and return the greater value
        return (x > y) ? x : y;
    }

    //calling method of maxArray with the parameters
    //double[] parameter prepares the code to set all numbers into a double format
    //arr parameter just a name to pinpoint what and where the numbers are
    public static double maxArray(double[] arr) {
        //inititalizing maxVal with the position of arr
        double maxVal = arr[0];  
        //creates a for loop where i is being used to count how many times the loop has to loop for until all the numbers of the array are used
        for (int i = 1; i < arr.length; i++) {
        //recalling max method to compare the values of the previous value and the next value and this repeats until all numbers of the array are compared
            maxVal = max(maxVal, arr[i]);  
        }
        //saves the maxVal as the highest number
        return maxVal; 
    }
    //calling method main with the parameters
    //string[] prepares the code to make sure the values are all strings
    //arg parameter as a necessity for the code to work but isnt being recalled or used
    public static void main(String[] arg) {
        //recalls double[] as the first parameter to make the numbers into doubles
        double[] numbers = {1, 2, 3, 4, 5}; //ENTER NUMBERS HERE
        //prints outputs 
        //recalls the method maxArray with the array names "numbers" for the method to calculate and compare the numbers, finding the greatest number
        System.out.println("The largest number is: " + maxArray(numbers));
    }
}