public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        Moto moto = new Moto();

        EjecutaAcelerar(moto);
        EjecutaAcelerar(coche);
    }

    public static void EjecutaAcelerar(Vehiculo vehiculo){
        vehiculo.Acelerar(19);
    }
}
interface Vehiculo{
    void Acelerar (int cuantaVelocidad);
    void Frenar (int cuantaVelocidad);
}

class Coche implements Vehiculo{
    public void Acelerar (int cuantaVelocidad){
        System.out.println("Acelerar coche");
    }
    public void Frenar (int cuantaVelocidad){
        System.out.println("Frenar coche");
    }
}

class Moto implements Vehiculo{
    public void Acelerar (int cuantaVelocidad){
        System.out.println("Acelerar moto");
    }
    public void Frenar (int cuantaVelocidad){
        System.out.println("Acelerar moto");
    }
}