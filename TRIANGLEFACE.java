package TRIANGLES;

import java.awt.Frame;
import java.awt.Graphics;
public class TRIANGLEFACE extends Frame 
{
TRIANGLEFACE()
{
    setSize(500,500);
    setVisible(true);
    
}
@Override
public void paint(Graphics g)
{
    
    g.drawString("TRIANGLE FACING EACHOTHER",10,50);
    super.paint(g);

    g.drawLine(225,100,225,300);
    g.drawLine(50,200,225,100);
    g.drawLine(50,200,225,300);

    g.drawLine(245,100,245,300);
    g.drawLine(420,200,245,100);
    g.drawLine(420,200,245,300);

    g.drawString("A",40,200);
    g.drawString("B",225,90);
    g.drawString("C",225,310);

    g.drawString("A'",430,200);
    g.drawString("B'",245,90);
    g.drawString("C'",245,310);

    
    
    
}
public static void main(String[] args) {
    new TRIANGLEFACE();
    
    
}

}