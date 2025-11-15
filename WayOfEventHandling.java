

import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame
{
    TextField tf;
    Button b;
    int count=0;
    
    MyFrame()
    {
        super("Event Demo");
        
        tf=new TextField("0",20);
        b=new Button("Click");
        
        setLayout(new FlowLayout());
        add(tf);
        add(b);
       
b.addActionListener(new MyListener()); 
       
// b.addActionListener((ActionEvent ae)-> {count++;tf.setText(String.valueOf(count));});  (USING LAMBDA EXPRESSION)



// (USING ANONYMOUS CLASS)
/* b.addActionListener(new ActionListener()
// {
// public void actionPerformed(ActionEvent ae)
// {
// count++;
// tf.setText(String.valueOf(count));
// }
});  */ 

            
}
class MyListener implements ActionListener
{
public void actionPerformed(ActionEvent ae)
{
count++;
tf.setText(String.valueOf(count));
   }     
        
    }
        
}

public class WayOfEventHandling 
{
    public static void main(String[] args) 
    {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }    
}