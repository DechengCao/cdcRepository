public class Adapter implements MicroToTypeC{
    private Micro micro;

    public Adapter(Micro micro) {
        this.micro = micro;
    }

    @Override
    public void handleRequest() {
        micro.function1();
        micro.function2();
    }
}
