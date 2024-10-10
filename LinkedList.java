public class LinkedList{
	static class Node{
		int data;
		Node next;

		Node(int data){
			this.data = data;
			this.next = null;
			}
		}
		Node head;

		public void add(int data) {
			Node newNode = new Node(data);

			if (head == null){
				head = newNode;
				}else{
					Node current = head;
					while (current.next !=null){
						current = current.next;
						}
						current.next = newNode;
					}
			}
			public void display() {
				Node current = head;
				while (current != null) {
					System.out.print(current.data + " ");
					current = current.next;
					}
					System.out.println();
				}
				public static void main (String [] args){
					LinkedList list = new LinkedList();

					list.add(1);
					list.add(2);
					list.add(3);

					list.display();
					}
	}