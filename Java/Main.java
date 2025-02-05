public class Main {

    private static int sumArray(int[] arr) {
        int sum = 0;
       for (int i = 0; i < arr.length;i++){
        sum += arr[i];  // Add the current element to the sum
        }
        return sum;
       }
    
    


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = sumArray(arr);
                System.out.println("Sum of the array elements: " + sum);
            }
}