public class BuilderDemo {
    public static void main(String[] args) {
        Director director = new Director();
        OlderMobileBuilder olderMobileBuilder = new OlderMobileBuilder();
        CameraPhoneBuilder cameraPhoneBuilder = new CameraPhoneBuilder();
        FlagPhoneBuilder flagPhoneBuilder = new FlagPhoneBuilder();
        director.construct(olderMobileBuilder);
        director.construct(cameraPhoneBuilder);
        director.construct(flagPhoneBuilder);
        Phone olderMobile = olderMobileBuilder.build();
        Phone cameraPhone = cameraPhoneBuilder.build();
        Phone flagPhone = flagPhoneBuilder.build();
        System.out.println(olderMobile);
        System.out.println(cameraPhone);
        System.out.println(flagPhone);
    }

}
