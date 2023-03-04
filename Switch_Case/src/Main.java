public class Main {
    public static void main(String[] args) {
        var estacion = "VERANO";
        switch (estacion){
            case "VERANO":
                System.out.println("Es verano");
                break;
            case "INVIERNO":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("Es otra estación");
        }
    }
}