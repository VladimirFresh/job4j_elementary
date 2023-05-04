package ru.job4j.enumeration;

public enum Status {
    ACCEPTED("Принят"),
    IN_WORK("В работе"),
    WAITING("Ожидание"),
    FINISHED("Работа завершена");

    private String info;

    Status(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}
