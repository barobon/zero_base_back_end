/*
    String의 replace, indexOf, contains를 사용하지 않고 replace 구현
    replace: 입력 문자열에서 원하는 부분을 다른 문자열로 대체할 수 있는 함수
 */
public class Java_18_1_Practice3 {
    public static String solution(char[] str, char[] find, char[] to) {
        boolean isEqual = false;
        int equalIndex;
        String output="";
        for(int i =0; i< str.length; i++){
            for(int j=0; j< find.length; j++){
                if(str[i+j] != find[j]) {
                    isEqual = false;
                    break;
                }
                else
                    isEqual = true;
                equalIndex = i;
            }

            if(isEqual){
                for(int j=0; j< to.length; j++){
                    output += to[j];
                }
                i += find.length-1;
            }
            else {
                output += str[i];
            }
        }
        return output;
    }

    public static void main(String[] args) {
        // Test code
        String str = "Hello Java, Nice to meet you! Java is fun!";
        String find = "Java";
        String to = "자바";

        // 기존 String replace
        System.out.println(str.replace(find, to));

        // 자체 구현 replace
        char[] strExArr = str.toCharArray();
        char[] findArr = find.toCharArray();
        char[] toArr = to.toCharArray();
        System.out.println(solution(strExArr, findArr, toArr));

        strExArr = "POP".toCharArray();
        findArr = "P".toCharArray();
        toArr = "W".toCharArray();
        System.out.println(solution(strExArr, findArr, toArr));
    }
}
