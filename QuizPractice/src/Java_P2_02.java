import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Java_P2_02 {
    class MySet {
        ArrayList<Integer> list;

//      생성자
        MySet(){
            this.list = new ArrayList<Integer>();
        }

        MySet(int[] arr){
            this.list = new ArrayList<Integer>();
            //for each로 입력받은 배열의 원소들을 받음
            for (int item: arr){
                this.list.add(item);
            }
        }

        public void add(int x){
            //중복 검사
            for(int item: this.list){
                if(item ==x){
                    return;
                }
            }
            this.list.add(x);

        }

        //교집합
       public MySet retainAll(MySet b){
            MySet result = new MySet();

            for(int itemA: this.list){
                for (int itemB: this.list){
                    if(itemA == itemB){
                        result.add(itemA);
                    }
                }
            }
            return result;
        }
        //합집합
        public MySet addAll(MySet b){
            MySet result = new MySet();

            for (int itemA: this.list){
                result.add(itemA);
            }
            for (int itemB: b.list) {
                result.add(itemB);
            }
            return result;
        }
        //차집합
        public MySet removeAll(MySet b){
            MySet result = new MySet();

            for(int item: this.list){
                boolean flag = false;

                for(int itemB: b.list){
                    if(item == itemB){
                        flag = true;
                        break;
                    }

                }

            }

            return result;
        }
    }
    public static void main(){
        HashSet a = new HashSet(Arrays.asList(1,2,3,4,5));
        HashSet b = new HashSet(Arrays.asList(2,4,6,8,10));

        /*
        교집합: a.retainAll(b);
        합집합: a.addAll(b);
        차집합: a.removeAll(b);
        */

    }
}
