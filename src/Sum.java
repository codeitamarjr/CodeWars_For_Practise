public class Sum
{ //attention!
    public static int getSum(int a, int b)
    {
        int aSum=0;
        int bSum=0;
        if(a==b) return a;

        if(a<0){
            aSum=a;
            } else {
                for ( int count = 1; count <= a ; ++count){
                    aSum += count;
            }
        }

        if(b<0){
            bSum=b;
        } else {
            for ( int count = 1; count <= b ; ++count){
                bSum += count;
            }
        }



        return aSum+bSum;
        }
}