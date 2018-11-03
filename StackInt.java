public class StackInt {
	int j,item;
	 int[] arr = new int[5];  
	 int top = -1;  
	 
	 StackInt(int sz) {    
		 arr = new int[sz];     
		 top = -1;                   
		 } 
	 
	 
	 StackInt() {  
		 arr = new int[10];   
		 top = - 1; 
		 } 
	 
	 public void print() {
		 if(top==-1) {
			 System.out.println("Stack is empty");
		 }
		 else {
			 for(int j=0; j<=top; j++) {
				 System.out.println(arr[j]);
				
			 }
		 }
	 }
	 public void push(int item) { 
		if(top!=arr.length) {
		 arr[++top] = item;
		 
	 }
		else {
			System.out.println("Can't push");}
		}
	 public void getTop() { 
		
		System.out.println(top);
		}
	 public void pop() { 
		 if(top==-1) {
			 System.out.println("Can't pop");
		 }
		 else {
		 System.out.println(arr[top]);
		 top--;
		  }
}
	 public int peek() {
		 return arr[top];
	 }
	 public boolean equals(StackInt sd)
     {
  	   if(this.top!=sd.top)
  		  return false;
  	   else
  	   {
  		   int flag=0;
  		   for(int j=0;j<=top;j++)
  		   {
  			   if(this.arr[j]!=sd.arr[j])
  				   flag=1;
  		   }
  		   if(flag==1)
  			   return false;
  		   else
  			   return true;
  	   }
     }
	 public void min()
     {
   	  int min=99999999;
   	  for(int j=0;j<=top;j++)
   	  {
   		   if(arr[j]<min)
   			   min=arr[j];
   		   
   	  }
   	  System.out.println(min);
     }
	 
	 StackInt duplicate()
     {
    	 StackInt s=new StackInt();
    	     for(int j=0;j<=top;j++)
    	     {
    	    	 s.push(this.arr[j]);
    	     }
    	     return s;
    	 }
	 void sort()
     {
    	 int yu=0;
    	 for(int i=0;i<=top;i++)
    	 {
    		 yu=i;
    		 for(int j=i+1;j<=top;j++)
    		 {
    			 if(arr[yu]<arr[j])
    			 {
    				 yu=j;
    			 }
    			 
    		 }
    		 int temp=arr[i];
    		 arr[i]=arr[yu];
    		 arr[yu]=temp;
    	 }
     }
	 void sepope()
     {
    	 StackInt d=new StackInt();
    	 int p=top/2;
    	 int k=top-p;
    	 for(int j=top;j>p;j--)
    	 {
    		 
    		 d.push(arr[j]);
    		 this.pop();
    	 }
    	 this.pop();
    	 for(int i=0;i<k;i++)
    	 {
    		this.push(d.arr[d.top]);
    		 d.pop();
    	 }
    	 
     }
	 
}