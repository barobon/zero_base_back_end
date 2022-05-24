import java.util.Scanner;

/*
18. 연습문제 풀이 1-1
입력된 정수 자료형의 숫자를 거꾸로 변환 하는 프로그램 작성
    ex) 12345 -> 54321
        100   -> 1
        -12345-> -54321
 */
public class Java_18_1_Practice1 {
    public static void solution(int num) {
        int input, output = 0;
        input = num;
        while (Math.abs(input)>0){
            output = output*10 + input%10;
            input /= 10;
        }
        System.out.println(output);

    }

    public static void main(String[] args) {
        // Test code
        solution(12345);
        solution(-12345);
        solution(100);
        solution(0);
        return;
    }
}

