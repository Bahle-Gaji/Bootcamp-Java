package Book3.chapter1;

public class Actor {
    String firstName;
    String lastName;
    boolean goodActor;

    public Actor(String first, String last){
        firstName = first;
        lastName = last;
    }
    public Actor(String first, String last, boolean goodActor){
        this.firstName = first;
        this.lastName = last;
        this.goodActor = goodActor;
    }

    public void printObject(){
        System.out.println(this);
    }

    public String toString(){
        return "Actor = {\n"
                + "firstName: " + this.firstName + ",\n"
                + "lastName: " + this.lastName + "\n"
                + "goodActor: " + this.goodActor + "\n}";
    }
}
