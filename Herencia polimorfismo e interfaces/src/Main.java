public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.setSonido("BRRR");
        System.out.println(coche.getSonido());

        Moto moto = new Moto();
        moto.setSonido("BRRR");
        System.out.println(moto.getSonido());
    }
}

abstract class Vehiculo{
    int velocidadMaxima;
    String matricula;
    String sonido;

    public Vehiculo(){
        System.out.println("Este es el constructor ");
    }

    abstract public String getSonido();
    abstract public void setSonido(String sonido);
}

//Una final class es una clase de la cual no vamos a poder heredar.
class Coche extends Vehiculo{
    public String getSonido(){
        return "Soy un SUPERSONIDO " + this.sonido;
    }
    public void setSonido(String sonido){
        this.sonido = sonido;
    }
}

class Moto extends Vehiculo{
    public String getSonido(){
        return "Soy un sonidillo de moto " +  this.sonido;
    }
    public void setSonido(String sonido){
        this.sonido = sonido;
    }
}
