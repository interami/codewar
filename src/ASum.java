public class ASum {
    public static void main(String[] args) {
        System.out.println(findNb(24723578342962L));
    }
    public static long findNb(long m) {
        long n=-1;
        int i=1;
        long sum=0;
        while(sum<=m)
        {
            sum+=i*i*i;

           if(sum==m)
           {
               n=i;
               break;
           }
            i++;
        }
        return n;
        // your code
    }
}
