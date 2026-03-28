class Stack {
     int maxSize;
     int top;
     int[] stackArray;
    Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;  
    }
    void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow! Cannot push " + value);
        } else {
            stackArray[++top] = value;
            System.out.println(value + " pushed into stack");
        }
    }
    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! Cannot pop");
            return -1;
        } else {
            return stackArray[top--];
        }
    }
    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }      
    }
    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        System.out.println("Popped: " + s.pop());
        s.display();
        System.out.println("Popped: " + s.pop());
        s.display();
    }
}

