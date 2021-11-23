
public class Main {

	public static void main(String[] args) {

		Node head = null;
		head = new Node(4);
		SinglyLinkedList S = new SinglyLinkedList(head);
		S.addLast(8);
		S.addLast(16);
		S.addAfter(8, 12);
		S.addFirst(4);
		S.addFirst(0);
		System.out.println("SLL size = " + S.size());
		System.out.println("First data of SLL = " + S.getFirst());
		System.out.println("Third data of SLL = " + S.getNth(3));
		System.out.println("Last data of SLL = " + S.getLast());
		System.out.println("Is SLL empty = " + S.isEmpty());
		
	}
	
}
