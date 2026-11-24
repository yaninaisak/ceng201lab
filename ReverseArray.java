public class ReverseArray {
    public static void reverseArray(int[] arr, int left, int right){
        //base case
        if(left >= right){
            return;
        }
        //storing left value
        int temp = arr[left];
        //moving right value to the left
        arr[left] = arr[right];
        //moving temp value to the right
        arr[right] = temp;
        //recursive call
        reverseArray(arr, left + 1, right - 1);
    }
    public static void displayArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        //creating array
        int[] numbers = {10, 20, 30, 40, 50};
        //displaying orriginal array
        System.out.println("Original array: ");
        displayArray(numbers);
        //reversing array
        reverseArray(numbers, 0, numbers.length - 1);
        //displaying reversed array
        System.out.println("Reversed array: ");
        displayArray(numbers);
    }
}
/*
Time Complexity: O(n)
we swap two elements in each recursive call
we make about n/2 recursive cals
so the time coplexity is O(n)
 */
