package domain;

public enum TaskStatus {

    IN_PROGRESS("진행 중"),
    COMPLETED("완료");

    private final String description;

    TaskStatus(String description) {
        this.description = description;
    }

    public String getStatus() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }
}
