package chapter01.src.com.new7_17.HomeWork1;

public class Perfomer {
    private Instrument instrument;

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public void perform() {
        if (instrument != null) {
            instrument.play();
        } else {
            System.out.println("没有乐器在演奏！");
        }
    }
}
