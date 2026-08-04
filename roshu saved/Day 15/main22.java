class Linked_list{
    Node root;
void append(int data) {
        Node t =new Node(data);
        if(root==null) {
            root=t;
            return;
        }
        Node x= root;
        while(x.add!=null) {
            x=x.add;
        }
        x.add=t;
        return;
    }
    void display() {
        if(root==null) {
            System.out.println("cannot print");
        }
        Node x =root;
        System.out.println("data|add");
        System.out.println("******************");
        while(x!=null) {
            System.out.println(x.data+ " | "+ x.add);
            x=x.add;
        }
    }
    int len() {
        int i=0;
        if(root==null) {
            return 0;
        }
        i=1;
        Node x=root;
        while(x.add!=null) {
            x=x.add;
            i++;
        }
        return i;
    }
  

void search(int key) {
    int i=0;
    if(root == null) {
        System.out.println("no element");
        return;
    }
    i=1;
    Node x=root;
    while(x!=null) {
      
        if(x.data==key) {
            System.out.println("key found in"+" "+ i);
            return;
          
        }
      
        x=x.add;
        i++;
    }
   System.out.println("key not found");
}
void delete(int ind) {
    int n=this.len();
    if(root == null) {
        System.out.println("no element to delete");
        return;
    }
    if(ind<0)
        ind=0;
    else if(ind>n-1)
        ind = n-1;
    Node x =root;
    if(ind ==0) {
        root = x.add;
        x.add = null;
        return;
    }
    while(ind!=1) {
        x=x.add;
        ind = ind-1;
        
    }
    Node y = x.add;
    x.add = y.add;
    y.add=null;
    return;

}
void insert(int ind,int data) {
    int n=this.len();
    Node t1 = new Node(data);
    if(root == null) {
        root = t1;
    }
    if(ind<0)
        ind=0;
    else if(ind>n)
        ind = n;
    
    if(ind==0) {
  
        t1.add=root;
        root=t1;
        return;
        
    }
    Node x = root;
    if(ind==n) {
        while(x.add==null) {
            x.add=t1;
            t1.add=null;
            
        }
    }
    
    while(ind!=1) {
        x=x.add;
        ind = ind-1;
        
    }
    t1.add=x.add;
    x.add =t1;
    
    
}
void sort() {
    for(Node i = root;i.add!=null;i=i.add) {
        for(Node j=i.add;j!=null;j=j.add) {
            if(i.data>j.data) {
                i.data=i.data+j.data-(j.data=i.data);
            }
        }
        
    }
}
void bubble() {
       for (Node i = root; i != null; i = i.add) {
           for (Node j = root; j != null && j.add != null; j = j.add) {
              
               if (j.data > j.add.data) {
                   int temp = j.data;
             j.data = j.add.data;
                   j.add.data = temp;
         }
           }
      }
}


void reverse() {
       Node temp = root;
       Node last = root;

      
       while (last.add != null) {
           last = last.add;
       }

       while (temp != last && temp.add != last) {
          
           int x = temp.data;
           temp.data = last.data;
           last.data = x;

           temp = temp.add;

           Node tempLast = root;
           while (tempLast.add != last) {
               tempLast = tempLast.add;
           }
           last = tempLast;
       }

    
   }

}
class Node{
    int data;
    Node add;
    Node(int data){
        this.data=data;
    }
  
    
}
public class main22 {
   public static void main(String args[]) {
   Linked_list l =new Linked_list();
   l.append(10);
   l.append(50);
   l.append(20);
   l.append(30);
//    l.display();
//    int count = l.len();
//    System.out.println("length of ll is "+count);
  
   //l.search(10);
//    l.delete(0);
//    l.display();
//    l.sort();
//    l.display();
//    l.insert(5,60);
//    l.display();
   l.reverse();
   l.display();
  
   }

}