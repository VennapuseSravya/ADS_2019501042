class Node {
    int data;
    Node next;
    Node prev;
    Node(int data) {
        this.data = data;
    }
}
class CircularLL {
    Node head;
    Node tail;
    public void add(int data) 
    {
        Node node = new Node(data);
        if (head == null) 
        {
            head = node;
            tail = node;
        } else 
        {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }
    public void Circle()
    {
        tail.next = head;
        head.prev = tail;
    }
}