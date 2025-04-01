import java.util.ArrayList;
import java.util.List;

public class AppStart {
    public static void main(String[] args) {
        // Criar lista de podcasts
        List<Podcast> podcasts = new ArrayList<>();
        podcasts.add(new Podcast("O Homem que Mordeu o Cão"));
        podcasts.add(new Podcast("O CEO é o limite"));
        podcasts.add(new Podcast("Portugalex"));

        // Criar stream player
        MediaPlayer streamPlayer = new StreamPlayer();
        ((StreamPlayer) streamPlayer).setPodcast(podcasts.get(1)); // Selecionar "O CEO é o limite"

        // Criar lista de estações de rádio
        List<Station> stations = new ArrayList<>();
        stations.add(new Station(88.3, "KFM"));
        stations.add(new Station(93.2, "RFM"));
        stations.add(new Station(95.7, "Antena 1"));
        stations.add(new Station(97.4, "Rádio Comercial"));
        stations.add(new Station(101.9, "Orbital"));

        // Princípio da substituição: criar LiveRadioPlayer
        MediaPlayer liveRadioPlayer = new LiveRadioPlayer();
        ((LiveRadioPlayer) liveRadioPlayer).setStationList(stations);

        // Aumentar volume três vezes
        liveRadioPlayer.increaseVolume();
        liveRadioPlayer.increaseVolume();
        liveRadioPlayer.increaseVolume();

        // Avançar dois canais e imprimir o que está tocando
        ((LiveRadioPlayer) liveRadioPlayer).nextStation();
        ((LiveRadioPlayer) liveRadioPlayer).nextStation();

        // Criar lista de MediaPlayers e adicionar objetos
        List<MediaPlayer> mediaPlayers = new ArrayList<>();
        mediaPlayers.add(new MediaPlayer()); // Objeto do nível 1
        mediaPlayers.add(streamPlayer); // Objeto do nível 2
        mediaPlayers.add(liveRadioPlayer); // Objeto do nível 3

        // Imprimir whatsPlaying() de todos os objetos na coleção
        mediaPlayers.forEach(player -> System.out.println(player.whatsPlaying()));
    }
}
