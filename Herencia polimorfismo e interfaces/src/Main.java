public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.diHola();

        coche.sumaNumeros(3,4);
        coche.sumaNumeros((float)3, (float)4);
        coche.sumaNumeros(3.1,6.9);
    }
}
class Vehiculo{
    public void diHola(){
        System.out.println("Hola!");
    }
}

class Coche extends Vehiculo{
    public void diHola(){
        System.out.println("Soy un coche");
    }

    public int sumaNumeros(int a, int b){
        System.out.println("INT");
        return a + b;
    }

    public float sumaNumeros(float a, float b){
        System.out.println("FLOAT");
       return a + b * 1;
    }

    public void sumaNumeros(double a, double b){
        System.out.println("Resultado: " + (a + b));
    }
}