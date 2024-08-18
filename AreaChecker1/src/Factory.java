public class Factory {
    public static AreaChecker factory (Formatos formato, double...a){
        switch (formato){
            case CILINDRO -> {
                return new Cilindro(a[0], a[1], a[2]);
            }
            case CIRCULO -> {
                return new Circulo(a[0]);
            }
            case CUBO -> {
                return new Cubo(a[0],a[1]);
            }
            case ESFERA ->{
                return new Esfera(a[0]);
            }
            case HEXAGONO -> {
                return new Hexagono(a[0], a[1]);
            }
            case LOSANGO ->{
                return new Losango(a[0], a[1]);
            }
            case PARALELOGRAMA -> {
                return new Paralelograma(a[0], a[1]);
            }
            case PIRAMIDE -> {
                return new Piramide(a[0], a[1]);
            }
            case PRISMA -> {
                return new Prisma(a[0], a[1]);
            }
            case QUADRADO -> {
                return new Quadrado(a[0]);
            }
            case RETANGULO -> {
                return new Retangulo(a[0], a[1]);
            }
            case TRAPEZIO -> {
                return new Trapezio(a[0], a[1], a[2]);
            }
            case TRIANGULO -> {
                return new Triangulo(a[0], a[1]);
            }
        }
        return null;
    }
}
