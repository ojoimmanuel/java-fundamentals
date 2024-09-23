package classActivities.oop;

public class Dog extends Animal {

    private String dogName;

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    @Override
    public void makeSound() {
//        super.makeSound();
        System.out.println("woof woof");
    }

    public void fetch(){

        System.out.println(dogName + " is fetching the ball");
    }
}
