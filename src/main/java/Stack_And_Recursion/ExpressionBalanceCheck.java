package Stack_And_Recursion;

public class ExpressionBalanceCheck {
    public static void main(String[] args) {
        System.out.println(balanceCheck("(A*C) + {V-M}"));
        System.out.println(balanceCheck("(A*C) + {V-M}]"));

    }

//    Question : How do we check if the expressions are balanced with the opening and closing delimiters?
//
//            1. Create a stack.
//2. While (end of input is not reached)
//    a. If the character is not a symbol to be balanced ( (,),[,],{ or }), ignore it.
//    b. If the character is an opening symbol like (, [, {, push it onto the stack
//        c. If it is a closing symbol like ),],}, and if the stack is empty return false.
//    Else pop the stack.
//    d. If the symbol popped != corresponding opening symbol, return false.
//            3. At end of input, if the stack is not empty report an error.
   public static boolean balanceCheck(String expression){
        //create a stack
        MyStack<Character> myStack = new MyStack<>();
        //iterate over expression
        for (int e = 0; e < expression.length(); e++) {
            Character ch = expression.charAt(e);
            //filter non player chars
            if(ch != '(' && ch != '{' && ch != '[' && ch != ')' && ch != '}' && ch != ']') continue;
            //if it is a symbol to process
                //if opening symbol push it to the stack
            if(ch == '(' || ch == '{' || ch == '[') {
                myStack.push(ch);
                continue;
            }
            //if it is a closing symbol
            //stack shouldnt be empty
            if(myStack.isEmpty()) return false;
            switch (ch){
                case ')':
                    if(myStack.pop() != '(') return false;
                    break;
                case '}':
                    if(myStack.pop() != '{') return false;
                    break;
                case ']':
                    if(myStack.pop() != '[') return false;
                    break;
            }
        }//end of for loop
        //return if stack is empty
        return myStack.isEmpty();

    }
}
