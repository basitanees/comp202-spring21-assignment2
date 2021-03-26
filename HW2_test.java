import java.util.Scanner;
		
public class HW2_Test {
	
  static Node createNode(double coeff, int power)
	{
		Node newNode = new Node();
		newNode.coeff = coeff;
		newNode.power = power;
		newNode.next = null;
		return newNode;
	}
	
	// Function add a new node at the end of list
	static Node addnode(Node start, double coeff, int power)
	{
	    // Create a new node
	    Node newnode = createNode(coeff, power);
	 
	    // If linked list is empty
	    if (start == null)
	        return newnode;
	 
	    // If linked list has nodes, add at the end
	    Node ptr = start;
	    while (ptr.next != null)
	        ptr = ptr.next;
	    ptr.next = newnode;
	 
	    return start;
	}
  
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

    Node poly1 = null;
    Node poly2 = null;
    Node current = null;

    // reads integer tokens from the console and constructs a LinkedList from them
    while (scan.hasNextInt()) {
      double coeff = scan.nextInt();
      int power = scan.nextInt();
      if (poly1 == null) {
         poly1 = createNode(coeff, power);
         current = poly1;
      } else {
        current.next = createNode(coeff, power);;
        current = current.next;
      }
    }
    scan.next(); // gets rid of the "end" token in the end of each list in the test cases
    
    current = null;
    while (scan.hasNextInt()) {
      double coeff = scan.nextInt();
      int power = scan.nextInt();
      if (poly2 == null) {
         poly2 = createNode(coeff, power);
         current = poly2;
      } else {
        current.next = createNode(coeff, power);;
        current = current.next;
      }
    }
    scan.next(); // gets rid of the "end" token in the end of each list in the test cases

    HW2.printList(HW2.multiply(poly1, poly2));
    HW2.printList(HW2.add(poly1, poly2));
		
		
		scan.close();
	}
}
