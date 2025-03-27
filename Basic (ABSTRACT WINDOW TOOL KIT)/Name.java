import java.awt.*;
class Layout extends Frame
{
Label l1,l2,l3,l4,l5;
Button b1,b2;
TextField t1,t2,t3,t4,t5;

Layout(){
    setLayout(new GridLayout(6,2));
    l1=new Label("First Name");
    l2=new Label("Last Name");
    l3=new Label("Email");
    l4=new Label("Conform Email");
    l5=new Label("Captcha");
    t1=new TextField(20);
    t2=new TextField(20);
    t3=new TextField(20);
    t4=new TextField(20);
    t5=new TextField(20);
    b1=new Button("Register");
    b2=new Button("Cancel");
    add(l1);
    add(t1);
    add(l2);
    add(t2);
    add(l3);
    add(t3);
    add(l4);
    add(t4);
    add(l5);
    add(t5);
    add(b1);
    add(b2);
    
    setTitle("Name");
    setVisible(true);
    setSize(500,250);
    }
}
class Name{
     public static void main(String args[]){
            Layout o=new Layout();
            }
}  