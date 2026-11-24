public class BrowserHisrtory {
    private Stack_ backStack;
    private Stack_ forwardStack;
    private String currentPage;
    public BrowserHisrtory(){
        //creating back and forward stacks
        backStack = new Stack_();
        forwardStack = new Stack_();
        currentPage = null;
    }
    public void visit(String url){
        //adding current page to the back stack
        if(currentPage != null){
            backStack.push(currentPage);
        }
        //updating current page
        currentPage = url;
        //clearing forward stack
        clearStack(forwardStack);
        System.out.println("Visited: " + currentPage);
    }
    public void goBack(){
        //checking if back stack is empty
        if(backStack.isEmpty()){
            System.out.println("Cannot go back!");
            return;
        }
        //adding current page to forward stack
        forwardStack.push(currentPage);
        //moving to previous page
        currentPage = backStack.pop();
        System.out.println("Went back to: " + currentPage);
    }
    public void goForward(){
        //checking if forward stack is empty
        if(forwardStack.isEmpty()){
            System.out.println("Cannot go forward!");
            return;
        }
        //adding current page to back stack
        backStack.push(currentPage);
        //moving to the next page
        currentPage = forwardStack.pop();
        System.out.println("Went forward to: " + currentPage);
    }
    public void displayCurrentPage(){
        //cheking if any page is open
        if(currentPage == null){
            System.out.println("No page is open.");
        } else {
            System.out.println("Current page: " + currentPage);
        }
    }
    private void clearStack(Stack_ stack){
        //removing all elements from stack
        while (!stack.isEmpty()){
            stack.pop();
        }
    }
    public void displayHistory(){
        System.out.println("\n========== BROWSER HISTORY ==========");
        System.out.println("Current page: " + currentPage);
        System.out.print("Back stack (top -> bottom): ");
        backStack.display();
        System.out.print("Forward stack (top -> bottom): ");
        forwardStack.display();
        System.out.println("=====================================");
    }
}
