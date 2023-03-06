public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        System.out.println("Puertas:" + miCoche.numeroPuertas);
        System.out.println("Velocidad maxima: " + miCoche.velocidadMaxima);
        System.out.println(miCoche.velocidadActual);
        miCoche.Acelerar();
        System.out.println(miCoche.velocidadActual);

        Coche miCoche2 = new Coche(5, 180);
        System.out.println("Puertas:" + miCoche2.numeroPuertas);
        System.out.println("Velocidad maxima: " + miCoche2.velocidadMaxima);
        System.out.println(miCoche2.velocidadActual);
    }

    public static class Coche{
        int numeroPuertas;
        int velocidadMaxima;
        float velocidadActual;

        public Coche(){
            System.out.println("Estoy en el constructor");
            numeroPuertas = 4;
            velocidadMaxima = 160;
        }
        public Coche(int puertas, int velocidad){
            System.out.println("Estoy en el constructor sobrecargado");
            numeroPuertas = puertas;
            velocidadMaxima = velocidad;
        }

        public void Acelerar(){
            velocidadActual += 15;
        }
        public void frenar(){

        }
    }
}