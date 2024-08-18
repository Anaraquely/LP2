public class Cubo implements AreaChecker {
    private double base;
    private double lateral;

    public Cubo(double base, double lateral) {
        this.base = base;
        this.lateral = lateral;
    }

    @Override
    public double checkArea() {
        double areaBase = Math.pow(lateral,2);
        double areaLateral = 4*Math.pow(lateral,2);
        double areaTotal = 2*areaBase+areaLateral;
        return areaTotal;
    }
}
