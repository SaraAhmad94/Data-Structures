package Interview;

import java.util.NoSuchElementException;

public class StackClass {
	 private int array[];
	 private int top,MaxSize,size;
	 
     public StackClass()
     {
    	 top=0;
     }
     public StackClass(int n)
     {
    	 MaxSize=n;
    	 top=0;
    	 size=0;
         array=new int [MaxSize];
         
     }
     public boolean IsEmpty()
     {
    	 if(size==0)
    	 {
    		 return true;
    	 }
    	 return false;
     }
     public boolean IsFull()
     {
    	 if(top==MaxSize)
    	 {
    		return true;
    	 }
    	return false;
     }
     public int GetCurrentStackSize()
     {
    	 return size;
     }
     public int pop()
     {   
    	 if (IsEmpty())
    	 {   
    		// System.out.println("Stack is Empty");
    		 return -1;
    	 }
    	 else
    	 {
             top=top-1;
    		 size--;
    		// System.out.println("Successful and the current size of stack is " + size);
    		 return array[top+1];
    	 }
    	 
     }
     public void push(int n)
     {   
    	 if (IsFull())
    	 {
    		 System.out.println("Stack is Full");
    	 }
    	 else
    	 {   
    		 top=top+1;
    		 size++;
    		 array[top] = n;
    	 }
     }
     public int peek() 
     {
         return array[top];
      }

     public void display()
     {
    	 if (IsFull())
    	 {
    		 System.out.println("Stack is Full");
    	 } 
    	 if (IsEmpty())
    	 {
    		 System.out.println("Stack is Empty");
    	 }
    	 for ( int i=top; i >0; i--)
    	 {
    		 System.out.println(array[i]);
    	 }

     }
     
     public static void main(String[] args)
 	{
    	 StackClass stack =new StackClass(10);
    	 StackClass stack1 =new StackClass(10);
    	 int[] Sarray= new int [10];
    	 int i =0;
    	 /*boolean E=stack.IsEmpty();
         System.out.println(E);
    	 boolean F=stack.IsFull();
    	 System.out.println(F);*/
    	 stack.push(1);
    	 stack.push(2);
    	 stack.push(3);
    //	 int k =stack.GetCurrentStackSize();
    	// System.out.println(k);
    	//stack.display();
        //  int k =stack.pop();
       //  System.out.println(k);
       // stack.display();
    	 //Implement queue using two stacks //PUSH IS SIMPLE 
    	 //POP
    	while(!stack.IsEmpty())
    	 {
    			stack1.push(stack.pop());
    	 }
    	 //stack1.display();
    	 stack1.pop();
    	 stack1.display();
    	

    	 }
  	}

