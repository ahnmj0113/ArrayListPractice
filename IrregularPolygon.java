import java.awt.geom.*;  // for Point2D.Double
import java.util.ArrayList;      // for ArrayList
import gpdraw.*;        // for DrawingTool

public class IrregularPolygon{
    private ArrayList <Point2D.Double> myPolygon;
    private DrawingTool pen;
    private SketchPad paper;

    // constructors
    public IrregularPolygon(){
        myPolygon = new ArrayList<>();
        paper = new SketchPad(500, 500);
        pen = new DrawingTool(paper);
    }

    // public methods
    public void add(Point2D.Double aPoint){
       myPolygon.add(aPoint);
    }

    public void draw(){
        pen.up();
        for(Point2D.Double poly:myPolygon){
            pen.move(poly.getX(),poly.getY());
            pen.down();
        }
    }

    public double perimeter(){
        double distances=0;
        for(int i=0; i<myPolygon.size();i++){
            if(i==myPolygon.size()-1){
                distances += myPolygon.get(i).distance(myPolygon.get(0));
            }
            else{
                distances += myPolygon.get(i).distance(myPolygon.get(i+1));
            }
        }
        return distances;
    }


    public double area(){
        double area=0;
        for(int i=1; i<myPolygon.size();i++){
            area += (myPolygon.get(i-1).getX()*myPolygon.get(i).getY());
        }
        for(int i=myPolygon.size(); i<0;i--){
            area -= (myPolygon.get(i).getY()*myPolygon.get(i-1).getX());
        }
        return area/2;
    }

}
