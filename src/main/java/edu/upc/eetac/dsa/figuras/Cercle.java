package edu.upc.eetac.dsa.figuras;

public class Cercle extends Figura {
    private double r;

    public double area(){
        return (Math.pow(this.r,2)*Math.PI);
    }

    public Cercle(double r){
        this.r=r;
    }
}
