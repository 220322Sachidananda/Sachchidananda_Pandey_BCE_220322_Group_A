package TrafficLight;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
public class TRAFFICLIGHT extends Frame 
{
TRAFFICLIGHT()
{
    setSize(500,500);
    setVisible(true);
    
}
@Override
public void paint(Graphics g)
{
    
    g.drawString("TRAFFIC LIGHT",10,50);
    super.paint(g);

        g.fillRect(100, 50, 100, 300);

        g.fillRect(140,350,20,100);
        

        g.setColor(Color.RED);
        g.fillOval(120, 70, 60, 60);

        g.setColor(Color.YELLOW);
        g.fillOval(120, 150, 60, 60);

        g.setColor(Color.GREEN);
        g.fillOval(120, 230, 60, 60);
    }

    public static void main(String[] args) {
        new TRAFFICLIGHT();
    

}
}