package tw.ch3;

public class CircularList extends List {

	// �غc�l:�إ����Φ�C
	public CircularList(int[] array) {
		Node newnode;
		first = null;
		for (int i = 0; i < array.length; i++) {
			newnode = new Node(array[i]);
			newnode.next = first;
			first = newnode;
			Node current = first;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newnode;
		}

	}

	@Override
	public boolean isListEmpty() {
		if (first == null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void printList() {
		Node current = first;
		do {
			System.out.print("[" + current.data + "]");
			current = current.next;
		} while (current.next != first);
		System.out.println();
	}

	// ��k:������C���J
	public void inserNode(Node ptr, int data) {
		Node newnode = new Node(data);
		Node current = first;
		if (ptr == null) {
			newnode.next = first;
			while (current.next != first) {
				current = current.next;
			}
			current.next = newnode;
		} else {
			newnode.next = ptr.next;
			ptr.next = newnode;
		}
	}

	public int deleteNode(Node ptr) {
		int value = ptr.data; // ���o�R�����`�I���
		if (isListEmpty()) { // �ˬd��C�O�_����
			return -1;
		}
		if (first == ptr) {
			Node previous = first;
			while (previous.next != first) {
				previous = previous.next;
			}
			first = first.next;
			previous.next = ptr.next;
		} else {
			Node previous = first;
			while (previous.next != ptr) {
				previous = previous.next;
			}
			previous.next = ptr.next;
		}
		return value;
	}

}
