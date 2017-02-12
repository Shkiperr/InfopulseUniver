package lesson3.prakt1;

public class Plant {
    public static void main(String[] args) {
        Agregat agregat = new Agregat();
        Workers petr = new Workers("high");
        petr.createDetail(agregat);
        System.out.println(agregat);

    }
}
