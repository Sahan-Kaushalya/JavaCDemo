package day12.factory_dp;

public enum HardDiskType {
    DELL,
    HITACHI,
    ASUS;

    private int capacity;

    HardDiskType() {
    }

    HardDiskType(int capacity) {
        this.capacity = capacity;
    }
}