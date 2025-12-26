public class Ex9 {
    public static void main(String[] args) {
        if(args.length < 2){
            System.out.println("Usage : java Ex9 <X> <n>");
            return;
        }

        int x = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int result = 1;

        for(int i = 0; i < n; i++){
            result *= x;
        }

        System.out.println(x + " ^ " + n + " = " + result);
    }
}




