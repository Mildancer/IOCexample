package pl.sda;

import java.util.HashMap;
import java.util.Map;

public class IoC {
//nazwa klasy kluczem, a instacja wartoscia -HashMapa
 //   -kontener springa


HashMap<String, Player> hashMap = Map.of(
        "mp3", new Mp3Player(3),
        "mp4", new Mp4Player(4),
        "mp5", new Mp5Player(5)
);


//init

}
