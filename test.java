import java.util.Stack;

public class test {

    /*
     * Input: Stack of integers st
     * Output: A new Stack of sums of blocks in original stack
     */
    public static Stack<Integer> blockStack(Stack<Integer> st) {
        Stack<Integer> newStack = new Stack<>();
        // If the stack has no values or null
        if (st == null || st.isEmpty())
            return newStack;
        int previous = st.pop();
        int counter = 1;
        while (!st.isEmpty()) {
            int current = st.pop();
            if (current == previous)
                counter++;
            // if block has ended, check its length, then add to newStack
            else {
                if (counter > 1)
                    newStack.push(previous * counter);

                previous = current;
                counter = 1;
            }
        }
        // Check the last block
        if (counter > 1)
            newStack.push(previous * counter);

        return newStack;

    }

    public static void main(String[] args) {
        // Testing task 1
        Stack<Integer> st = new Stack<>();
        st.push(6);
        st.push(7);
        st.push(1);
        st.push(1);
        st.push(1);
        st.push(2);
        st.push(2);

        System.out.println("Original Stack is: " + st);
        Stack<Integer> res = blockStack(st);
        System.out.println("New stack is : " + res);
    }

}
