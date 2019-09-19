public class Rectangle extends Figura{
    double l1;
    double l2;

    public double area(){
        return this.l1*this.l2;
    }

    public Rectangle(double l1, double l2){
        this.l1=l1;
        this.l2=l2;
    }
}
