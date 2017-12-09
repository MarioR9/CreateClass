
public class MainDriver {
    private String name;
    private int age;

    public MainDriver() {
        this.name = "Tony";
        this.age = 0;
    }

    public MainDriver(String name, int age){
        this.name = name;
        this.age = age;
    }


    public void setName(String name){
        this.name = name;
    }


    public void setAge(int age){
        this.age= age;
    }


    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }


    public String toString(){
        return "Person's name is " + this.name + "\n" + "Person's age is " + this.age;
    }
}
