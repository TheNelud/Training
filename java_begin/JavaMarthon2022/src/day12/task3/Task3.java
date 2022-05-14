package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand musicBand1 = new MusicBand("Scorpions" , 1983);
        MusicBand musicBand2 = new MusicBand("Metallica" , 1912);
        MusicBand musicBand3 = new MusicBand("AC-DC" , 203);
        MusicBand musicBand4 = new MusicBand("Deep Purple" , 1983);
        MusicBand musicBand5 = new MusicBand("Led Zeppelin" , 2983);
        MusicBand musicBand6 = new MusicBand("Modern Token" , 1983);
        MusicBand musicBand7 = new MusicBand("Alice Copper" , 13183);
        MusicBand musicBand8 = new MusicBand("Nigthwish" , 19833);
        MusicBand musicBand9 = new MusicBand("Dark Princess" , 19813);

        List<MusicBand> musicBandList = new ArrayList<>();

        musicBandList.add(musicBand1);
        musicBandList.add(musicBand2);
        musicBandList.add(musicBand3);
        musicBandList.add(musicBand4);
        musicBandList.add(musicBand5);
        musicBandList.add(musicBand6);
        musicBandList.add(musicBand7);
        musicBandList.add(musicBand8);
        musicBandList.add(musicBand9);

        System.out.println(musicBandList);

        Collections.shuffle(musicBandList);

        System.out.println(musicBandList);
    }

    public static List<MusicBand> groupAfter2000(List<MusicBand> bands){
        for (int i = 0; i < bands.size(); i++ ){
//            if (bands.getClass())
        }

        return null;
    }
}
