class Solution{
	public static String Josephus(int a, int b){
        // fill you code Here
        CircularLL cll = new CircularLL();
        for (int i = 0; i < a; i++)
         {
			cll.add(i);
        }
		cll.Circle();
		int pos = 1;
		Node temp = cll.head;
		int removed = 0;
		String present = "";
		while (removed != a) {
			temp = temp.next;
			pos++;
            if (pos == b) 
            {
				pos = 1;
				present += temp.data + " ";
				Node prev = temp.prev;
				Node next = temp.next;
				prev.next = next;
				next.prev = prev;
				removed++;
				temp = temp.next;
			}
		}
		return present.trim();
	}
}