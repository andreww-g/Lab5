import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;

public abstract class Elipse extends Figure{

    public Elipse(Graphics2D buf, int del, int w, int h)
    {
        super(buf,del,w,h);
        shape=new Ellipse2D.Float(0,0,10,20);
        aft=new AffineTransform();
        area=new Area(shape);
    }
}