package twoPointersALGO;
public class twoPointerAlex {
    public static void main(String[] args) {
        String alex_final="1010110010";
        int len=alex_final.length();
        int left=0,right=len-1,shortest=0;
        while(left<right){
            if((alex_final.charAt(left)=='0' && alex_final.charAt(right)=='1') || (alex_final.charAt(left)=='1' && alex_final.charAt(right)=='0')){
                left++;
                right--;
            }
            else{
                shortest=right-left+1;
                break;
            }
        }
        System.out.println(shortest);

    }
    
}
