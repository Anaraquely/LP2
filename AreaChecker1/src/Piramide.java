public class Piramide implements AreaChecker {
    private double altura;
    private double base;

    public Piramide(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double checkArea() {
        double areaDoQuadrado = new Quadrado(base).checkArea();
        double areaDoTriangulo = new Triangulo(base, altura).checkArea();
        return areaDoTriangulo * 4 + areaDoQuadrado;
    }
}
