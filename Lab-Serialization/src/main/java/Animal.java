import java.io.Serializable;

public class Animal implements Serializable {

    private String name;
    private int habNum;

    public Animal(String name){
        this.name = name;
    }



    public String toString(){
        return name + " is in habitat " + habNum;
    }


}
