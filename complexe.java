
public  class complexe {

    private double re;
    private double im;

  
    complexe(double re, double im) {
        this.re = re;
        this.im = im;
    }

    
    String info() {
        return "<re:" + re + ",im:" + im + ">";
    }

    
    complexe produit(complexe z) {
        double r = re * z.re - im * z.im;
        double i = re * z.im + im * z.re;
        return new complexe(r, i);
    }


    static complexe produit(complexe z1, complexe z2) {
        double r = z1.re * z2.re - z1.im * z2.im;
        double i = z1.re * z2.im + z1.im * z2.re;
        return new complexe(r, i);
    }


    public static void main(String[] args) {

        complexe z1 = new complexe(1.0, 2.0);
        System.out.println("z1 = " + z1.info());

        complexe z2 = new complexe(2.0, 1.0);
        System.out.println("z2 = " + z2.info());

        complexe z3 = z1.produit(z2);
        System.out.println("z1 x z2 = " + z3.info());

        complexe z4 = complexe.produit(z2, z1);
        System.out.println("z2 x z1 = " + z4.info());
    }
}

