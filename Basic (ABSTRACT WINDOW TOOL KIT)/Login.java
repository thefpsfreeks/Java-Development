/*awt=ABSTRACT WINDOW TOOL KIT */ 
import java.awt.*;
class Layout extends Frame
{
Label l1,l2;
Button b1,b2;
TextField t1,t2;

Layout(){
    setLayout(new GridLayout(3,2));
    l1=new Label("UserName:");
    l2=new Label("Password:");
    t1=new TextField(20);
    t2=new TextField(20);
    b1=new Button("Login");
    b2=new Button("Register");
    add(l1);
    add(t1);
    add(l2);
    add(t2);
    add(b1);
    add(b2);
   setTitle("LOGIN APP");
   setSize(500,250);
   setVisible(true);
   }

}
class Login
{
public static void main(String args[]){
        Layout o=new Layout();
       }
}