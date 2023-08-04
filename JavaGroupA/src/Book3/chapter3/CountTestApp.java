package Book3.chapter3;

public class CountTestApp {
    public static void main(String[] args) {
        CountTest c1 = new CountTest();
        System.out.println(CountTest.instanceCount);
        CountTest c2 = new CountTest();
        System.out.println(CountTest.getInstanceCount());
    }
}

class CountTest{
    public static int instanceCount;

    public CountTest(){
        instanceCount++;
    }

    public static int getInstanceCount(){
        return instanceCount;
    }
}
