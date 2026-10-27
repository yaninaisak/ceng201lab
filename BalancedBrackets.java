public class BalancedBrackets {
    public static boolean isBalanced(String s){
        //creating a stack
        BracketStack stack = new BracketStack();
        //traversing string character by character
        for(int i = 0; i < s.length(); i++){
            char current = s.charAt(i);
            //if its opening bracket
            if (current == '(' || current == '[' || current == '{'){
                stack.push(current);
            }
            //if its closing bracket
            else if (current == ')' || current == ']' || current == '}') {
                //cheking if stack is empty
                if(stack.isEmpty()){
                    return false;
                }
                //removing last opening bracket
                char opening = stack.pop();
                //cheking when bracket match
                if(!isMatchingPair(opening, current)){
                    return false;
                }
            }
        }
        //the stack must be empty at the end
        return stack.isEmpty();
    }
    private static boolean isMatchingPair(char opening, char closing){
        //cheking matching brackets
        if (opening == '(' && closing == ')'){
            return true;
        }
        if (opening == '[' && closing == ']'){
            return true;
        }
        if (opening == '{' && closing == '}'){
            return true;
        }
        return false;
    }
}
