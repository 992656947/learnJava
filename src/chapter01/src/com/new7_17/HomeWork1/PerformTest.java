package chapter01.src.com.new7_17.HomeWork1;

public class PerformTest {
    public static void main(String[] args) {
        Perfomer musician = new Perfomer();

        Piano piano = new Piano();
        piano.setName("Piano");

        Violin violin = new Violin();
        violin.setName("Violin");

        Saxophone saxophone = new Saxophone();
        saxophone.setName("Saxophone");


        musician.setInstrument(piano);
        musician.perform();


        musician.setInstrument(violin);
        musician.perform();


        musician.setInstrument(saxophone);
        musician.perform();

    }
}
