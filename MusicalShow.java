class MusicalShow extends Show {
    private String musicAuthor;  // автор музыки
    private String librettoText; // текст либретто

    public MusicalShow(String title,
                       int duration,
                       Director director,
                       String musicAuthor,
                       String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibretto() {
        System.out.println("Либретто спектакля \"" + getTitle() + "\":");
        System.out.println(librettoText);
    }

    public String getMusicAuthor() {
        return musicAuthor;
    }
}