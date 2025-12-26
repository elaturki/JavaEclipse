public class Ex6 {
    public static void main(String[] args) {
        if(args.length < 6){
            System.out.println("Usage : java Ex6 <6 entiers>");
            return;
        }

        int max = Integer.parseInt(args[0]);
        for(int i = 1; i < 6; i++){
            int num = Integer.parseInt(args[i]);
            if(num > max) max = num;
        }

        System.out.println("Le maximum est = " + max);
    }
}

