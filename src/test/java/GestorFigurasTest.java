import edu.upc.eetac.dsa.figuras.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class GestorFigurasTest {
    Figura[] figuras = null;

    @Before
    public void setUp() {
        Quadrat quadrat=new Quadrat(4);
        Triangle triangle=new Triangle(5,3);
        Cercle cercle =new Cercle(6);
        Rectangle rectangle=new Rectangle(3,5);
        this.figuras=new Figura[]{quadrat,triangle,cercle,rectangle};

    }

    @Test
    public void testSuma() {
        System.out.println(GestorFigures.suma(figuras));
        Assert.assertEquals("suma",151.60,GestorFigures.suma(figuras),0.25 );
    }

    @Test
    public void testSort() {
        Assert.assertEquals("sort", Quadrat.class, this.figuras[0].getClass());
        Figura[] a= GestorFigures.sort(figuras);
        System.out.println(Arrays.asList(figuras));
        Assert.assertEquals("sort", Triangle.class, this.figuras[0].getClass());
        Assert.assertEquals("sort", 7.5, this.figuras[0].area(),0.25);


    }
}
