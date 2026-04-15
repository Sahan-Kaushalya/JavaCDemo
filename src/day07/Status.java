package day07;

public enum Status {
    SUCCESS(200,"SUCCESS"), ERROR(500,"ERROR"),
    NOT_FOUND(404,"NOT FOUND"), UNAUTHORIZED(401,"UNAUTHORIZED"),
    FORBIDDEN(403,"FORBIDDEN"), BAD_REQUEST(400,"BAD REQUEST"),
    INTERNAL_SERVER_ERROR(500,"INTERNAL SERVER ERROR"),ORDER_PENDING(1,"ORDER PENDING"),
    ORDER_PROCESSING(2,"ORDER PROCESSING"),ORDER_SHIPPED(3,"ORDER SHIPPED"),
    ORDER_DELIVERED(4,"ORDER DELIVERED"),ORDER_CANCELLED(5,"ORDER CANCELLED"),
    REFUNDED(6,"REFUNDED"),REFUND_PENDING(7,"REFUND PENDING");


    private final int code;
    private final String description;

    Status(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}