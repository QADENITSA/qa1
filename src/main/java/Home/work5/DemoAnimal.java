package Home.work5;

public class DemoAnimal {
    public static void main(String[] args) {
        Cat cat = new Cat(false, "milk", 4, "black");
        Dog dog = new Dog(false, "meat", 4, "orange");

        System.out.println("Cat is Vegetarian?" + cat.isVegetarian());
        System.out.println("Cat eats " + cat.getEats());
        System.out.println("Cat has " + cat.getNoOfLegs() + " legs.");
        System.out.println("Cat color is " + cat.getColor());

        System.out.println();

        System.out.println("Dog is Vegetarian?" + dog.isVegetarian());
        System.out.println("Dog eats " + dog.getEats());
        System.out.println("Dog has " + dog.getNoOfLegs() + " legs.");
        System.out.println("Dog color is " + dog.getColor());
    }

}
