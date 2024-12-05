import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n değerini giriniz: ");
        int n = sc.nextInt();
        System.out.print("r değerini giriniz: ");
        int r = sc.nextInt();
        if (r > n)
            System.out.println("r değeri n'den büyük olamaz!");
        else{
            int combination = factoriel(n) / (factoriel(r) * factoriel(n - r));
            System.out.println("C(" + n + ", " + r + ") = " + combination);
        }
    }
    public static int factoriel(int sayi){
        int sonuc = 1;
        for(int i = 1; i <= sayi; i++){
            sonuc *= i;
        }
        return sonuc;
    }
}