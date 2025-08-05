public class Person {
    private String name ;
    private int age;
    private Address address;


    public Person(){
        System.out.println("non-Parameterized in Person class");
    }
    public Person(String name,int age, Address address){
        this.name=name;
        this.age=age;
        this.address=address;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void displayInfo(){
        System.out.println("\n\nName:"+name+"\nAge:"+age+"\nAddress:"+address);
    }
}
