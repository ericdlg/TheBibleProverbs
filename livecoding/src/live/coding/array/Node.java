package live.coding.array;

class Node {
    public int data; // data in Node.
    public Node next; // points to next Node in list.
    public Node previous; // points to previous Node in list.

    /**
     * Constructor
     */
    public Node(int data){
        this.data = data;
    }

    /**
     * Display Node's data
     */
    public void displayNode() {
        System.out.print( data + " ");
    }
}
