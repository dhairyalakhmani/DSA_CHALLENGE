public class lengthofLongestword {
    public static void main(String[] args) {
        String s = "This is Data Structures and Algorithms Class";
        String[] words = s.split(" ");
        int maxlen=0;
        for(int i = 0; i<words.length; i++){
            int len = words[i].length();
            maxlen = Math.max(len,maxlen);
        }
        System.out.println(maxlen);
    }
}
