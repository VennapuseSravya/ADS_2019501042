class stack{
    Node first;                              //Node is the data type i.e abstract data type

    private class Node{
         String item;
         Node next;                      // they are the references of the node class

    }   


    public void push(String item){
        Node previousNode = first;
        first = new Node();
        first.item  = item;
        first.next = previousNode;

    } 

    public String pop(){
        if(first!= null){
             String  item = first.item;
            first = first.next;
            return item;
        }
        return "";

    }

    public boolean isEmpty(){
        return first == null;

    }   
}