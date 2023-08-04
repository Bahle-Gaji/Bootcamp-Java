package Book3.chapter1;

public class ActorApp {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Arnold", "Graaf", true);
        System.out.println("The actor " + actor1.firstName + " " + actor1.lastName
                + " is a good actor? " + actor1.goodActor + ".");

        Actor actor2 = new Actor("Dwayne", "Johnson");
        System.out.println("The actor " + actor2.firstName + " " + actor2.lastName
                + " is a good actor? " + actor2.goodActor + ".");
    }
}
