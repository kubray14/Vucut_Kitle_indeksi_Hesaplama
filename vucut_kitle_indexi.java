import java.util.Scanner;

public class vucut_kitle_indexi {
    
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        double height, weight, totalIndex;
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
        height = take.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz :");
        weight = take.nextDouble();
        totalIndex= weight / (height*height);
        System.out.println("Vücut kitle indexiniz : "+ totalIndex);
    }

    
}
