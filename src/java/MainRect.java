public class MainRect {

    public static void main(String args[]){

        Rectangle rec=new Rectangle();
        rec.displaydimension();
        rec.area();
        rec.perimeter();

        Rectangle rec1=new Rectangle(6.0);
        rec1.displaydimension();
        rec1.area();
        rec1.perimeter();

        Rectangle rec2=new Rectangle(3.0,4.0);
        rec2.displaydimension();
        rec2.area();
        rec2.perimeter();
    }
}