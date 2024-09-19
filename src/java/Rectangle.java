public class Rectangle{

    double length;
    double width;

    public void area()
    {
        double ar=length*width;
        System.out.println("area of rectngle is:"+ar);
    }
    public void perimeter()
    {
        double p=2*(length+width);
        System.out.println("perimeter of rectangle:"+p);
    }
    public void displaydimension()
    {
        System.out.println("length of rectangle is:"+length);
        System.out.println("width of rectangle is:"+width);

    }
    Rectangle()
    {
        length=1;
        width=1;
    }
    Rectangle(double square)
    {
        this.length=square;
        this.width=square;
    }
    Rectangle(double length,double width)
    {
        this.length=length;
        this.width=length;
    }

}