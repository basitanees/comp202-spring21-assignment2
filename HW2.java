
class HW2
{
 
	// Node structure containing power and coefficient of variable
	static class Node
	{
	 // Your code here
		
	};
	
	//Function To Display The Linked list
	static void printList( Node ptr)
	{
		if (ptr == null)
			System.out.println();
		else if (ptr.next != null)
		{
			while (ptr.next != null)
			{
				System.out.print( ptr.coeff + "x^" + ptr.power + " + ");
				ptr = ptr.next;
			}
		}
		System.out.println( ptr.coeff + "x^" + ptr.power);
	}
  
	// Create a node and return
	static Node createNode(double coeff, int power)
	{
	// Your code here
		
	}
  
  	// Function add a new node
	static Node addnode(Node head, double coeff, int power)
	{
	// Your code here
	 
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
