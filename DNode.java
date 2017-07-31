package LinkedLists;

public class DNode {
		public int Data;
		public DNode Next;
		public DNode Previous;
		//Constructor
		DNode()
		{
			Data=0;
			Next=null;
			Previous=null;
		}
		//Constuctor2
		DNode(int n)
		{
			Data=n;
			Next=null;
			Previous=null;
		}
		
		DNode(int k, DNode l, DNode m)
		{
			Data=k;
			Next=l;
			Previous=m;
		}
}

