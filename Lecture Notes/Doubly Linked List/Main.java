
public class Main {

	public static void main(String[] args) {

		Node head = null;
		Node curr = null;
		head = new Node(4);
		DoublyLinkedList S = new DoublyLinkedList(head);
		S.addLast(8);
		S.addLast(16);
		S.addFirst(4);
		System.out.println("DLL size = " + S.size());
		System.out.println("First data of DLL = " + S.getFirst());
		System.out.println("Second data of DLL = " + S.getNth(2));
		System.out.println("Third data of DLL = " + S.getNth(3));
		System.out.println("Last data of DLL = " + S.getLast());
		System.out.println("Is DLL empty = " + S.isEmpty());
		
	}
	
}
