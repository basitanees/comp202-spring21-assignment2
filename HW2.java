
class HW2
{
 
	// Node structure containing power and coefficient of variable
	static class Node {
	    int power;
	    double coeff;
	    Node next;
	};
	
	//Function To Display The Linked list
	static void printList( Node ptr)
	{
		if (ptr == null)
			System.out.println();
		else if (ptr.next == null)
			System.out.println( ptr.coeff + "x^" + ptr.power);
		else 
		{
			while (ptr.next != null)
			{
				System.out.print( ptr.coeff + "x^" + ptr.power + " + ");
				ptr = ptr.next;
			}
			System.out.println( ptr.coeff + "x^" + ptr.power);
		}
	}
  
  // Create a node and return
  static Node createNode(double coeff, int power)
	{
      Node newNode = new Node();
      newNode.coeff = coeff;
      newNode.power = power;
      newNode.next = null;
	    return newNode;
	}
  
  // Function add a new node
	static Node addnode(Node start, double coeff, int power)
	{
	    // Your code here
	 
	    return start;
	}
  
  static Node multiply(Node poly1, Node poly2)
	{
     // Your code here
  }
  
  static Node add(Node poly1, Node poly2)
	{
     // Your code here
  }
  
}
