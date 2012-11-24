public class QueueGenImpl<T> implements QueueGen<T> {
	private Node<T> head;
	
	public QueueGenImpl() {
		head = null;
	}

	
	
	public void insert(T newElement) {
		Node<T> newNode = new Node(newElement);
		
		if (head == null) {
			head = newNode;
		}
		else { 
				Node<T> current = head;
				while (current.getNext() != null) {
					current = current.getNext();
				}
				current.setNext(newNode);
			}
	}
	
				
	public T retrieve() {
		if (head==null) {
			System.out.println("The queue is empty bro");
			return null;
		}
			Node<T> temp = head;
			head = head.getNext();
			return temp.getValue();
	}
	
	
	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
			else {
				return false;
			}
	}
}	
	