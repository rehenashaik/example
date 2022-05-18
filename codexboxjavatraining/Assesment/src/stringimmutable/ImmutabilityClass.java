package stringimmutable;

public final class ImmutabilityClass {
 private final String name;
 private final int date;
 private final String day;

    public String getName() {
        return name;
    }

    public int getDate() {
        return date;
    }

    public String getDay() {
        return day;
    }

    ImmutabilityClass(String name, int date, String day){
    this.name = name;
    this.date = date;
    this.day = day;

}
}
