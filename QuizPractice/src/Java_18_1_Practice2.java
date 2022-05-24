import java.util.Scanner;

/*
사용자가 입력한 알파벳의 대소문자를 바꾸는 프로그램 작성
 */
public class Java_18_1_Practice2 {
    public static void solution() {
        Scanner sc = new Scanner(System.in);
        System.out.print("알파벳을 하나 입력해주세요: ");
        char inputChar = sc.next().charAt(0);
        int ascii = (int)inputChar;
        //if(inputChar >= 'a' && inputChar <= 'z');
        if(ascii>=97){
            // 32 = (int)a - (int)A
            ascii -= 32;
            inputChar = (char) ascii;
        }
        else {
            ascii += 32;
            inputChar = (char) ascii;
        }
        System.out.println("대소문자 변경 = " + inputChar);
    }

    public static void reference() {
        int a = (int)'a';
        System.out.println("a = " + a);
        int z = (int)'z';
        System.out.println("z = " + z);
        int A = (int)'A';
        System.out.println("A = " + A);
        int Z = (int)'Z';
        System.out.println("Z = " + Z);
        int etc = (int)'%';
        System.out.println("etc = " + etc);
    }

    public static void main(String[] args) {
        reference();    // 아스키 코드 참고
        solution();
    }
}
