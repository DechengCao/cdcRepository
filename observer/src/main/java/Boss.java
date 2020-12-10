public class Boss extends Observer{
    public Boss(PhoneFactory phoneFactory) {
        this.phoneFactory=phoneFactory;
        phoneFactory.observerAdd(this);
    }

    @Override
    public void reaction() {
        System.out.println("老板：通知技术人员检查生产设备");
    }
}
