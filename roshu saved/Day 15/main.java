class main2 {
    public static void main(String a[]) {
        LinkedList l = new LinkedList();
        System.out.println(l.len());
        l.append(10);
        l.append(20);
        l.append(30);
        l.append(40);
        l.delete(1);
        l.disp();

        System.out.println(l.search(40));
    }
}

class LinkedList {
    Node root;

    void append(int data) {
        Node t = new Node(data);

        if (root == null) {
            root = t;
            return;
        }
        Node x = root;
        while (x.add != null)
            x = x.add;

        x.add = t;
        return;
    }

    void disp() {
        if (root == null) {
            System.out.println("cant disp");
            return;
        }
        Node x = root;
        System.out.println("data | add ");
        System.out.println("**********************");
        while (x != null) {
            System.out.println(x.data + " | " + x.add);
            x = x.add;
        }
    }

    int search(int key) {
        if (root == null) {
            System.out.println("no lists");
            return -1;
        }
        Node x = root;
        int i = 0;
        while (x != null) {
            if (x.data == key)
                return i;
            x = x.add;
            i++;

        }
        return -1;
    }

    void delete(int ind) {
        System.out.print(ind + " ");

        int n = this.len();
        if (root == null) {
            System.out.println("no one are there ");
            return;
        }
        if (ind < 0)
            ind = 0;
        else if (ind > n - 1)
            ind = n - 1;
        Node x = root;
        if (ind == 0) {
            root = x.add;
            x.add = null;
            return;
        }
        while (ind != 1) {
            x = x.add;
            ind = ind - 1;
        }
        Node y = x.add;
        x.add = y.add;
        y.add = null;
        return;
    }

    void sort(){
        for(Node i=root;i.add!=null;i=i.add){
            for(Node j=i.add;j!=null;j=j.add){
                if(i.data>j.data){
                    i.data=i.data+j.data-(j.data = i.data);
                }
            }
        }
    }

    int len() {
        int i = 0;
        if (root == null)
            return i;
        i = 1;
        Node x = root;
        while (x.add != null) {
            x = x.add;
            i++;
        }
        return i;
    }
}

class Node {
    int data;
    Node add;

    Node(int data) {
        this.data = data;
    }
}