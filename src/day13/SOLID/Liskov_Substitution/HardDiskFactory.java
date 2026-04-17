package day13.SOLID.Liskov_Substitution;

public class HardDiskFactory {

    final static int DEFAULT_CAPACITY = 512;
    final static HardDiskType DEFAULT_TYPE = HardDiskType.HITACHI;

    public static HardDisk getHardDisk(HardDiskType type, int capacity) {
        switch (type) {
            case DELL:
                return new DellHD(capacity + "GB");
            case ASUS:
                return new AsusHD(capacity + "GB");
            default:
                return new AsusHD(HardDiskFactory.DEFAULT_CAPACITY + "GB");//512gb`
        }


    }

}