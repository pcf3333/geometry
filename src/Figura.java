public abstract class Figura implements Comparable<Figura>{
    piblic int compareto(Figura f){
        return (this.area()-f.area());
    }
}

