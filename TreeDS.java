package TreeDS;

import LinkedLists.Node;

public class TreeDS {
	public BNode root;
	
	
	TreeDS()
	{
	  root=null;
	}
	public void BSTinsert(int k )
	{
		root=Insertion(root,k);
	}
	public BNode Insertion(BNode root, int k)
	{
		if(root == null)
		{
		 root = new BNode();
		 root.data= k;
		 root.LeftChild=null;
		 root.RightChild=null;
		 return root;
		}
		else
		{
		  if(k<root.data)
		   {
		     root.LeftChild=Insertion(root.LeftChild,k);
		     return root;
		   }
		  else if(k > root.data)
		   {
		     root.RightChild= Insertion(root.RightChild,k);
		     return root;
		   }
		  else 
		   {
		     System.out.println("duplicate value"); 
		     return root;
		   }
		}   
	}
	
	public void insert(int k)
	{  
		BNode insertN= new BNode(k);
		BNode current= new BNode();
		current=root;
		if (root==null)
		{
			root=insertN;
			root.LeftChild=null;
			root.RightChild=null;
		}
		else
		{
			if(current.data>insertN.data)
			{
				while(current.LeftChild!=null)
				{
					current=current.LeftChild;
				}
				if(current.data>insertN.data)
				{
					current.LeftChild=insertN;
				}
				else
				{
					current.RightChild=insertN;
				}
			}
			else
			{
				while(current.RightChild!=null)
				{
					current=current.RightChild;
				}
				if(current.data>insertN.data)
				{
					current.LeftChild=insertN;
				}
				else
				{
					current.RightChild=insertN;
				}
			}
		}
	}

		
	public void Search(int k )
	{  
		BNode insertN= new BNode(k);
		BNode current= new BNode();
		current=root;
		int count=0;
		if (root==null)
		{
			System.out.println("Element Not Found");
			count=1;
		}
		while(current!=null)
		{   
			
			if(current.data==insertN.data)
			{   
				count=1;
				System.out.println("Element Found");
				break;
			}
			if(current.data>insertN.data)
			{
				current=current.LeftChild;
			}
			else
			{
				current=current.RightChild;
			}
		}
		if(count==0)
		{
			System.out.println("Element Not Found");
		}
	}
	public void preorder(BNode root)
	{  
		if(root!=null)
		{   
			System.out.println(root.data);
			preorder(root.LeftChild);
			preorder(root.RightChild);
			
		}
		
	}
	public void Ppreorder()
	{
		preorder(root);
	}
	
	public int BSTsize()
	{   
		return Size(root);
	}
	public int Size(BNode m)
	{  
		int size=0;
		while(m!=null)
		{
			 size=1+Size(m.LeftChild)+Size(m.RightChild);
		}
		return size;
	}
	
	public static void main(String[] args)
	{
		TreeDS s =new TreeDS();
		s.BSTinsert(27);
     	s.BSTinsert(14);
		s.BSTinsert(35);
		s.BSTinsert(10);
		s.BSTinsert(19);
		s.BSTinsert(31);
		s.BSTinsert(42);
	 	//s.Ppreorder();
		//s.Search(0);
	 	//s.Ppreorder();
		s.Ppreorder();
	}
	}

