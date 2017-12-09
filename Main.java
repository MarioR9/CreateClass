import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter person 1's name");
        String name = keyboard.next();
        String outputAge;
        String outputName;
        System.out.println("Enter First person age");
        int age = Integer.parseInt(keyboard.next());
        MainDriver person1 = new  MainDriver(name,age);
        System.out.println(person1);
        System.out.println("Enter second person name");
        name = keyboard.next();
        System.out.println("Enter second person age");
        age = Integer.parseInt(keyboard.next());
        MainDriver person2 = new  MainDriver(name,age);
        System.out.println(person2);
        if (person1.toString().equals(person2.toString())==true){
            System.out.println("first person equals to second person");
        } else {
            System.out.println("first person does not equal to second person");
        }
        if (person1.getName().equals(person2.getName())){
            System.out.println("first person does have the same name as second person");
        } else {
            System.out.println("first person does not have the same name as second person");
        }
        if (person1.getAge()==person2.getAge()){
            outputAge ="first person is the same age as second person";
        }
        else if (person1.getAge()>person2.getAge()) {
            outputAge="First person is older than second person";
        }
        else {
            outputAge="first person is younger than second person";
        }
        System.out.println(outputAge);
    }
}
