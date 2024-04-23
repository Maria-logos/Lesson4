package app;

public class Main {
    public static void main(String[] args) {
        int productNo = 1;
        String product = "smartphone";
        int daysCnt = 5;
        double salesByDay = 2430.682;
        System.out.printf("Product No %d: %s,\n", productNo, product);
        System.out.printf("total sales for %d days is EUR %.2f,\n", daysCnt, daysCnt*salesByDay);
        System.out.printf("sales by day is EUR %.2f.\n", salesByDay);;
        productNo++;
        product = "laptop";
        daysCnt += 2;
        salesByDay = 1498.121;
        System.out.printf("Product No %d: %s,\n", productNo, product);
        System.out.printf("total sales for %d days is EUR %.2f,\n", daysCnt, daysCnt*salesByDay);
        System.out.printf("sales by day is EUR %.2f.\n", salesByDay);
    }
}