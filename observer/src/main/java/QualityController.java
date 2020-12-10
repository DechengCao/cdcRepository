public class QualityController extends Observer{
    public QualityController(PhoneFactory phoneFactory) {
        this.phoneFactory=phoneFactory;
        phoneFactory.observerAdd(this);
    }

    @Override
    public void reaction() {
        System.out.println("质检员：发现手机质量问题，通知工人停止生产，通知老板");
    }
}
