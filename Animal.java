public class Animal {
    public String type;
    public String name;
    public String age;
    public String prop;

    Animal(String type, String name, String age, String prop) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.prop = prop;
    }

    public void display() {
        System.out.println(type + ", " + name + ", " + age + ", " + prop);
    }

}
