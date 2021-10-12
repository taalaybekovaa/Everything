package OOP.Inheritance1;

public class Store {
    public static void main(String[] args) {
        Flower flower= new Flower("Lily", "viloet", 11);
        Rose rose = new Rose();
        System.out.println(flower.color);
        System.out.println(rose.color);

        Rose rose1 = new Rose("Pink");
        System.out.println(rose1);

    }
}
