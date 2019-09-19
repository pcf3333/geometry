import java.util.Arrays;

public class GestorFigures {
    static public double suma(Figura[] vec){
        double res=0;
        for (Figura f:vec){
            res+= f.area();
        }
        return res;
    }

    static public Figura[] sort(Figura[] vec){

        Arrays.sort(vec);
        return vec;
    }
    public static void main(String[] args) {
        Quadrat quadrat=new Quadrat(4);
        Triangle triangle=new Triangle(5,3);
        Cercle cercle =new Cercle(6);
        Rectangle rectangle=new Rectangle(3,5);
        Figura[] figuras=new Figura[]{quadrat,triangle,cercle,rectangle};
        System.out.print(GestorFigures.suma(figuras));
        Figura[] a= GestorFigures.sort(figuras);


    }
}

