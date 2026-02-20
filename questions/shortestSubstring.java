public class shortestSubstring {
    public static void main(String[] args) {


        String k  = "aaaaab";
        if(k.length() > 1){
            System.out.println(k.substring(0 , 7));
            return;
        }
        String a = "abscdabcdcabc";
        String b = "abac";
        int n = a.length();
        int[] freqB = new int[26];
        for(char c : b.toCharArray()){ //ye loop hamare saare b ke characters ki frequency store karega
            freqB[c - 'a']++;
        }
        int s=0,e=0;
        int minLen=Integer.MAX_VALUE;
        while(e<n){
            while(e<n && e - s + 1 >= b.length() && !isValid(s, e, freqB, a))
                e++;
            minLen = Math.min((e-s+1), minLen);
            if(e >= n) break;
            while(isValid(s, e, freqB, a)){
                minLen = Math.min((e-s+1), minLen);
                s++;
            }
        }
        System.out.println(minLen);
    }
    static boolean isValid(int s, int e, int[] freqB, String a){
        int[] freqsub = new int[26];
        char[] subArray = a.substring(s,e+1).toCharArray();
        for(char x : subArray){
            freqsub[x - 'a']++;
        }
        for(int i=0; i<26; i++){
            if(freqB[i]<=freqsub[i])
                continue;
            else
                return false;
        }
        return true;
    }
    static void solve(String a , String b){
        
    }
}


// a 
// f1[a - 'a']--
// f2[a - 'a']
