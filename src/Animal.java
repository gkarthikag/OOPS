public class Animal {
     private String name ="gk";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(){
        System.out.println("Non-Parameterized Constructor ");
    }
    public Animal(String name){
        this.name = name;
    }
    public void eat(){
        System.out.println("MyCat is Eating");
    }
    public void makeNoise(){
        System.out.println( getName()+" is making noise");
    }
    public void sleep(){
        System.out.println("Sleeping");
    }
    public void roam(){
        System.out.println("Roaming...");
    }

}
