public class Worker extends Observer{
    public Worker(PhoneFactory phoneFactory) {
        this.phoneFactory=phoneFactory;
        phoneFactory.observerAdd(this);
    }

    @Override
    public void reaction() {
        System.out.println("工人：立即停止生产，原地待命");

    }
}
