package edu.upc.eetac.dsa.figuras;

public abstract class Figura implements Comparable<Figura>{
    public abstract double area();

    public int compareTo(Figura f){
        Double d=(this.area()-f.area());
        return d.intValue();
    }

    public String toString() {
        return this.getClass().getSimpleName()+" "+ this.area();
    }
}

