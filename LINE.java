package line;
import java.awt.Frame;
import java.awt.Graphics;
public class LINE extends Frame 
{
LINE()
{
    setSize(500,500);
    setVisible(true);
}
@Override
public void paint(Graphics g)
{
    super.paint(g);
    g.drawString("Swing Graphics class",10,80);
    g.drawLine(50,90,100,90);
    g.drawLine(110,90,160,90);
    g.drawLine(170,90,220,90);
    g.drawLine(230,90,280,90);
    g.drawLine(290,90,340,90);

    g.drawLine(50,140,100,140);
    g.drawLine(110,140,160,140);
    g.drawLine(170,140,220,140);
    g.drawLine(230,140,280,140);
    g.drawLine(290,140,340,140);

    g.drawLine(50,190,100,190);
    g.drawLine(110,190,160,190);
    g.drawLine(170,190,220,190);
    g.drawLine(230,190,280,190);
    g.drawLine(290,190,340,190);
}
public static void main(String[] args) {
    new LINE();
}

}
