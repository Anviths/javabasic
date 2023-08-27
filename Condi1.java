class Demo {
    public static void main(String[] args) {
        int a = 50;
        int b = 40;
        int c = 51;
        int res = a > b ? a > c ? a : c : b > c ? b : c;
        System.out.println(res);
    }
}