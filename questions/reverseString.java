public class reverseString {
    public static void main(String[] args) {
        String s = "This is the DSA class.";
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        int start=0,end=0;
        while(end<sb.length()){
            if(sb.charAt(end)!=' ')
                end++;
            else{
                sb.replace(start, end + 1,
                new StringBuilder(sb.substring(start, end+1)).reverse());
                start = end+2;
                end = start+1;
            }
        }
        System.out.println(sb);
    }
}
