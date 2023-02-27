package CS.Stack;

public class Main {
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(3);
        arrayStack.push("1");
        arrayStack.push("2");
        arrayStack.push("3");
//		arrayStack.push("3");
//		arrayStack.push("3");
//		arrayStack.push("3");
//		arrayStack.push("3");

        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.empty());
    }
}
