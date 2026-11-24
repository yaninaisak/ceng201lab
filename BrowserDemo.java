public class BrowserDemo {
    public static void main (String[] args){
        //creating browser history object
        BrowserHisrtory browser = new BrowserHisrtory();
        //visiting webpages
        browser.visit("google.com");
        browser.visit("youtube.com");
        //going back
        browser.goBack();
        //visiting new webpage
        browser.visit("facebook.com");
        //going back
        browser.goBack();
        //going forward
        browser.goForward();
        //visiting new webpage
        browser.visit("stackoverflow.com");
        //displaying current page
        browser.displayCurrentPage();
        //displaying browser history
        browser.displayHistory();
    }
}
/*
D. Analysis
1. Current page after each operation:
Initial state: null
Visit Google: google.com
Visit YouTube: youtube.com
Go back: google.com
Visit Facebook: facebook.com
Go back: google.com
Go forward: facebook.com
Visit StackOverflow: stackoverflow.com
2. What happens to the forward stack?
The forward stack becomes empty when we visit a new page.
3. Why do we use stacks?
Because stacks use LIFO. We need to go back
to the last visited page first.
4. Time Complexity:
push(): O(1) - We add to the top.
pop(): O(1) - We remove from the top.
peek(): O(1) - We get the top element.
visit(): O(n) - We use a loop to clear the forward stack.
goBack(): O(1) - We use push and pop.
goForward(): O(1) - We use push and pop.
n is the number of elements in the forward stack.
*/
