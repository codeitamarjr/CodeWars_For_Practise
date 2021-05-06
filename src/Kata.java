public class Kata {
    public static int quarterOf(int month) {
       int quarterNumber;


       if ((double)month/3-(int)month/3>0.0){
           quarterNumber=(month/3)+1;
       } else
           quarterNumber=month/3;
        return quarterNumber;
    }
}