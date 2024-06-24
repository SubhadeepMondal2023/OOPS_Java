// Write a java program to demonstrate Is-a relationship. -> "instanceof" keyword.

package q15;
class Animal{
    String name, color;
    Animal(String name, String color){
        this.name = name;
        this.color = color;
    }
}

class Mammal extends Animal{
    Mammal(String name, String color){
        super(name, color);
    }
    public void display(Mammal m) {
        System.out.println(m instanceof Animal);
    }
}

class Species extends Mammal{
    Species(String name, String color){
        super(name, color);
    }
    public void display(Species s) {
        System.out.println(s instanceof Animal);
        System.out.println(s instanceof Mammal);
    }
}
public class Main {
    public static void main(String[] args) {
        Mammal m = new Mammal("Parrot", "Green");
        Species s = new Species("Cow", "White");

        m.display(m);
        s.display(s);
    }
}
