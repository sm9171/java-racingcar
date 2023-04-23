package car.domain;

public class Car {
    private final String name;
    private int position;

    public Car(String name) {
        this.name = name;
        this.position = 0;
    }

    public int getPosition() {
        return this.position;
    }

    public String getName() {
        return this.name;
    }

    public void move(){
        position++;
    }

    public boolean isWinner(int maxPosition){
        return this.getPosition() == maxPosition;
    }
}