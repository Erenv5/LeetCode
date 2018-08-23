package chapterOne;

public class MinSizeSubarrySum {

    /**
     * 有问题从全长开始缩
     * 有方向性
     * 会至少牺牲一边
     * @param s
     * @param nums
     * @return
     */
    private static int minSubArrayLen(int s, int[] nums) {
        int i=0,j=nums.length,n,sum=0;
        for(;i==j;){
            n=i;
            while(n!=j){
                sum=nums[n++]+sum;
            }
            //[2,3,1,2,4,3]
            if(i==0 && j==nums.length && sum<s)
                return 0;
            if(sum-i < sum-j && sum-j > s)
                i++;
            else if(sum-i < sum-j && sum-j < s)
                return j-i+1;
            else if(sum-i > sum-j && sum-i > s)
                j--;
            else if(sum-i > sum-j && sum-i < s)
                return j-i+1;
            sum=0;
        }
        return 1;
    }

    /**
     * 来自吴仕权
     * 窗口大小 1->length
     * 窗口位置 从左到右
     * @param s
     * @param nums
     * @return
     */
    private static int minSubArrayLenWu(int s, int[] nums){
        int result,n,i,j,sum=0;
        for(result=1;result<=nums.length;result++){
            i=0;
            j=i+result-1;
            while(j<nums.length){
                n=i;
                while(n!=j+1){
                    sum=nums[n++]+sum;
                }
                i++;
                j++;
                if(sum >= s)
                    return result;
                else if(sum <= s && result == nums.length)
                    return 0;
                sum=0;
            }
        }
        return -1;
    }

    /**
     * 滑动窗口 从左向右爬
     * @param s
     * @param nums
     * @return
     */
    private static int minSubArrayLenCSDN(int s, int[] nums) {
        int i, n, j, sum = 0, length=1, minLength = -1;
        for (i = 0, j = 0; j < nums.length;){
            length = j - i + 1;
            n = i;
            while (n <= j) {
                sum=nums[n++]+sum;
            }
            if(sum >= s){
                if(length < minLength || minLength == -1){
                    minLength = length;
                }
                i++;
            }
            else {
                j++;
            }
            sum = 0;
        }

        return minLength==-1 ? -1 : minLength;
    }

    public static void main(String[] args) {
        int [] nums= {1,2,1,1};
        System.out.println(minSubArrayLenCSDN(7,nums));
    }
}
