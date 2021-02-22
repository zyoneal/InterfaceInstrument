public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Instrument p = Instrument.byName("Piano");
        Instrument d = Instrument.byName("Drum");
        playTwo(p, d);
    }

    private void playTwo(Instrument firstInstrument, Instrument secondInstrument) {
        firstInstrument.play("qwerty");
        secondInstrument.play("asdfg");
    }

}
