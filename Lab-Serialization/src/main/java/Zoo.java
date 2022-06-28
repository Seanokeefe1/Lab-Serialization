import java.io.*;
import java.util.ArrayList;

public class Zoo implements Serializable {

    private String name;
    private ArrayList<Animal> animals = new ArrayList<Animal>();
    private float price;

    public Zoo(String name, float price) {
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

    public void addAnimal(Animal ani) {
        animals.add(ani);
    }

    public String toString() {
        return this.name + " - admission is $" + this.price + "\n\n" + "Animals at the zoo:\n\n" + animals.toString();
    }

    public static void main(String[] args) {
        Zoo jb = new Zoo("John Ball", 10);
        Animal tiger = new Animal("Tiger", 42);
        Animal frog = new Animal("Frog", 31);
        jb.addAnimal(tiger);
        jb.addAnimal(frog);
        System.out.println(jb);
        jb.writeFile("animals.ser");
        Zoo njb = jb.readFile("animals.ser");
        System.out.println(njb);
    }

    public void writeFile(String filename) {
        try {
            FileOutputStream fOut = new FileOutputStream(filename);
            ObjectOutputStream objOut = new ObjectOutputStream(fOut);
            objOut.writeObject("this");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Zoo readFile(String filename) {
        try {
            FileOutputStream fOut = new FileOutputStream(filename);
            ObjectOutputStream objOut = new ObjectOutputStream(fOut);
            Zoo z = new Zoo(filename, 10);
            z = (Zoo) objOut.readObject();
            return z;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}

