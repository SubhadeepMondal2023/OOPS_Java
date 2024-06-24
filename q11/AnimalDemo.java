//Create a package Animal that has two classes Pet and Wild
// and can access it from another class outside the package.
package q11;
import q11.Animal.Pet;
import q11.Animal.Wild;

public class AnimalDemo {
    public static void main(String[] args) {
        Pet p = new Pet();
        System.out.println(p.pname);

        // NOTE: The below lines will throw errors.That is the output.
        System.out.println(p.pcolor);
        System.out.println(p.pbreed);
        System.out.println(p.psound);
    }
}
