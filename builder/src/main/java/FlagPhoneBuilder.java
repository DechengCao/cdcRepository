public class FlagPhoneBuilder implements PhoneBuilder{
    private Phone phone = new Phone();
    @Override
    public void buildCPU() {
        phone.setCPU("骁龙845");
    }

    @Override
    public void buildMemory() {
        phone.setMemory("256G内存");

    }

    @Override
    public void buildBattery() {
        phone.setBattery("超长待机");

    }

    @Override
    public void buildScreen() {
        phone.setScreen("可以触屏屏幕");

    }

    @Override
    public void buildCamera() {
        phone.setCamera("高像素");

    }

    @Override
    public void buildGSP() {
        phone.setGSP("全球定位");
    }

    @Override
    public void buildFingerIdentification() {
        phone.setFingerIdentification("具有指纹识别");

    }

    @Override
    public void buildNFC() {
       phone.setNFC("具有NFC");
    }

    @Override
    public Phone build() {
        return phone;
    }
}
