package Ausbildungsbeispiele.OOP2.Stack;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println("stack = " + stack);
        System.out.println("stack.size() = " + stack.size());
        System.out.println("stack.peek() = " + stack.peek());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
    }
}


