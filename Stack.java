import java.util.Scanner;

public class Stack {
    Node top;
    class Node { int data; Node next; Node(int data) { this.data = data; } }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (top == null) throw new RuntimeException("Stack is empty");
        int poppedData = top.data;
        top = top.next;
        return poppedData;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements to push: ");
        int n = scanner.nextInt();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) stack.push(scanner.nextInt());
        System.out.println("Popping elements:");
        while (stack.top != null) System.out.print(stack.pop() + " ");
        scanner.close();
    }
}
