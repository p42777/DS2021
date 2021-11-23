
public class CircularLinkedList {
	Node last;
	int size = 0;
	
	public CircularLinkedList (Node last) {
		this.last = last;
		this.size = size();
		if(this.last != null) {
			this.last.next = last;
		}
	}
	public int size() {
		 return size;
	}

	public boolean isEmpty() {
		 return size == 0;
	}
	
	public int getFirst() {
		if (isEmpty())
			return -1;
		return last.next.getData();
	}
	 
	public int getLast() {
		if (isEmpty())
			return -1;
		else {
			return last.getData();
		}	
	}
	 
	public int getNth(int index) {
		 Node curr = last.next;
		 int nth = 0;
	     int count = 0; /* index of Node we are currently looking at */
	     while (curr != last ){
	           if (count == index)
	               nth = curr.getData();
	           count++;
	           curr = curr.next;
	       }
	     return nth;
	}
	 
	
	public void addLast(int data) {
		Node n = new Node (data);
		if(last == null) {
			n.next = n;
		}
		else {
			n.next = last.next;
			last.next = n;
		}
		last = n;
		size++;
	}
	
	public void addFirst(int data) {
		Node n = new Node(data);
		if(last == null) {
			n.next = n;
			last = n;
		}
		else{
			n.next = last.next;
			last.next = n;
		}
		size++;
	}
	
	public void addAfter(int insertAfter, int data) {
		if(last != null) { 
			Node curr = last;
		
		do {
			if(curr.data == insertAfter) {
				Node n = new Node (data);
				n.next = curr.next;
				curr.next = n;
				break;
			}
			curr = curr.next;
		} while(curr != last);
		}
		size++;
	}
	
	public Node removeLast() {
		Node toDelete = last;
		size--;
		if(last == null || last.next == last) {
			last = null;
			return toDelete;
		}
		Node prev = last.next;
		while(prev.next != last) {
			prev = prev.next;
		}
		prev.next = last.next;
		last = prev;
		return toDelete;
	}
	
	public Node removeFirst() {
		Node toDelete = last;
		size--;
		if(last == null || last.next == last) {
			last = null;
			return toDelete;
		}
		toDelete = last.next;
		last.next = toDelete.next;
		return toDelete;
	}
	
	public Node removeAfter(int data) {
		if(last == null) return null;
		size--;
		Node toDelete = null;
		Node curr = last;
		do {
			if(curr.data == data) {
				toDelete = curr.next;
				if(curr.next == curr) {
					last = null;
				}
				else {
					curr.next = toDelete.next;
					if(toDelete == last) {
						last = curr;
					}
				}
				break;
			}
			curr = curr.next;
		}while(curr != last);
		return toDelete;
	}
	
}
