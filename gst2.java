public class gst2 {
    public static void main(String[] args) {
        int bill = 3000;
        int p1 = 1200;
        int p2 = 1400;
        int plt = 100;
        int gsta = bill - p1 - p2 - plt;
        double gstp = (gsta * 100.0) / (bill - gsta);
        System.out.println(gstp);
    }
}
