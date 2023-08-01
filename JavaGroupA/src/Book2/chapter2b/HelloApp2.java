package Book2.chapter2b;

import Book2.chapter2.HelloApp;

public class HelloApp2 {
    public static void main(String[] args) {
        HelloApp hello = new HelloApp();        //Create instance of HelloApp, using its instance var
        hello.helloMessage = "Hi there!";
        System.out.println(hello.helloMessage);

        System.out.println(HelloApp.helloMessage2); //Printing class/static var from HelloApp
        HelloApp.main(args);        //Running static/class method of HelloApp
    }
}
