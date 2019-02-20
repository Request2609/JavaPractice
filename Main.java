
class Node {

	private Node previous;
	private Node next;
	private Object obj;

	public Node getPrevious() {
		return previous;
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getNext() {
		return next;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

}

public class Main {

	private Node first;
	private Node last;
	private int size;

	public void add() {

	}

	public void add(Object obj) {

		Node n = new Node();
		if (first == null) {

			n.setObj(obj);
			n.setPrevious(null);

			first = n;
			last = n;
		} else {

			n.setPrevious(last);
			n.setObj(obj);
			n.setNext(null);
			last.setNext(n);
			last = n;
		}
		size++;
	}

	public Object get(int index) {
		check(index);

		if (first == null) {
			return null;
		}

		Node temp = first;
		int count = 0;
		while (temp != null) {

			if (count == index) {
				break;
			}
			temp = temp.getNext();
			count++;
		}
		// index越界如何处理
		return temp.getObj();
	}

	public Node node(int index) {
		Node temp = null;
		if (first != null) {
			temp = first;
		}
		for (int i = 0; i != index; i++) {
			temp = temp.getNext();
		}
		return temp;
	}

	public void remove(int index) {

		check(index);
		Node temp = first;

		temp = node(index);
		if (temp == first) {

			first = temp.getNext();
			first.setPrevious(null);
			return;
		} else {
			Node tt = temp.getNext();
			temp.setNext(tt.getNext());
			tt.setPrevious(temp);
			return;
		}
	}

	public void add(int index, Object obj) {
		Node temp = node(index);
		if (temp != null) {
			Node tt = temp.getNext();
			Node newNode = new Node();
			newNode.setObj(obj);
			newNode.setNext(tt);
			tt.setPrevious(newNode);
			temp.setNext(newNode);
			newNode.setPrevious(temp);
		}
	}

	public int size() {

		return size;
	}

	public void check(int index) {

		if (index < 0 || index >= size) {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] arg) {

		Main ls = new Main();
		ls.add("aaa");
		ls.add("ddd");
		System.out.println(ls.get(0).toString());
		System.out.println(ls.get(1).toString());
	}
}
