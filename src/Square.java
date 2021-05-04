public class Square {
    public static boolean isSquare(int n) {

        if(n>=0) {
            for (long count=0; count <= n; count++) {
                if (count*count==n){
                    return true;
                }
            }
        }
        return false;
    }
}
