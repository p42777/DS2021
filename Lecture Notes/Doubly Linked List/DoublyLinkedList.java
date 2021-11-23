
public class DoublyLinkedList {

	Node head = null;
	int size = 0;

	public DoublyLinkedList(Node head) {
		this.head = head;
		this.size = size();
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
		return head.getData();
	}
	 
	public int getLast() {
		if (isEmpty())
			return -1;
		else {
			Node curr = head;
			while(curr.next != null) {
				curr = curr.next;
			}
			return curr.getData();
		}	
	}
	 
	public int getNth(int index) {
		 Node curr = head;
		 int nth = 0;
	     int count = 0; /* index of Node we are currently looking at */
	     while (curr != null ){
	           if (count == index)
	               nth = curr.getData();
	           count++;
	           curr = curr.next;
	       }
	     return nth;
	}
	       
	public void addLast(int data) {
		Node n = new Node(data);
		if (head == null) {
			head = n;
		}
		else {
			Node curr = head;
			while(curr.next != null) {
				curr = curr.next;
			}
			curr.next = n;
			n.prev = curr;
		}
		size++;
	}
	
	 public void addFirst(int data) {
		Node n = new Node(data);
		if(head == null) head = n;
		 
		n.next = head;
		head.prev = n;
		head = n;
		size++;
	 }
	 
	 public void addAfterRecursive(Node curr, int insertAfter, int data) {
		if(curr == null) {
			size++;
			return;
		}
		if(curr.data == insertAfter) {
			Node n = new Node(data);
			if(curr.next != null) {
				curr.next.prev = n;
				n .prev = curr;
			}
		}
		else {
			addAfterRecursive(curr.next, insertAfter, data);
		}
		 
		
	 }
	 
	 public Node removeLast() {
		 Node toDelete = head;
		 if(head == null || head.next == null) {
			 head = null;
			 return toDelete;
		 }
		 while(toDelete.next != null) {
			 toDelete = toDelete.next;
		 }
		 toDelete.prev.next = null;
		 size--;
		 return toDelete;
	 }
	 
	 public Node removeFirst() {
		 Node toDelete = head;
		 if(head == null || head.next == null) {
			 head = null;
			 return toDelete;
		 }
		 else {
			 head = head.next;
			 head.prev = null;
		 }
		 size--;
		 return toDelete;
	 }
	 
	 public Node removeAfter(int data) {
		 Node toDelete = head;
		 for( ; toDelete != null ; toDelete = toDelete.next) {
			 if(toDelete.data == data) {
				 toDelete = toDelete.next;
				 break;
			 }
		 }
		 if (toDelete != null) {
			 if(toDelete.next != null) {
				 toDelete.next.prev = toDelete.prev;
			 }
			 toDelete.prev.next = toDelete.next;
		 }
		 size--;
		 return toDelete;
	 }
	 
	
}
