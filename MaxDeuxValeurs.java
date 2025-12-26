import java.util.Scanner;

public class MaxDeuxValeurs {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.print("Entrez le premier entier : ");
        int a = clavier.nextInt();

        System.out.print("Entrez le deuxième entier : ");
        int b = clavier.nextInt();

        int max = Math.max(a, b);

        System.out.println("Le maximum est : " + max);

        clavier.close();
    }
}


