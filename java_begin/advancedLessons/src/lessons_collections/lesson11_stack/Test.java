package lessons_collections.lesson11_stack;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // 5 <- 3 <- 1

        stack.push(1);//заталкивает в стек элемент
        stack.push(3);
        stack.push(4);

        while (!stack.empty()){ //пока стэк не пустой
            System.out.println(stack.pop());
        }

//        System.out.println(stack.pop()); //достает последний элемент из стека
//
//        System.out.println(stack.peek()); //смотрит на элемент
    }
}
