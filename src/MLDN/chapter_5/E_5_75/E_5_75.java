package MLDN.chapter_5.E_5_75;

class Link{
    class Node{
        private String data;
        private Node next;

        public Node(String data){
            this.data = data;
        }
        public void add(Node newNode){
            if (this.next == null){
                this.next = newNode;
            }else {
                this.next.add(newNode); //在下一个位置处添加
            }
        }
        public void print(){
            System.out.print(this.data + "\t");
            if (this.next != null){
                this.next.print();
            }
        }
        public boolean search(String data){
            if (data.equals(this.data)){
                return true;
            }else{
                if (this.next != null){
                    return this.next.search(data);
                }
                else {
                    return false;
                }
            }
        }
        public void delete(Node previous, String data){
            if (data.equals(this.data)){
                previous.next = this.next;
            }else {
                if (this.next != null){
                    this.next.delete(this, data);
                }
            }
        }
    }

    private Node root;
    public void addNode(String data){
        Node newNode = new Node(data);
        if (this.root == null){
            this.root = newNode;
        }else {
            this.root.add(newNode);
        }
    }
    public void printNode(){
        if (this.root != null){
            this.root.print();
        }
    }
    public boolean contains(String name){
        return this.root.search(name);
    }
    public void deleteNode(String data){
        if (this.contains(data)){
            if (this.root.data.equals(data)){
                this.root = this.root.next;
            }else {
                this.root.next.delete(root, data);
            }
        }
    }
}

public class E_5_75 {
    public static void main(String args[]){
        Link I = new Link();
        I.addNode("A");
        I.addNode("B");
        I.addNode("C");
        I.addNode("D");
        I.addNode("E");
        System.out.println("===========删除之前===========");
        I.printNode();

        I.deleteNode("C");
        I.deleteNode("D");
        System.out.println();
        System.out.println("===========删除之后===========");
        I.printNode();
        System.out.println();
        System.out.println("查询节点A：" + I.contains("A"));
        System.out.println("查询节点C：" + I.contains("C"));
    }
}