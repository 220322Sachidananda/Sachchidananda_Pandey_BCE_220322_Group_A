// Java program to illustrate the BorderLayout
import java.awt.*;
import javax.swing.*;
 
class BoderLayoutDemo extends JFrame {
 
    BoderLayoutDemo()
    {
         
        
        JPanel pa = new JPanel();
 
       
        pa.setLayout(new BorderLayout());
 
        pa.add(new JButton("North"), BorderLayout.NORTH);
 
       
        pa.add(new JButton("South"), BorderLayout.SOUTH);
 
        
        pa.add(new JButton("East"), BorderLayout.EAST);
 
        pa.add(new JButton("West"), BorderLayout.WEST);
 
       
        pa.add(new JButton("Center"), BorderLayout.CENTER);
 
       
        
        add(pa);
 
      
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        setSize(300, 300);
 
      
        setVisible(true);
    }
}
 
class MainFrame {

    public static void main(String[] args)
    {
        new BoderLayoutDemo();
    }
}