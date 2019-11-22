
public class Bst<Key extends Comparable<Key>, Value> {
    Node root=null;
    class Node{
        Key key;
        Value val;
        Node left;
        Node right;
        Node(Key key,Value val){
            this.key = key;
            this.val=val;
        }
    }
    void put(Key key, Value val) {
       
        root = put(root,key,val);

    }

    Node put(Node x, Key key, Value val) {

        if (x == null) {
            return new Node(key, val);
        }    
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
             x.left  = put(x.left,  key, val);
        }     
        else if (cmp > 0) { 
            x.right = put(x.right, key, val);
        }    
        else {
            x.val  = val;
        }    
        return x;
    }
    public Key min() {
        return min(root).key;
    } 
    Node min(Node x) { 
        if (x.left == null){
            return x; 
        }    
        else  {
            return min(x.left); 
        }    
    } 
    Key max() {
        return max(root).key;
    }

    Node max(Node x) {
        if (x.right == null) {
            return x;
        } else {
            return max(x.right);
        }    
        
    }
    boolean isOrdered(Node x,Key min,Key max) {
        if (x == null) {
            return true;
        }    
        if ( x.key.compareTo(min) < 0) {
             return false;
        }
        if (x.key.compareTo(max) > 0) {
             return false;
        }     
        return isOrdered(x.left, min, x.key) && isOrdered(x.right, x.key, max);
    
    }
    public static void main(String[] args) {
        Bst<String,Integer> obj = new Bst<String,Integer>();
        obj.put("a",1);
        obj.put("d",2);
        obj.put("b",3);
        obj.put("z",4);
        System.out.println(obj.isOrdered(obj.root,obj.min(),obj.max()));
    }

}














