package problems;

public class PageCount {
    static int pageCount(int n, int p) {
        return Math.min(p / 2, n / 2 - p / 2);
    }
}
