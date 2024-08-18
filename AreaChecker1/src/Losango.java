public class Losango implements AreaChecker {
    private double diagonalMaior;
    private double diagonalMenor;

    public Losango(double diagonalMaior, double diagonalMenor) {
        this.diagonalMaior = diagonalMaior;
        this.diagonalMenor = diagonalMenor;
    }

    @Override
    public double checkArea() {
        return diagonalMaior*diagonalMenor/2;
    }
}
