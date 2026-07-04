/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l=0;
        int m=n;
        int mid=0;
        while(l<=m){
            mid = l+(m-l)/2;
            int number = guess(mid);
            if(number==0)
                return mid;
            else if(number==-1)
                m=mid-1;
            else
                l=mid+1;
        }
        return 0;
    }
}