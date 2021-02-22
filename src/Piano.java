public class Piano implements Instrument {
    @Override
    public void playNote(char note) {
        System.out.print("p: " + note);
    }
}
