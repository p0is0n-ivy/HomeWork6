package project6;

public class Cat extends Animals {
    public Cat(String name) {
        super(name, 200, 2);
    }

    @Override
    public void swim(int lenghtSwim) {
        if (lenghtSwim >= 0) {
            System.out.println(name + " can't swim.");
        } else {
            System.out.println("You entered a negative number.");
        }
    }
}