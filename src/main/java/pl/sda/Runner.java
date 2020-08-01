package pl.sda;

public class Runner {
    public static void main(String[] args) {


        Seller seller = new Seller();
        seller.sell(new Mp3Player());

        //IOC

        Mp3Seller mp3Seller = new Mp3Seller();
        Mp3Player mp3Player = new Mp3Player(3);

Seller seller = new Seller();
seller.sell(mp3Player);

var container = new IoC();

seller.sell(container.hashMap.get("mp3"));

        mp3Seller.sell(mp3Player);

        mp3Seller.sell(mp3Player);

        Mp4Seller mp4Seller = new Mp4Seller();
        Mp4Player mp4Player = new Mp4Player(4);

        mp4Seller.sell(mp4Player);


        Mp5Seller mp5Seller = new Mp5Seller();
        Mp5Player mp5Player = new Mp5Player(5);

        mp5Seller.sell(mp5Player);


    }
}
