public class Tableau {
    public static void main(String[] args) {
      
        int[] tab = {1,2,3,4,5,6,7,8,9,10};

       
        int somme = 0;
        for(int i = 0; i < tab.length; i++) {
            somme += tab[i];
        }
        System.out.println("Somme du tableau = " + somme);

        for(int i = 0; i < tab.length / 2; i++) {
            int temp = tab[i];
            tab[i] = tab[tab.length - 1 - i];
            tab[tab.length - 1 - i] = temp;
        }

        System.out.print("Tableau inversé : ");
        for(int val : tab) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}


