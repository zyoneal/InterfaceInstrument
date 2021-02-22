public class Drum implements Instrument {
    @Override
    public void playNote(char note) {
        System.out.print("d: " + note);
    }
}
