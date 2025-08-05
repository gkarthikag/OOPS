public class Address {
    private String city;
    private String state;
    private int pin;

    public Address(){
        System.out.println("Non-Parameterized Constructor in Address Class");
    }

    public Address(String city, String state, int pin){
        this.city =city;
        this.state=state;
        this.pin=pin;
    }


    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getPin() {
        return pin;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
    public String toString() {
        return city + " | " + state + " | " + pin;
    }

    public void displayAddress(){
        System.out.println(this);
    }

}
