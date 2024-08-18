public class Trapezio implements AreaChecker {
    private double baseMaior;
    private double baseMenor;
    private double altura;

    public Trapezio(double baseMaior, double baseMenor, double altura) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    @Override
    public double checkArea() {
        return (baseMaior+baseMenor)*altura/2;
    }
}
