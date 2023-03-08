public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.velocidadMaxima = 170;
        coche.matricula = "UYKL98";

        CocheElectrico cocheElectrico = new CocheElectrico();
        cocheElectrico.velocidadMaxima = 200;
        cocheElectrico.matricula = "UOLG67";
    }
}

class Vehiculo{
    int velocidadMaxima;
    String matricula;

    public boolean compruebMatricula (String matricula){
        if (matricula == "XXXX"){
            return true;
        }else {
            return false;
        }
    }
}

//Una final class es una clase de la cual no vamos a poder heredar.
class Coche extends Vehiculo{

}

class CocheElectrico extends Coche{

}