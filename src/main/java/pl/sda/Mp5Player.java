package pl.sda;

public class Mp5Player implements Player {

    int price;

    public Mp5Player(int price) {
        this.price = price;
    }



    @Override
    public void play() {
        System.out.println("Mp5Player");

    }

}
