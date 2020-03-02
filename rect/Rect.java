class Rectangle{
    double len,bred;
    double area(double l,double b){
        return(l*b);
    }
    double per(double l,double b){
        return(2*(l+b));
    }
    void print(){
        System.out.println("area= "+area(len,bred)+"\nperimeter= "+per(len,bred));
    }
    Rectangle(double l,double b)
    {
        len=l;
        bred=b;
    }
}
class Square extends Rectangle{
    Square(double s)
    {
        super(s,s);
    }
}
public class Rect{
    public static void main(String[] args) {
        Square ob= new Square(5);
        ob.print();
    }
}