package Interview;

public class QueueClass {
	private int array[];
	private int First, Last, MaxSize, Size;

	public QueueClass(int n) {
		MaxSize = n;
		First = 0;
		Last = 0;
		Size = 0;
		array = new int[MaxSize];

	}

	public boolean IsEmpty() {
		if (Size == 0) {
			return true;
		}
		return false;
	}

	public boolean IsFull() {
		if (Last == MaxSize) {
			return true;
		}
		return false;
	}

	public int GetCurrentQueueSize() {
		return Size;
	}

	public int Dequeue() {
		if (IsEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		
		First=First+1;
		Size--;
	//	System.out.println("Successful and the current size of Queue is " + Size);
		return array[First-1];

	}

	public void Enqueue(int n) {
		if (IsFull()) {
			System.out.println("Queue is Full");
		
		}
		else {
			Last= Last + 1;
			Size++;
			array[Last] = n;
			if (Size==1)
			{
				First=Last;
			}
		}
	}

	public int peek() {
		return array[First];
	}

	public void display() {
		if (IsFull()) {
			System.out.println("Queue is Full");
		}
		if (IsEmpty()) {
			System.out.println("Queue is Empty");
		}
		for (int i = First; i <= Last; i++) {
			System.out.println(array[i]);
		}
		//STACK USING QUEUES
	}

	public static void main(String[] args) {
		QueueClass queue = new QueueClass(10);
		QueueClass queue1= new QueueClass(10);
		/*
		 * boolean E=stack.IsEmpty(); System.out.println(E); boolean
		 * F=stack.IsFull(); System.out.println(F);
		 */
		queue.Enqueue(7);
		queue.Enqueue(8);
		queue.Enqueue(9);
		//int k = stack.GetCurrentQueueSize();
		// System.out.println(k);
	   // queue.display();
	    //queue.Dequeue();
	   // queue.display();
		//Implement Stack using two queuee  
	    while(queue.Size>1)
	   {
		   queue1.Enqueue(queue.Dequeue());
	   }
        queue1.display();
	}
}
