public class Circunferencia {
    double raio;
    private static final double PI = 3.1415;

    public Circunferencia(double raio) {
        this.raio = raio;
    }

    public double area(){
        return raio * raio * PI;
    }

    public double perimetro(){
        return 2 * PI * raio;
    }
}