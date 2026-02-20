public class dup {
    public static void main(String[] args) {
        int nums[] = {1,1,1,2,2,2};
        int c=0;
        int c1 = 0;
        for(int i = 0; i<nums.length-1; i++)
        {
            if(nums[i] == nums[i+1])
            {
                c++;
            }
            else
            {
                c1++;
                while(c>=1)
                {
                    nums[i+1-(c--)] = nums[i+1];
                } 
                c=0;
            }
        }
        return c1+1;
    }
}
