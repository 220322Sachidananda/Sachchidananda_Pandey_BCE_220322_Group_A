package flag;

import java.awt.Frame;
import java.awt.Graphics;
public class FLAG extends Frame 
{
FLAG()
{
    setSize(500,500);
    setVisible(true);
}
@Override
public void paint(Graphics g)
{
    super.paint(g);
    g.drawString("NEPAL",10,50);

    g.drawLine(60,100,60,270);
    g.drawLine(60,100,210,160);
    g.drawLine(210,160,120,160);
    g.drawLine(120,160,270,220);
    g.drawLine(270,220,60,220);
    
    g.drawLine(50,85,50,270);
    g.drawLine(50,85,263,170);
    g.drawLine(263,170,171,170);
    g.drawLine(171,170,323,230);
    g.drawLine(323, 230, 60,230 );

    g.drawLine(50,270,60,270);
    

}
public static void main(String[] args) {
    new FLAG();
}

}

