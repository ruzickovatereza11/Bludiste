
public class Bojovnik {
	
	private String jmeno;
	private int zivot;
	private int maxZivot;
	private int utok;
	private int obrana;
	private Kostka kostka;
	private String zprava;
	
	public Bojovnik (String jmeno, int zivot, int utok, int obrana, Kostka kostka){
		this.jmeno = jmeno;
		this.zivot = zivot;
		this.maxZivot = zivot;
		this.utok = utok;
		this.obrana = obrana;
		this.kostka = kostka;
	}
	
	public  String toString(){
	return jmeno;
	}
	public boolean nazivu(){
		/*if(zivot > 0)
			return true;
		else
			return false;*/
		return (zivot > 0 );
	}
	public String grafickyZivot(){
        String s = "[";
        int celkem = 20;
        double pocet = Math.round(((double)zivot / maxZivot) * celkem);
        if ((pocet == 0) && (nazivu()))
                pocet = 1;
        for (int i = 0; i < pocet; i++)
                s += "#";
        for (int i = 0; i < celkem - pocet; i++)
            s += " ";
        s += "]";
        return s;
    }
	public void branSe(int uder){
		int zraneni = uder - (obrana + kostka.hod());
		if (zraneni > 0)
		{
				zivot -= zraneni;
				zprava= String.format("%s utrpìl poškození %s hp",jmeno, zraneni);
				
				if(zivot <= 0)
				{
					zivot = 0;
					zprava+= "a zemøel";
				}
		} else
			zprava = String.format("%s odrazil útok", jmeno);
			nastavZpravu(zprava);
	}
	public void utoc(Bojovnik souper){
		int uder = utok + kostka.hod();
		nastavZpravu(String.format("%s útoèí s úderem za %s hp", jmeno, uder));
		souper.branSe(uder);
		
	}
	private void nastavZpravu(String zprava){
		this.zprava = zprava;
	}
	public String vratPosledniZpravu(){
		return zprava;
	}
}
