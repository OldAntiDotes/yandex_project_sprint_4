public class MusicalShow extends Show {
    protected Person musicAuthor;   // автор музыки
    protected String librettoText;  // текст либретто

    public MusicalShow(String title, int duration, Director director,
                       Person musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    // распечатать либретто
    public void printLibretto() {
        System.out.println("Либретто спектакля \"" + title + "\":");
        System.out.println(librettoText);
    }
}