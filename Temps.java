
public class Temps {


	    
	    private int heure;
	    private int minute;
	    private int seconde;

	    
	    Temps(int heure) {
	        this.heure = heure;
	        this.minute = 0;
	        this.seconde = 0;
	    }

	  
	    Temps(int heure, int minute) {
	        this(heure);
	        this.minute = minute;
	    }

	    
	    Temps(int heure, int minute, int seconde) {
	        this(heure, minute);
	        this.seconde = seconde;
	    }

	 
	    void affiche() {
	        System.out.println("Il est " + heure + " heures " +
	                           minute + " minutes " +
	                           seconde + " secondes");
	    }

	   
	    public static void main(String[] args) {
	        Temps t = new Temps(10);
	        t.affiche();

	        t = new Temps(10, 12);
	        t.affiche();

	        t = new Temps(10, 12, 45);
	        t.affiche();
	    }
	}


