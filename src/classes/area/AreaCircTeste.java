package classes.area;

public class AreaCircTeste {
    public static void main(String[] args) {
        AreaCirc a1 = new AreaCirc(5);
    
        System.out.println("Area: " + AreaCirc.PI * (a1.raio * a1.raio));
        System.out.println("Area do circ: " + AreaCirc.areaCircunf(a1.raio));
        System.out.println("Area do circulo: " + a1.areaCircunf());
    }
}
