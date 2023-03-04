public class Main {
    public static void main(String[] args) {
        int contador = 10;
        int contador2 = 10;

        while (contador > 0){
            System.out.println("contador while vale: " + contador);
            contador--;
        }

        //El codigo seguiria por aqui.

        do {
            System.out.println("contador do while vale: " + contador2);
            contador2--;
        }while (contador2 > 0);

        //El codigo seguiria por aqui.
    }
}