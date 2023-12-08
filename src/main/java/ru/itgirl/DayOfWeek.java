package ru.itgirl;

/**
 * Hello world!
 *
 */
public class DayOfWeek
{
    private String title;

    private DayOfWeek(String title) {
        this.title = title;
    }

    public static DayOfWeek MONDAY = new DayOfWeek("Понедельник");

    @Override
    public String toString() {
        return "Сегодня{" +
                "='" + title + '\'' +
                '}';
    }
}
