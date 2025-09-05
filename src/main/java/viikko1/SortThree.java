package viikko1;

public class SortThree {
    public static String ascending(int a, int b, int c) {
        int min, mid, max;
        min = Math.min(a, Math.min(b, c));
        max = Math.max(a, Math.max(b, c));
        mid = a+b+c-min-max;

        return min+ "," +mid+ "," +max;
    }
}
