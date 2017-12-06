import java.util.Random;
public class Kostka {
	
	private Random random;
	private int pocetSten;
	 
	public Kostka(int PocetSten){
		this.pocetSten = PocetSten;
		random = new Random ();
		
	}
	public Kostka(){
		pocetSten = 6;
		random = new Random();
		
	}
	public int vratPocetSten (){
		return pocetSten;
	}
	public int hod(){
		return random.nextInt(pocetSten) + 1;
	}
	public String toString(){
		return String.format("Kostka s %s stìnami", pocetSten);
	}
	
}
