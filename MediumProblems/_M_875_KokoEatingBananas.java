package MediumProblems;

/**
 * @author shree
 **/
public class _M_875_KokoEatingBananas {
    public static void main(String[] args) {
        System.out.println(minEatingSpeed(new int[] {3,6,7,11}, 8));
        System.out.println(minEatingSpeed(new int[] {30,11,23,4,20}, 5));
        System.out.println(minEatingSpeed(new int[] {30,11,23,4,20}, 6));
    }
    public static int minEatingSpeed(int[] piles, int h){
        int left = 0, right = 1000000000;
        while (left <= right){
            int mid = left + (right - left) / 2;
            if(f(piles,mid) <= h){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }

    public static int f(int[] piles, int k){
        int hours = 0;
        for(int bananas : piles){
            hours += bananas / k;
            if(bananas % k != 0){
                hours++;
            }
        }
        return hours;
    }
}
