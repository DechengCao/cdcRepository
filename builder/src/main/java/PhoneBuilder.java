public interface PhoneBuilder {
    void buildCPU();
    void buildMemory();
    void buildBattery();
    void buildScreen();
    void buildCamera();
    void buildGSP();
    void buildFingerIdentification();
    void buildNFC();
    Phone build();
}
