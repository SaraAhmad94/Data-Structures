package LinkedLists;

public class CircularLinkedLists {
   public Node First;
   CircularLinkedLists()
   {
	   First=null;
   }
   public int count() {
		int count = 1;
		Node current=new Node();
		current = First;
		while ( current.next != First) {
			count++;
			current = current.next;
		}
		// System.out.println("Total nodes are " + count);
		return count;
	}
   public void insertatend(int d) {
		Node nodeIn = new Node(d);
		if (First == null) {
			First = nodeIn;
			nodeIn.next = First;
		} else {
			Node current;
			current = First;
			while (current.next != First) {
				current = current.next;
			}
			current.next = nodeIn;
			nodeIn.next = First;
		}
	}
   public void insertatpos(int d, int pos) {
		Node nodeIn = new Node(d);
		if (pos == 1) {
			Node current;
			current = First;
			First = nodeIn;
			nodeIn.next = current;
		} else {
			Node current, currentNext;
			current = First;
			if (pos <= count() + 1) {
				for (int i = 1; i < pos - 1; i++) {
					current = current.next;
				}
				currentNext = current.next;
				current.next = nodeIn;
				nodeIn.next = currentNext;
			}
		}
	}
   public void delete(int d) {
		Node del = new Node(d);
		if (First == null) {
			System.out.println("List is Empty");
		}  else {
			Node current = new Node();
			Node second = new Node();
			current = First;
			second = First.next;
			if (d == First.data) {
				second = First.next;
				First.data = second.data;
				First.next = second.next;
			} else {
				int count = 1;
				while (current.next != First) {
					if (current.next.data == d) {
						current.next = current.next.next;
					}
					count++;
					current = current.next;
					if (current.next.data == d && count+1 == count()) {
						current.next = First;
					}
	}
			
			}
			}
   }
   public void deleteAtPos(int pos) {
		Node current, currentNext,current1;
		current=First;
		if (pos == 1) {
			System.out.println("a");
			First=First.next;	
		}
		if (pos > count() && pos!=1) {
			System.out.println("ERROR-No such position");
		}
		if (pos == count()) {
			System.out.println("b");
			for (int i = 1; i < pos - 1; i++) {
				current = current.next;
			}

			current.next = First;
		}
			if (pos < count() && pos!=1 ) {
				System.out.println("c");
				for (int i = 1; i < pos - 1; i++) {
					current = current.next;
				}

				current.next=current.next.next;
			}
			

		}
   public void display() {
		Node current;
		current = First;
		if (count()==1)
		{
			System.out.println("Node = " + " | data  " + current.data + "  |");
		}
		else
		{
		while (current.next!= First) {
			System.out.print(" | " + current.data + " | -->  ");
			current = current.next;
		}
   }
		}


   public static void main(String[] args) {
		CircularLinkedLists k = new CircularLinkedLists();
		k.insertatend(10);
		k.insertatend(3);
		k.insertatend(4);
		k.insertatend(5);
		k.insertatend(6);
		k.insertatend(7);
		// k.display();
		//k.insertatpos(9,3);
	  	k.deleteAtPos(1);
		//k.delete(7);
	    k.display();
	}
}
