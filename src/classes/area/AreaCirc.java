package classes.area;

public class AreaCirc {
    int raio;
    static final double PI = 3.1415;

    AreaCirc() {
    
    }

    AreaCirc(int r) {
        raio = r;
    }

    double areaCircunf() {
        return PI * Math.pow(raio, 2);
    }

    static double areaCircunf(int r) {
        return PI * Math.pow(r, 2);
    }
}
