package array2;
import java.util.Random;

public class array4 {
    public static void main(String[] args) {
        //5x5 사이즈의 배열에 1~100 사이의 무작위 숫자를 중복 없이 삽입
        int [][] arr = new int [5][5];
        Random rand = new Random();
        boolean flag=false;//중복값 체크 플래그
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int r_num=rand.nextInt(100)+1;//랜덤값 뽑기
                for (int k=0; k<=i; k++) {//여태까지 입력된 값들 중 중복값을 체크
                    for (int l=0; l<5; l++) {
                        if (arr[k][l]==r_num){//만약 중복값이 있으면
                            flag=true;//플래그를 활성화
                            break;
                        }
                    }
                    if (flag){
                        break;
                    }
                    /*
                    if(IntStream.of(arr[k]).anyMatch(x->x==r_num)) {
                        flag=true;
                    }*/
                }
                if (flag) {//만약 중복값이 있으면
                    j--;//직전 순회로 돌아가고
                    flag=false;//플래그 초기화
                }
                else {//만약 중복값이 없으면
                    arr[i][j] = r_num;//값을 자리에 넣음
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j=0; j<5; j++) {
                System.out.printf("%d\t",arr[i][j]);
            }
            System.out.println();
            //System.out.printf("%d번째 줄 : %s\n", i, Arrays.toString(arr[i]));
        }
    }
}
