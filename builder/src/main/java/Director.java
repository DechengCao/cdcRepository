public class Director {
    public void construct(PhoneBuilder builder){
        builder.buildCPU();
        builder.buildBattery();
        builder.buildMemory();
        builder.buildScreen();
        builder.buildFingerIdentification();
        builder.buildCamera();
        builder.buildGSP();
        builder.buildNFC();

    }
}
