package stringimmutable;

public class Main {
    public static void main(String[] args) {
        ImmutabilityClass i = new ImmutabilityClass("ads",16,"monday");
        System.out.println(i.getName());
        System.out.println(i.getDate());
        System.out.println(i.getDay());
    }
}
