package lesson11.task12;

public class CheckUrl {
    public static void main(String[] args) {
        System.out.println(urlChecker("http://"));
    }
    public static boolean urlChecker(String url) {
        return url.startsWith("http://");
    }
}
