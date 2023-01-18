

/**
 *
 * @author Jasper Rey P.
 */

class Node
{
       private Node next,pre;
 private Customer customer; 
    public Node(Node next, Node pre, Customer customer) {
        this.next = next;
        this.pre = pre;
        this.customer = customer;
    }

    public Node() {
    next=null;
    pre=null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPre() {
        return pre;
    }

    public void setPre(Node pre) {
        this.pre = pre;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
             
        

}

public class LinkedList {

    Node head,tail;
    
    public LinkedList() {
       this.head=null;
       this.tail=null;
    
    }
    
    
    
     public void insert(Customer customer)
     {
            Node node= new Node();
             node.setCustomer(customer);
       
         if(head==null||tail==null)
       {
              head=node;
              tail=node;
       
       }
       
       else
       {
             head.setNext(node);
             node.setPre(head);
             head=node;
       
       
       }
       
     
     
     }
     
     
     public Customer getInfo(String cnic)
     {
           Node temp=head;
           
           while(temp!=null)
           {
               
               if(cnic.equals(temp.getCustomer().getAccountNumber()))
                    return temp.getCustomer();
                     temp=temp.getPre();
           
           }
           return null;
     
     }
    
    
    public int size()
     {
           Node temp=head;
           int size=0;
           while(temp!=null)
           {
              size++;
               temp=temp.getPre();
           
           }
           return size;
     
     }
    
     public String allData()
     {
           Node temp=head;
           String data="";
           while(temp!=null)
           {
               data+=temp.getCustomer().toString()+"\n";
               temp=temp.getPre();
           
           }
           return data;
     
     }


    boolean check(String card) {
         Node temp=head;
         
           while(temp!=null)
           {
               
               if(card.equals(temp.getCustomer().getCard()))
               {
                   return true;
               }
               temp=temp.getPre();
           
           }
           return false;
    }

    boolean isExist(String text) {
      Node temp=head;
         
           while(temp!=null)
           {
               
               if(text.equals(temp.getCustomer().getAccountNumber()))
               {
                   return true;
               }
               temp=temp.getPre();
           
           }
           return false;
    }

    String CnicInfo(String text) {
         Node temp=head;
         
           while(temp!=null)
           {
               
               if(text.equals(temp.getCustomer().getAccountNumber()))
               {
                   return "\nAccount Number                ="+temp.getCustomer().getAccountNumber()
                         +"\nName                          ="+temp.getCustomer().getName()
                         +"\nPIN                           ="+temp.getCustomer().getPin()
                         +"\nCard#                         ="+temp.getCustomer().getCard()
                         +"\nRegistration Reference        ="+temp.getCustomer().getRegistrationReference()
                         +"\nBalance                       ="+temp.getCustomer().getBalance();
                                 
               }
               temp=temp.getPre();
           
           }
           return "";
    }

    String Deposit(String text, double amount) {
    Node temp=head;
         
           while(temp!=null)
           {
               
               if(text.equals(temp.getCustomer().getAccountNumber()))
               {
                   temp.getCustomer().deposit(amount);
                   
                  return ""; 
               }
               
               temp=temp.getPre();
           
           }
           return "";
    
    }

    void Withraw(Customer cuss) {
    Node temp=head;
         
           while(temp!=null)
           {
               
               if(cuss.getAccountNumber().equals(temp.getCustomer().getAccountNumber()))
               {
                   temp.setCustomer(cuss);
                   break;
               }
               
               temp=temp.getPre();
           
           }
    
    }

    
    
    Customer checkPInCard(String text, String text0) {
    
    
    Node temp=head;
         
           while(temp!=null)
           {
               
               if(text.equals(temp.getCustomer().getPin()+"") && text0.equals(temp.getCustomer().getCard()) )
               {return temp.getCustomer();
               }
               
               temp=temp.getPre();
           
           }
           return null;
    
    }
    
}
