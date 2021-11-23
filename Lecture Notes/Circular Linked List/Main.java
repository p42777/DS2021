
public class Main {

	public static void main(String[] args) {

		Node head = null;
		head = new Node(4);
		CircularLinkedList S = new CircularLinkedList(head);
		S.addLast(8);
		S.addLast(16);
		S.addAfter(8, 12);
		S.addFirst(4);
		System.out.println("CLL size = " + S.size());
		System.out.println("First data of CLL = " + S.getFirst());
		System.out.println("Third data of CLL = " + S.getNth(3));
		System.out.println("Last data of CLL = " + S.getLast());
		System.out.println("Is CLL empty = " + S.isEmpty());
		
	}
	
}