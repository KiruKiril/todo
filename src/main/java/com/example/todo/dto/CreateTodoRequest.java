package com.example.todo.dto;

import java.time.LocalDateTime;

public record CreateTodoRequest(
        String title,
        String description,
        LocalDateTime dueDate
) {}
