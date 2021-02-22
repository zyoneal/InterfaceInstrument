public interface Instrument {
    void playNote(char note);

    default void play(String melody) {
        for (int i = 0; i < melody.length(); i++) {
            System.out.println(melody.charAt(i));
        }
    }

    static Instrument byName(String name) {
        if ("Piano".equals(name)) return new Piano();
        return new Drum();
    }
}