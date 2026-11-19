import java.util.Scanner;
public class PalindromeDemo {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        //asking user to enter a string
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        String normalizedText = text.toLowerCase();
        //create stack and queue
        Stack stack = new Stack(normalizedText.length());
        Queue3 queue = new Queue3(normalizedText.length());
        //adding characters to stack and queue
        for(int i = 0; i < normalizedText.length(); i++){
            char ch = normalizedText.charAt(i);
            stack.push(ch);
            queue.enqueue(ch);
        }
        //assuming string is palindrome
        boolean isPalindrome = true;
        //comparing characters
        while (!queue.isEmpty()){
            //removing characters
            char stackChar = stack.pop();
            char queueChar = queue.dequeue();
            //checking if the characters match
            if(stackChar != queueChar){
                isPalindrome = false;
                break;
            }
        }
        //displaying result
        if(isPalindrome){
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a polindrome.");
        }
        input.close();
    }
}
