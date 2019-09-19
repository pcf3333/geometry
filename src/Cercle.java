import java.lang.Math.*;

public class Cercle extends Figura {
    double r;

    public double area(){
        return (Math.pow(this.r,2)*Math.PI);
    }

    public Cercle(double r){
        this.r=r;
    }
}
