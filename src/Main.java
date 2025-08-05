//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//         Animal A = new Animal();
//        Animal A1 = new Animal("Dog");
//        System.out.println(A.getName());
//        A.eat();
//        A.makeNoise();
//        A.roam();
//        A.sleep();

        Address add = new Address("Bangalore","Karnataka",463125);
       add.displayAddress();

        Person P = new Person("GssK",22,add);
        P.displayInfo();

        Employee E = new Employee();
        E.applyForLeave();
        E.displayInfo();

        Student S = new Student(21,'A');
        S.displayInfo();
    }
}