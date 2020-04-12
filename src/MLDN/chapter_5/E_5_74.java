package MLDN.chapter_5;

class Node{
    private String data;
    private Node next;

    public Node(String data){
        this.data = data;
    }
    public String getData(){
        return this.data;
    }
    public void setNext(Node next){
        this.next = next;
    }
    public Node getNext(){
        return this.next;
    }
}

public class E_5_74 {
    public static void main(String args[]){
        Node root = new Node("火车头");
        Node node1 = new Node("车厢1");
        Node node2 = new Node("车厢2");
        Node node3 = new Node("车厢3");
        root.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        printNode(root);
    }
    public static void printNode(Node node){
        System.out.println(node.getData());
        if (node.getNext() != null){
            printNode(node.getNext());
        }
    }
}
