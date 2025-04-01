
public class MediaPlayer {
    private int volume;
    private boolean muted;

    // Construtor sem parametros
    public MediaPlayer() {
        this.volume = 5;
        this.muted = false;
    }

    // Getters e Setters
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 30) {
            this.volume = volume;
            this.muted = (volume == 0);
        }
    }

    public boolean isMuted() {
        return muted;
    }

    public void setMuted(boolean muted) {
        this.muted = muted;
        if (muted) {
            this.volume = 0;
        } else if (this.volume == 0) {
            this.volume = 5; // Valor padrão ao sair do mute
        }
    }

    // Metodos para aumentar e diminuir volume
    public void increaseVolume() {
        if (volume < 30) {
            volume++;
            muted = false;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
            if (volume == 0) {
                muted = true;
            }
        }
    }

    // Metodo whatsPlaying
    public String whatsPlaying() {
        return "Nothing to play.";
    }

    // Metodo toString
    @Override
    public String toString() {
        return "Volume: " + volume + "\n" + whatsPlaying();
    }
}
