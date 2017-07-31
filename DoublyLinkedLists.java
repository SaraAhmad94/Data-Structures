package LinkedLists;

public class DoublyLinkedLists {
	public DNode First;

	DoublyLinkedLists() {
		First = null;
	}

	public int count() {
		int count = 0;
		DNode current = new DNode();
		current = First;
		while (current != null) {
			count++;
			current = current.Next;
		}
		// System.out.println("Total nodes are " + count);
		return count;
	}

	public void Insertatend(int d) {
		DNode nodeIn = new DNode(d);
		if (First == null) {
			First = nodeIn;
			nodeIn.Next = null;
			nodeIn.Previous = null;
		} else {
			DNode current = new DNode();
			current = First;
			while (current.Next != null) {
				current = current.Next;
			}
			current.Next = nodeIn;
			nodeIn.Next = null;
			nodeIn.Previous = current;
		}
	}

	public void insertatpos(int d, int pos) {
		DNode nodeIn = new DNode(d);
		if (pos == 1) {
			DNode current;
			current = First;
			First = nodeIn;
			nodeIn.Next = current;
			nodeIn.Previous = null;
			current.Previous = nodeIn;
		} else {
			DNode current, currentNext;
			current = First;
			if (pos <= count() + 1) {
				for (int i = 1; i < pos - 1; i++) {
					current = current.Next;
				}
				currentNext = current.Next;
				current.Next = nodeIn;
				nodeIn.Next = currentNext;
				nodeIn.Previous = current;
			} else {
				System.out.println("Position is greater than the count or out of the range");
			}
		}
	}

	// delete this element with value d
	public void Delete(int d) {
		DNode del = new DNode(d);
		if (First == null) {
			System.out.println("List is Empty");
		} else {
			DNode current = new DNode();
			DNode second = new DNode();
			current = First;
			second = First.Next;
			if (d == First.Data) {
				second = First.Next;
				First.Data = second.Data;
				First.Next = second.Next;
				First.Previous = null;
			} else {
				int count = 1;
				while (current.Next != null) {
					if (current.Data == d) {
						current.Next.Previous = current.Previous;
						current.Previous.Next = current.Next;
					}
					count++;
					current = current.Next;
					if (current.Data == d && count == count()) {
						current.Previous.Next = null;
					}

				}

			}
		}
	}

	public void deleteAtPos(int pos) {
		DNode current = new DNode();
		DNode current1 = new DNode();
		current=First;
		if (pos == 1) {
			current1 = First.Next;
			First=current1;			
		} 
		if (pos > count() && pos!=1) {
			System.out.println("ERROR-No such position");
		}
		if (pos == count() && pos!=1) {
			for (int i = 1; i <=pos - 1; i++) {
				current = current.Next;
			}
			current.Previous.Next = null;
		}else {
			DNode currentNext;
			current = First;
			if (pos < count()) {
				for (int i = 1; i <=pos - 1; i++) {
					current = current.Next;
				}
				current.Next.Previous = current.Previous;
				current.Previous.Next = current.Next;
			}
			

		}
	}

	public void display() {
		DNode current;
		current = First;
		while (current != null) {
			System.out.print(" | " + current.Data + " | -->  ");
			current = current.Next;
		}

	}

	public static void main(String[] args) {
		DoublyLinkedLists k = new DoublyLinkedLists();
		k.Insertatend(10);
		k.Insertatend(3);
		k.Insertatend(4);
		k.Insertatend(5);
		k.Insertatend(6);
		// k.display();
		// k.insertatpos(9, 1);
		// k.insertatpos(7, 3);
		//k.Delete(6);
		k.deleteAtPos(3);
		// k.display();
		// k.CheckAscend();
		// System.out.println("LETS SEE");
		// k.BubbleSort();
		k.display();
	}
}
