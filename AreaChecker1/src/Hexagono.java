public class Hexagono implements AreaChecker {

    private double altura;
    private double lado;

    public Hexagono(double altura, double lado) {
        this.altura = altura;
        this.lado = lado;
    }

    @Override
    public double checkArea() {
        return new Triangulo(lado, altura).checkArea() * 6;
    }
}
