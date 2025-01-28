package Chapter7.Inheritance;

public class MyRectangle extends Shape{
    public MyRectangle(){
        super(); //default constructor of the parent class
    }
    public MyRectangle(double l, double w) {
        //this.length = l;
        //this.width = w;
        super(l,w);
    }
}
