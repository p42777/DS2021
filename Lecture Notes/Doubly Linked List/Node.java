
public class Node {
	
	int data;
	Node prev;
	Node next;
	
	 public Node(int data) {
		 this.data = data;
		 this.prev = null;
		 this.next = null;
	 }

	 public int getData() {
		 return data;
	 }

	 public Node getNext() {
		 return next;
	 }

	 public void setNext(Node next) {
		 this.next = next;
	 }
	 
}
