public class EquationReverser {
    public static String reverseEquation(String equation){
        //creating a stack
        TokenStack stack = new TokenStack();
        int i = 0;
        //traversing equation from left to right
        while (i < equation.length()){
            char current = equation.charAt(i);
            //if the current character is a digit
            if(Character.isDigit(current)){
                //remembering the begining of the number
                int start = i;
                //moving forward until the number ends
                while (i < equation.length() && Character.isDigit(equation.charAt(i))){
                    i++;
                }
                //extracting whole number and pushing it
                String number = equation.substring(start, i);
                stack.push(number);
            }
            else {
                stack.push(String.valueOf(current));
                i++;
            }
        }
        //creating a StringBuilder fot the result
        StringBuilder result = new StringBuilder();
        //poping all items to reverse the equation
        while (!stack.isEmpty()){
            result.append(stack.pop());
        }
        return result.toString();
    }
}
