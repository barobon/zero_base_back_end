import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Java_P2_03 {
    //약수 및 두 수의 최대 공약수와 최소 공배수 구하기

    //약수 구하기
    public ArrayList getDivisor(int num){
        ArrayList result = new ArrayList();

        for(int i=1; i<=(int)num/2; i++){
            if(num%i==0){
                result.add(i);
            }
        }
        result.add(num);
        return result;
    }

    //최대 공약수 GCD
    public int getGCD(int numA, int numB){
        int gcd = -1;

        ArrayList divisorA = this.getDivisor(numA);
        ArrayList divisorB = this.getDivisor(numB);

        for(int itemA: (ArrayList<Integer>)divisorA){
            for(int itemB: (ArrayList<Integer>)divisorB){
                if(itemA == itemB){
                    if(itemA>gcd){
                        gcd = itemA;
                    }
                }
            }
        }
        return gcd;
    }

    //최소공배수 LCM
    public int getLCM(int numA, int numB){
        int lcm = -1;
        int gcd = this.getGCD(numA,numB);

        if(gcd != -1){
            lcm = numA * numB / gcd;
        }
        return lcm;
    }
    public static void main(String[] args){
//두 개의 주사위를 던졌을 때 합이 3 또는 4의 배수일 경우의 수
        int[] dice1 = {1,2,3,4,5,6};
        int[] dice2 = {1,2,3,4,5,6};

        int nA = 0;
        int nB = 0;
        int nAandB = 0;

        //기본 풀이
        for(int item1: dice1){
            for(int item2: dice2){
                if((item1 + item2) % 3 == 0){
                    nA += 1;
                }
                if((item1 + item2) % 4 == 0){
                    nB += 1;
                }
                if((item1 + item2) % 12 == 0){
                    nAandB += 1;
                }
            }
        }

        //HashSet
        HashSet<ArrayList> allCase = new HashSet<>();   //경우의 수의 묶음을 저장하기 위해 Arraylist 제네릭 사용
        for(int item1: dice1){
            for(int item2: dice2){
                if((item1 + item2) % 3 ==0 || (item1 + item2) % 4 ==0){
                    ArrayList list = new ArrayList(Arrays.asList(item1, item2));
                    allCase.add(list);
                }
            }
        }




    }
}

