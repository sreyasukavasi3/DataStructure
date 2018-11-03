
public class Stackchar {
    char[] df;
    int tp;
    Stackchar()
    {
       df=new char[100];
       tp=-1;
    }
    void push(char n)
    {
  	  if((tp+1)!=df.length)
  	  df[++tp]=n;
  	  else
  	  {
  		  System.out.println("can't push");
  	  }
    }
    void pop()
    {
  	  if(tp!=-1)
  	  {
  		 System.out.print(df[tp]);
  		  tp--;
  
  	  }
  	  else
  	  {
  		  System.out.println("stack empty");
  	  }
    }
    void stringreversal(String s)
    {
    	
    	int g=s.length();
        	for(int i=0;i<s.length();i++)
        	{
        		char t=s.charAt(i);
        		this.push(t);
        	}
        	for(int i=0;i<g;i++)
        	{
        		this.pop();
        	}
        	System.out.print("\n");
    }
    
}
