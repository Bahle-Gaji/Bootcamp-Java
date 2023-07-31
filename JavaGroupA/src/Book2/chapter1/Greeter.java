package Book2.chapter1;
import javax.swing.JOptionPane;

public class Greeter {
//    public void sayHello(){
//        System.out.println("Hello World!");
//    }
    public void sayHello(){
        JOptionPane.showMessageDialog(null,
                "Hello World! JOp",
                "Greeter",
                JOptionPane.INFORMATION_MESSAGE);
    }

}
