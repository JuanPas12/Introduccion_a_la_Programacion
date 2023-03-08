public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdad(22);
        cliente.setTelefono("3511900856");
        cliente.setNombre("Jose");
        cliente.setCredito(490.50);
        System.out.println("CLIENTE");
        System.out.println("Nombre: " + cliente.getNombre() + ", Edad: " + cliente.getEdad() +
                ", Teléfono: " + cliente.getTelefono() + ", Credito: " + cliente.getCredito());

        Trabajador t = new Trabajador();
        t.setEdad(48);
        t.setTelefono("8976540923");
        t.setNombre("Jaime");
        t.setSalario(1678);
        System.out.println("TRABAJADOR");
        System.out.println("Nombre: " + t.getNombre() + ", Edad: " + t.getEdad() +
                ", Teléfono: " + t.getTelefono() + ", Salario" + t.getSalario());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona{
    private double credito;

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona{
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}