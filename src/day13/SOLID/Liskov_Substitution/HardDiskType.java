package day13.SOLID.Liskov_Substitution;

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