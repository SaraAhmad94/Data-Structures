package LinkedLists;

public class Node {
	public int data;
	public Node next;
	//Constructor
	Node()
	{
		data=0;
		next=null;
	}
	//Constuctor2
	Node(int n)
	{
		data=n;
		next=null;
	}
	Node(int k, Node l)
	{
		data=k;
		next=l;
	}
	

}
