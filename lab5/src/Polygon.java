import java.awt.*;
import java.awt.geom.*;

public class Polygon extends Figure{

    int xValue1[] = {0, 15, 8, -8, -10};
    int yValue1[] = {-10, -2, 15, 15, -2};
    public Polygon(Graphics2D buf, int del, int w, int h)
    {
        super(buf,del,w,h);
        shape = new java.awt.Polygon(xValue1,yValue1,5);
        aft=new AffineTransform();
        area=new Area(shape);
    }

}