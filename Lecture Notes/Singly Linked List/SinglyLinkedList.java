	
public class SinglyLinkedList{

	 Node head = null;
	 int size = 0;

	 public SinglyLinkedList(Node head) {
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
		 if (head == null)
			 head = n;
		 else {
			 Node curr = head;
			 while(curr.next != null) {
				 curr = curr.next;
			 }
			 curr.next = n;
		 }
		 size++;
	 }
	 
	 public void addFirst(int data) {
		
		 Node n = new Node(data);
		 n.next = head;
		 head = n;
		 size++;
	 }

	 public void addAfter(int insertAfter, int data) {
		 Node curr = head;
		 while(curr != null) {
			 if(curr.data == insertAfter) {
				 Node n = new Node (data);
				 n.next = curr.next;
				 curr.next = n;
				 break;
			 }
			 curr = curr.next;
		 }
		 size++;
	 }
	 
	 
	 public Node removeLast() {
		 Node curr = head;
		 if (curr == null || curr.next == null) {
			 head = null;
			 return curr;
		 }
		 else {
			 Node nextNode = curr.next;
			 while(curr.next != null) {
				 if(nextNode.next == null ) {
					 curr.next = null;
				 }
				 else {
					 curr = nextNode;
					 nextNode = nextNode.next;
				 }
			 }
		 }
		 size--;
		 return curr;
	 }
	 
	 public Node removeFirst() {
		if(head != null) {
			Node toDelete = head;
			head = head.next;
			return toDelete;
		}
		return null;
	}
	 
	public Node removeAfter(int data) {
		Node curr = head;
		Node toDelete = null;
		while(curr != null) {
			if(curr.data == data && curr.next != null){
				toDelete = curr.next;
				curr.next = toDelete.next;
				break;
			}
			curr = curr.next;
		}
		return toDelete;
	}
}