
public class Arenaaa {
	 private Bojovnik bojovnik1;
     private Bojovnik bojovnik2;
     private Kostka kostka;

     public Arenaaa(Bojovnik bojovnik1, Bojovnik bojovnik2, Kostka kostka) {
             this.bojovnik1 = bojovnik1;
             this.bojovnik2 = bojovnik2;
             this.kostka = kostka;
     }
     private void vykresli() {
         System.out.println("-------------- Aréna -------------- \n");
         System.out.println("Zdraví bojovníkù: \n");
         System.out.printf("%s %s\n", bojovnik1, bojovnik1.grafickyZivot());
         System.out.printf("%s %s\n", bojovnik2, bojovnik2.grafickyZivot());
 }
     private void vypisZpravu(String zprava) {
         System.out.println(zprava);
         try {
             Thread.sleep(500);
         } catch (InterruptedException ex) {
             System.err.println("Chyba, nepovedlo se uspat vlákno");
         }
 }
     public void zapas() {
    	 Bojovnik b1 = bojovnik1;
         Bojovnik b2 = bojovnik2;
         System.out.println("Vítejte v arénì!");
         System.out.printf("Dnes se utkají %s s %s! \n\n", bojovnik1, bojovnik2);
         System.out.println("Zápas mùže zaèít...");
         
         boolean zacinaBojovnik2 = (kostka.hod() <= kostka.vratPocetSten() / 2);
         if (zacinaBojovnik2) {
                 b1 = bojovnik2;
                 b2 = bojovnik1;
         }
         System.out.printf("Zaèínat bude bojovník %s! \n\nZápas mùže zaèít...", b1);


         // cyklus s bojem
         while (b1.nazivu() && b2.nazivu()) {
             b1.utoc(b2);
             vykresli();
             vypisZpravu(b1.vratPosledniZpravu()); // zpráva o útoku
             vypisZpravu(b2.vratPosledniZpravu()); // zpráva o obranì
             if (b2.nazivu()) {
                     b2.utoc(b1);
                     vykresli();
                     vypisZpravu(b2.vratPosledniZpravu()); // zpráva o útoku
                     vypisZpravu(b1.vratPosledniZpravu()); // zpráva o obranì
             }
             System.out.println();
     }
   }
}
   
