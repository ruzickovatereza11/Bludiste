
public class TahovyBoj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*Kostka sestistenna = new Kostka();
	Kostka desetistenna = new Kostka(10);
	System.out.println(sestistenna.vratPocetSten());
	System.out.println(desetistenna.vratPocetSten());
	System.out.println(desetistenna.hod());
	System.out.println(sestistenna);
	
	System.out.println (sestistenna);
	for(int i = 0; i < 10;i++)
		System.out.print(sestistenna.hod() + " ");
	
	System.out.println (desetistenna);
	for(int i = 0; i < 10;i++)
		System.out.print(desetistenna.hod() + " ");
	
	int a = 56;
	int b = 28;
	Uzivatel u = new Uzivatel ("Jan Novák",28);
	Uzivatel v = new Uzivatel ("Josef Nový",32);
	System.out.printf("a: %s\nb: %s\nu:%s\nv: %s\n",a,b,u,v);
	a=b;
	u=v;
	System.out.printf("a: %s\nb: %s\nu:%s\nv: %s\n",a,b,u,v);
	v.jmeno = "John Doe";
	v = null;
	System.out.printf("u: %s\nv: %s\n",u,v);*/
	
	Kostka kostka = new Kostka(10);
	Bojovnik zalgoren = new Bojovnik ("Zalgoren", 100,20,10,kostka);
	Bojovnik shadow = new Bojovnik ("Shadow", 60,18,15,kostka);
	Arenaaa arena = new Arenaaa(zalgoren,shadow, kostka);
	arena.zapas();
	
	/*System.out.printf("Bojovnik: %s\n",bojovnik);
	System.out.printf("Naživu: %s\n",bojovnik.nazivu());
	System.out.printf("Život: %s\n",bojovnik.grafickyZivot());
	
	
	Bojovnik souper = new Bojovnik ("Shadow",60,18,15,kostka);
	souper.utoc(bojovnik);
	System.out.println(souper.vratPosledniZpravu());
	System.out.println(bojovnik.vratPosledniZpravu());
	
	System.out.printf("Život: %s\n", bojovnik.grafickyZivot());*/
	
	/*bojovnik.utoc(bojovnik);
	System.out.printf("Život po útoku: %s\n",bojovnik.grafickyZivot());*/
	

	}
}
