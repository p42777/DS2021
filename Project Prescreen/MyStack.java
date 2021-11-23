import java.util.ArrayList;
import java.util.List;
import java.util.Stack;



public class MyStack<T> {
	
	private List<T> list = new ArrayList<T>();
	private String name = "no name";
	
	public MyStack(String n){
		this.name = n;
	}
	public String getName(){
		return name;
	}

	public void push(T e) {
		list.add(e);
	}

	public T pop() {
		return list.remove(list.size() - 1);
	}

	public T top() {
		return list.get(list.size() - 1);
	}

	public void printStack() {
	
			  StringBuilder sb=new StringBuilder(); 
			  for(int i=0;i<list.size();i++) {
			   sb.append(list.get(i)+" ");
			  }
			  System.out.println(getName()+" |- "+sb);
			 }

	public int size() {
		return list.size();
	}
}



