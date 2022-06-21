// n보다 작은 소수의 개수를 출력하는 프로그램 작성
//0<n<=100

import java.util.Arrays;

public class test1_p1 {
    public int solution(int n){
        //에라토스테네스의 체
        //어떤 수의 배수는 소수가 아니므로, 범위 내에서 소수가 아닌 수를 제외
        //체를 통과시키듯이, 소수가 아닌 수를 순차적으로 제외

        int[] intArray = new int[n];

        //1로 초기화(0,1은 소수가 아닌 것을 알기에 제외)
        //배열의 인덱스를 숫자로 사용
        for (int i=2; i<n; i++){
            //1이면 소수, 0이면 소수 아님
            intArray[i] = 1;
        }

        //sqrt(n)까지만 반복(루트 n)
        for (int i=2; i<= (int)Math.sqrt(n); i++){
            if(intArray[i]==0) continue;

            int num = i*2;
            //i의 배수들을 전부 소수에서 제외
            while (num<n){
                intArray[num]=0;
                num+=i;
            }
        }
        return Arrays.stream(intArray).sum();
    }
}
