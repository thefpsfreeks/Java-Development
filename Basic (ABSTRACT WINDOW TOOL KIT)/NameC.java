import java.awt.*;
class Layout extends Frame
{
   Label l1,l2,l3,l4,l5,l6;
   TextField t1,t2,t3,t4;
   TextArea T5;
   Button b1,b2;
   Checkbox c1,c2,c3,c4;
   CheckboxGroup C4;
Layout(){
      setLayout(new GridLayout(11,2));
      l1=new Label("Name");
      l2=new Label("Address");
      l3=new Label("Adhar No");
      l4=new Label("Qualification");
      l5=new Label("Gender");
      b1=new Button("Save");
      b2=new Button("Cancel");
      t1=new TextField(20);
      t2=new TextField(20);
      t3=new TextField(20);
      t4=new TextField(20);
      c1=new Checkbox("10th");
      c2=new Checkbox("11th");
      c3=new Checkbox("12th");
      c4=new Checkbox("PG");
      C4=new CheckboxGroup();
      l6=new Label("FeedBack");
      T5=new TextArea(8,20);
      
      add(l1);
      add(t1);
      add(l2);
      add(t2);
      add(l3);
      add(t3);
      add(l5);
      add(new Label());
      add(new Checkbox("Male",C4,true));
      add(new Checkbox("Female",C4,false));
      add(l4);
      add(c1);
      add(new Label());
      add(c2);
      add(new Label());
      add(c3);
      add(new Label());
      add(c4);
      add(l6);
      add(T5);
      add(b1);
      add(b2);
      
      
      setTitle("Name");
      setVisible(true);
      setSize(600,350);
      }
}
class NameC{
      public static void main(String args[]){
             Layout o=new Layout();
             }
} 

       