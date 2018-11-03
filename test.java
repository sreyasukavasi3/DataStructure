
public class test {
	public static void main(String[] args) {
	StackInt si = new StackInt(); 
	System.out.println("Stack top is " + si.top); 
	//System.out.println(si.arr.length); 
	//System.out.println(si.arr.length); 
	si.print();
	si.push(100);
	si.push(200); 
	si.push(900);
	si.push(300); 
	si.push(20); 
	si.push(30);
	si.print();
    si.getTop();
    
    si.pop();
    si.print();
    si.peek();
    si.print();
    System.out.println(si.peek()); si.push(100); si.print();
    si.push(123);
    si.push(231);
    si.push(1234);
    si.push(1123);
    si.min();
    StackInt st=si.duplicate();
    st.sort();
    st.print();
    si.sepope();
    si.print();
    
}}