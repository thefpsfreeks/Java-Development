import java.awt.*;
class Layout extends Frame
{
Label l1,l2,l3 ;
Button b1,b2 ;
TextField t1,t2;
Checkbox c1;

Layout(){
    setLayout(new GridLayout(4,2));
    l1=new Label("User Name");
    l2=new Label("Password");
    b1=new Button("Login");
    b2=new Button("Register");
    t1=new TextField(20);
    t2=new TextField(20);
    l3=new Label("Remember Password");
    c1=new Checkbox("Remember Password");
    add(l1);
    add(t1);
    add(l2);
    add(t2);
    add(new Label());
    add(c1);
    add(b1);
    add(b2);
    
    setTitle("Support");
    setSize(500,250);
    setVisible(true);
    }
}
class Support
{
public static void main(String args[]){
           Layout o=new Layout();
           }
}