public class Triangle extends Figura {
    double h;
    double b;

    public double area(){
        return (this.b*this.h)/2;
    }

    public Triangle(double b, double h){
        this.b=b;
        this.h=h;
    }
}
