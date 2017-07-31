package LinkedLists;

public class SingleLinkedLists {
	public Node first;

	SingleLinkedLists() {
		first = null;
	}

	public int count() {
		int count = 0;
		Node current=new Node();
		current = first;
		while (current != null) {
			count++;
			current = current.next;
		}
		// System.out.println("Total nodes are " + count);
		return count;
	}

	public void insertatend(int d) {
		Node nodeIn = new Node(d);
		if (first == null) {
			first = nodeIn;
			nodeIn.next = null;
		} else {
			Node current;
			current = first;
			while (current.next != null) {
				current = current.next;
			}
			current.next = nodeIn;
			nodeIn.next = null;
		}
	}

	public void insertatpos(int d, int pos) {
		Node nodeIn = new Node(d);
		if (pos == 1) {
			Node current;
			current = first;
			first = nodeIn;
			nodeIn.next = current;
		} else {
			Node current, currentNext;
			current = first;
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

	public void display() {
		Node current;
		current = first;
		while (current != null) {
			System.out.print(" | " + current.data + " | -->  ");
			current = current.next;
		}

	}

	// delete this element d
	public void delete(int d) {
		Node del = new Node(d);
		if (first == null) {
			System.out.println("List is Empty");
		} else {
			Node current, previous;
			previous = first;
			current = previous.next;
			// First Node
			/*
			 * if (previous.data==d) { previous.data=current.data;
			 * previous.next=current.next;
			 * 
			 * } else { while(previous.next!=null && previous.next.data!= d) {
			 * previous=previous.next;
			 * 
			 * } if(previous.next == null) {
			 * System.out.println("Given node is not present in Linked List"); }
			 * else { previous.next=previous.next.next; } }
			 */
			while (previous.next != null) {
				if (previous.next.data == d) {
					previous.next = previous.next.next;
				} else {
					previous = previous.next;
				}

			}
		}
	}

	public void deleteAtPos(int pos) {
		Node current, currentNext;
		current=first;
		if (pos == 1) {
			Node current1;
			current1 = first.next;
			first=current1;	
		}
		if (pos > count() && pos!=1) {
			System.out.println("ERROR-No such position");
		}
		if (pos == count()) {
			for (int i = 1; i < pos - 1; i++) {
				current = current.next;
			}

			current.next = null;
		}
			if (pos < count() && pos!=1 ) {
				for (int i = 1; i < pos - 1; i++) {
					current = current.next;
				}

				current.next=current.next.next;
			}
			

		}
	
	public void CheckAscend()
	{   
		Node current,next;
		int counter=0;
		current=first;
		next=first.next;
		while(current.next!=null)
		{
			if(current.data>current.next.data)
			{
				counter=1;
				break;
			}
			current=current.next;
		}
		if (counter==1)
		{
			System.out.println("NOT ASCENDING");
		}
		else
		{
			System.out.println("YES ASCENDING");
		}
	}
	public void BubbleSort()
	{
		Node temp=new Node();
		Node current=new Node();
		current=first;
		temp.data=current.data;
		boolean flag=true;
		if (first==null)
		{
			System.out.println("Not present");
		}
		else
		{
		while(flag){	
			flag=false;
		while(current.next!=null)
		{   
			if (current.data>current.next.data)
			{   
				temp.data=current.data;
				current.data=current.next.data;
				current.next.data=temp.data;
				flag=true;
				
			}
			current=current.next;
		}
	}
		}	
}

	public static void main(String[] args) {
		SingleLinkedLists k = new SingleLinkedLists();
		k.insertatend(10);
		/*k.insertatend(3);
		k.insertatend(4);
		k.insertatend(5);
		k.insertatend(6);
		k.insertatend(7);
		// k.display();
		// k.count();
		// k.insertatpos(9,7);
		k.deleteAtPos(1);*/
		//k.display();
		//k.CheckAscend();
		//k.BubbleSort();
		k.display();
	}
}
