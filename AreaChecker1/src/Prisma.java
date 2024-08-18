public class Prisma implements AreaChecker{
    private double base;
    private double altura;

    public Prisma(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double checkArea() {
        double areaDoQuadrado = new Quadrado(base).checkArea();
        double areaDoRetangulo = new Retangulo(base,altura).checkArea();
        return areaDoQuadrado*2+areaDoRetangulo*4;
    }
}
