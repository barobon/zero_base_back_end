public class quiz1_1 {
    public static int solution(int n, int m) {
        int answer = 0;
        for(int input=n; input<=m; input++){
            int tmp = input;
            boolean isPalindrome = false;
            String str = Integer.toString(input);
            for(int i=0; i<str.length()/2; i++){
                if(str.charAt(i) == str.charAt(str.length()-i-1))
                    isPalindrome = true;
                else {
                    isPalindrome = false;
                    break;
                }
            }
            if(input<10)
                isPalindrome =true;
            if(isPalindrome)
                answer++;
        }

        return answer;
    }
    public static void main(String [] args){
        int answer = solution(1,100);
    }
}
