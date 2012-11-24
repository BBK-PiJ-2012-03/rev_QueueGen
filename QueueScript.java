public class QueueScript {
	
	public static void main(String[] args) {
		QueueScript script = new QueueScript();
		script.launch();
	}

	public void launch() {
		QueueGenImpl<Integer> myQueue = new QueueGenImpl<Integer>();
		System.out.println(myQueue.isEmpty());
		myQueue.insert(5);
		myQueue.insert(4);
		System.out.println(myQueue.isEmpty());
		myQueue.insert(3);
		myQueue.insert(2);
		myQueue.insert(1);
		System.out.println(myQueue.retrieve());
		System.out.println(myQueue.retrieve());
		System.out.println(myQueue.retrieve());
		System.out.println(myQueue.retrieve());
		System.out.println(myQueue.retrieve());
		System.out.println(myQueue.retrieve());
		System.out.println(myQueue.isEmpty());
	}
}	