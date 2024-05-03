public class Mymethod {
    public void print2() {
        String a = "hevin";
        System.out.println((a));
}

    public static void main(String[] args) {
        Tomethod obj = new Tomethod();
        obj.print2();
        System.out.println(obj.a);
     }
}
class Tomethod extends Mymethod {


    int a = 10;
    int b = 20;
    int c = a + b;

    public void print() {
        System.out.println(c);
    }
}