public class Main {
    public static void main(String[] args) {
        //int param1 = 10;
        //int param2 = 35;
        //op(param1, param2);
        Papa miPapa = new Papa();

        miPapa.QuitarBrazos();
        System.out.println(miPapa.brazos);
    }

    public static void op(int a, int b){
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
    }
}
class Papa{
    public int brazos = 0;

    public void QuitarBrazos(){
        this.brazos--;
    }
}