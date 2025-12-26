public class Somme1a10 {
    public static void main(String[] args) {
      
        int x = 1;
        int y = 5;
        int z;
        z = x++ + y;
        System.out.println("z = " + z + ", x = " + x);

        
        int compteur = 12;
        if (compteur > 10) {
            System.out.println("compteur est plus grand que 10");
        }

        
        int total = 20;
        total -= --x;
        System.out.println("total = " + total);

        
        int q = 17;
        int diviseur = 5;
        q = q % diviseur;   
        System.out.println("q = " + q);
        q = 17;             
        q %= diviseur;   
        System.out.println("q = " + q);

     
        int somme = 0;
        x = 1;
        while(x < 11) {
            somme += x;
            x++;
        }
        System.out.println("La somme vaut : " + somme);
    }
}

