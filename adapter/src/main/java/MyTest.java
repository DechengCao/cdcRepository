public class MyTest {
    public static void main(String[] args) {
        Phone phone = new Phone();
        TypeC typeC = new TypeC();
        phone.function(typeC);
        System.out.println("======================");
        Micro micro = new Micro();
        Adapter adapter = new Adapter(micro);
        phone.function(adapter);

    }
}
