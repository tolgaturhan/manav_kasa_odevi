import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut = 2.14,elma = 3.67,domates = 1.11,muz = 0.95,patlican = 5.00,total;
        double armutMiktar,elmaMiktar,domatesMiktar,muzMiktar,patlicanMiktar;
        Scanner manav = new Scanner(System.in);

        System.out.print("Lütfen Armut Miktarını (kg) Giriniz: ");
        armutMiktar = manav.nextDouble();
        armut *= armutMiktar;

        System.out.print("Lütfen Elma Miktarını (kg) Giriniz: ");
        elmaMiktar = manav.nextDouble();
        elma *= elmaMiktar;

        System.out.print("Lütfen Domates Miktarını (kg) Giriniz: ");
        domatesMiktar = manav.nextDouble();
        domates *= domatesMiktar;

        System.out.print("Lütfen Muz Miktarını (kg) Giriniz: ");
        muzMiktar = manav.nextDouble();
        muz *= muzMiktar;

        System.out.print("Lütfen Patlican Miktarını (kg) Giriniz: ");
        patlicanMiktar = manav.nextDouble();
        patlican *= patlicanMiktar;

        total = armut + elma + domates + muz + patlican;

        float totalf = (float) total;

        System.out.println("Toplam Tutar: " + totalf);

    }
}
