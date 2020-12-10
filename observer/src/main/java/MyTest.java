public class MyTest {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory();
        new QualityController(phoneFactory);
        new Worker(phoneFactory);
        new Boss(phoneFactory);
        System.out.println("生产出现问题");
        phoneFactory.setState(false);
    }
}
