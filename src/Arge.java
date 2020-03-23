public class Arge {
    public static int nbYear(int p0, double percent, int aug, int p) {
        int n=0;
        int sum=p0;
        while (sum<p)
        {
            sum+=(int)(sum*percent/100+aug);
            System.out.println(sum);
            n++;
        }
        return n;// your code
    }
    public static void main(String[] args) {
        System.out.println(nbYear(1500,5,100,5000));
    }
}
