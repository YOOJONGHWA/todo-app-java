package domain;

import java.time.LocalDateTime;

import static domain.TaskStatus.COMPLETED;

public class Task {

    private Long id;
    private String title;
    private String description;
    private LocalDateTime dueDate;
    private TaskStatus status;

    public Task(Long id, String title, String description, LocalDateTime dueDate, TaskStatus status) {
        this.id = id;
        if (title == null || title.isBlank()) throw new IllegalArgumentException("제목은 입력해주세요");
        this.title = title;
        this.description = description;
        if (this.dueDate.isBefore(LocalDateTime.now())) throw new IllegalArgumentException("마감일은 현재보다 과거이면 안됩니다.");
        this.dueDate = dueDate;
        this.status = status;
    }

    public void markComplete() {
        status = COMPLETED;
    }
}
