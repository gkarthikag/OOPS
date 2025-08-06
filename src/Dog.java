public class Dog extends Animal {
    public String getName() {
        return name;
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

    private String name;

    public void play() {
        System.out.println( name+"is playing");
    }
}
