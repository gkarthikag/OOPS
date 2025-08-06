public class Dog extends Animal {
    public String getName() {
        return  name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Dog(){
        this("dog");
    }
    Dog(String name){
        this.name= name;
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating");
    }

    @Override
    public void makeNoise() {
        System.out.println(getName()+ " is making noise");
    }

    @Override
    public void roam() {
        System.out.println(getName()+" is roaming");
    }

    private String name;

    public void play() {
        System.out.println( name+"is playing");
    }
}
