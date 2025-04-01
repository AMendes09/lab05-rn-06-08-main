
import java.util.List;
import java.util.ArrayList;

public class LiveRadioPlayer extends MediaPlayer {
    private List<Station> stationList;
    private int currentStationIndex;

    // Construtor sem argumentos
    public LiveRadioPlayer() {
        super();
        this.stationList = new ArrayList<>();
        this.currentStationIndex = 0;
    }

    // Getters e Setters
    public List<Station> getStationList() {
        return stationList;
    }

    public void setStationList(List<Station> stationList) {
        this.stationList = stationList;
        this.currentStationIndex = 0; // Reinicia a estação atual
    }

    public Station getCurrentStation() {
        if (stationList.isEmpty()) {
            return null;
        }
        return stationList.get(currentStationIndex);
    }

    public void addStation(Station station) {
        this.stationList.add(station);
    }

    // proxima estacao
    public void nextStation() {
        if (!stationList.isEmpty()) {
            currentStationIndex = (currentStationIndex + 1) % stationList.size();
        }
    }

    // estacao anterior
    public void previousStation() {
        if (!stationList.isEmpty()) {
            currentStationIndex = (currentStationIndex - 1 + stationList.size()) % stationList.size();
        }
    }


    @Override
    public String whatsPlaying() {
        if (stationList.isEmpty()) {
            return "Live Radio Player: No stations available";
        }
        Station currentStation = getCurrentStation();
        return "Live Radio Player: " + currentStation.getFrequency() + ": " + currentStation.getName();
    }
}
