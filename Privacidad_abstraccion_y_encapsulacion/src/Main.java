public class Main {
    public static void main(String[] args) {
        vehiculo miVe = new vehiculo() {
            @Override
            public String getSonido() {
                return null;
            }

            @Override
            public void setSonido(String sonido) {

            }
        };
        miVe.setTipo("Carro");
        miVe.setVelocidadMaxima(220);
        String tipo = miVe.getTipo();
        miVe.setRapido(true);
        System.out.println(tipo + " velocidad maxima: "+miVe.getVelocidadMaxima());
        System.out.println(miVe.isRapido());

        vehiculo moto = new vehiculo() {
            @Override
            public String getSonido() {
                return null;
            }

            @Override
            public void setSonido(String sonido) {

            }
        };
        moto.setTipo("Moto");
        moto.setVelocidadMaxima(150);
        moto.setRapido(false);
        System.out.println(moto.getTipo() + " velocidad maxima: "+ moto.getVelocidadMaxima());
        System.out.println(moto.isRapido());
    }
}

abstract class vehiculo{
    private String tipo;
    private int velocidadMaxima;
    private boolean rapido;
    private String sonido;
    public void setTipo(String valor){
            this.tipo = valor;
    }

    public String getTipo (){
        return this.tipo;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public boolean isRapido() {
        return rapido;
    }

    public void setRapido(boolean rapido) {
        this.rapido = rapido;
    }

    abstract public String getSonido();

    abstract public void setSonido(String sonido);
}