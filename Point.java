public class Point {
    private double x, y;


    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }

   
    public void affiche(int n) {
        System.out.println("p" + n + " = (" + x + " , " + y + ")");
    }


    public static void main(String[] args) {
        Point p1 = new Point(1.0, 3.0);
        Point p2 = new Point(5.0, 6.0);

        double d = Point.distance(p1, p2);

        p1.affiche(1); 
        p2.affiche(2); 

        System.out.println("Distance entre p1 et p2 = " + d);
    }
}


