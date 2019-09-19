import java.util.Arrays;

public class GestorFigures {
    public double suma(Figura[] vec){
        double res=0;
        for (Figura f:vec){
            res+= f.area();
        }
        return res;
    }

    public Figura[] sort(Figura[] vec){
        return Arrays.sort(vec.area());
    }
}
