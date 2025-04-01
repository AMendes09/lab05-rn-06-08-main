
public class StreamPlayer extends MediaPlayer {
    private Podcast podcast;

    // Construtor sem argumentos
    public StreamPlayer() {
        super();
        this.podcast = new Podcast("O Homem que Mordeu o Cão");
    }

    // Getters e Setters
    public Podcast getPodcast() {
        return podcast;
    }

    public void setPodcast(Podcast podcast) {
        this.podcast = podcast;
    }

    @Override
    public String whatsPlaying() {
        return "Stream Player: " + podcast.getTitle();
    }
}
