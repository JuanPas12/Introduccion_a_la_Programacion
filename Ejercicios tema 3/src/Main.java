public class Main {
    public static void main(String[] args) {
        int res = suma(10, 98, 65);
        System.out.println(res);

        Coche miCoche = new Coche();
        miCoche.IncrementarPuertas();
        System.out.println(miCoche.puertas);
    }

    public static int suma (int a, int b, int c){
        return a + b + c;
    }
     public static class Coche{
        public int puertas = 4;
        public void IncrementarPuertas(){
            this.puertas++;
        }
    }
}