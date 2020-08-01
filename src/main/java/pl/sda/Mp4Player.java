package pl.sda;

public class Mp4Player implements Player {

    int price;

    public Mp4Player(int price) {
        this.price = price;
    }

    @Override
    public void play() {
        System.out.println("Mp4Player");
    }


}
