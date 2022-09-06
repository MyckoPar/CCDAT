// Array implementation of Stack
public class App {
    public static void main(String[] args) {
  
      // Create new Stack Object
      Stack lace_stack = new Stack(5);
  
      // Insert new elements into the stack
      lace_stack.push("Pink lace");
      lace_stack.push("Yellow lace");
      lace_stack.push("Grey lace");
      lace_stack.push("Black lace");
  
      // Show the size of the stack
      System.out.println("Ang size ng stack ay: " + lace_stack.size());
  
      // Show top element in the stack
      System.out.println("Ang pinaka taas ng stack ay: " + lace_stack.peek());
  
      // Remove top element in the stack
      lace_stack.pop();
  
      System.out.println("Pagtapos ng pop");
  
      // Show all elements in Stack
      lace_stack.printStack();
  
      // Show top element in the stack
      System.out.println("Ang pinaka taas ng stack ay: " + lace_stack.peek());
    }
  }
