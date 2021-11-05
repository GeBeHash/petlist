import java.util.ArrayList;

public class Pisica extends Animal {
    ArrayList<String> properties = new ArrayList<String>();

    public Pisica(String name, String age) {
        this.name = name;
        this.age = age;
    }
    
    public void addprop(String prop) {
        properties.add(prop);
    }

    public void display_pisica() {
        System.out.print("Pisica: { " + name + ", " + age);
        for (int i = 0; i < properties.size(); i++ )
            System.out.print(", " + properties.get(i));
        
        System.out.print(" }");
    }
}