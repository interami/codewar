public class CompleteThePattern {
    public static String pattern (int n) {

        StringBuilder res=new StringBuilder("");
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n-i;j++)
            {
               res.append(n-j);
            }
            res.append("\n");
        }
        return res.toString().trim();//Happy Coding ^_^
    }

    public static void main(String[] args) {
        System.out.println(pattern(11));
    }
}