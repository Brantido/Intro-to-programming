public class java101q2 {
    public static int[] reverseArray(int[] arr){
        int[] reverseArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++){
            reverseArr[i] = arr[arr.length - 1 - i];
        }
        return reverseArr;
    }

    public static void main(String[] arg){
        int[] arrNumbers = {1, 2, 3, 4, 5};

        int[] reverseNumbers = reverseArray(arrNumbers);

        System.out.print("The reverse array is: ");
        for (int num : reverseNumbers){
            System.out.print(num +" ");
        }
    }
}
