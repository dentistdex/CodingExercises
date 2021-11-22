public class SumOdd {
    public static boolean isOdd (int a){
        if (a<0) {
            return false;
            }else if (a % 2 != 0) {return true;
            }else {return false;}
    }
    public static int sumOdd(int start, int end) {
        if (start < 0 || end < 0 || end < start) {
            return -1;
        } else {
            int count = ((end - start) / 2) ;
            if(end % 2 != 0 || start % 2 != 0) {
                ++count;
            }
            int sum = 0;
            for (int i = 0; i < count; i++) {
                if (start % 2 != 0) {
                    sum = sum + (start + (2 * i));
                } else {
                    sum = sum + (start + 1 + (2 * i));
                }

            }
            return sum;
        }
    }
}
