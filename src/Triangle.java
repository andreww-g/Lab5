import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;

public abstract class Triangle extends Figure{

    public Triangle(Graphics2D buf, int del, int w, int h)
    {
        super(buf,del,w,h);
        paintComponent(buf);
        aft=new AffineTransform();
        area=new Area(shape);
    }
    public void paintComponent(Graphics g) {
        int [] x = {30,70,0};
        int [] y = {0,70,70};
        g.drawPolygon(x, y, 3);
    }

}