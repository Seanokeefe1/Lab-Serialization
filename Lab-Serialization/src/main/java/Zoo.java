import java.io.Serializable;
import java.util.ArrayList;

public class Zoo implements Serializable {

    private String name;
    private ArrayList<Animal> animals = new ArrayList<Animal>();
    private float price;

    public Zoo(String name, float price){
        this.name = name;
        this.price = price;

    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addAnimal(Animal ani){
        animals.add(ani);
    }

    public String toString(){
        return this.name + " - admission is $" + this.price + "\n\n" + "Animals at the zoo:\n\n" + animals;
    }

    public static void main(String[] args){
        Zoo z = new Zoo("John Ball Zoo", 15);
        Animal tiger = new Animal("Tiger", 15);
        Animal lion = new Animal("Lion", 12);
        Animal leopard = new Animal("Leopard", 45);

        z.addAnimal(tiger);
        z.addAnimal(lion);
        z.addAnimal(leopard);

        System.out.println(z);
    }


}
