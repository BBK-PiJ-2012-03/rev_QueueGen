public interface QueueGen<T> {
	
	//adds an element of type T to the queue
	void insert(T newElement);
	
	//delets an element from the end of the queue and returns it
	T retrieve();
	
	//returns true if queue is empty, false otherwise
	boolean isEmpty();
}	
	
	