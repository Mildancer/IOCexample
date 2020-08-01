package pl.sda;

public class Mp3Player extends Object implements Player {

    int price;

    public Mp3Player(int price) {
        this.price = price;
    }

    //extends Object- i wteyd mamy metode getClass().


    @Override
    public void play() {
            System.out.println("Mp3Player");
        System.out.println(getClass().getSimpleName());
    }
}
