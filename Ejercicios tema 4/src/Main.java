public class Main {
    public static void main(String[] args) {
        // Primera parte
        System.out.println("PRIMERA PARTE");
        int numeroIf = 0;
        if (numeroIf > 0){
            System.out.println("el numero es positivo");
        }else if (numeroIf < 0 ){
            System.out.println("el numero es negativo");
        }else {
            System.out.println("el numero es cero");
        }

        //Segunda parte
        System.out.println("SEGUNDA PARTE");
        int numeroWhile = 0;
        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        //Tercera parte
        System.out.println("TERCERA PARTE");
        int numeroDoWhile = 4;
        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        }while (numeroDoWhile < 3);

        //Cuarta parte
        System.out.println("CUARTA PARTE");
        for (int numeroFor = 0; numeroFor <= 3 ; numeroFor++) {
            System.out.println(numeroFor);
        }

        //Quinta parte
        System.out.println("QUINTA PARTE");
        String estacion = "invierno";

        switch (estacion){
            case "primavera":
                System.out.println("Es primavera");
                break;
            case "verano":
                System.out.println("Es verano");
                break;
            case "otono":
                System.out.println("Es otoño");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println(estacion + "no es una estación");
        }
    }
}