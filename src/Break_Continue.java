import java.util.Scanner;

public class Break_Continue {
    public static void main(String[] args) {
//        break : 반복문 내에서 break 를 만나면 해당 반복문 즉시 중단
        System.out.println("\n ----- break -----\n");
        for(int i = 0; i < 10; i++) {
            if (i == 5) { //5번에서 멈춤
                break;
            }
            System.out.println("break 사용시 현재 i의 값 : " + i);
        }

//        continue : 반복문 내에서 continue 를 만나면 해당 루프만 중단하고 다음 루프로 넘어감
        System.out.println("\n ----- continue -----\n");
        for(int i = 0; i < 10; i++) {
            if (i == 5) {
                continue; //5번은 제외하고 다음 루프로 넘어감
            }
            System.out.println("continue 사용 시 현재 i의 값 : " + i);
        }

//        문제 4) 구구단 전체를 출력하는 프로그램을 작성하세요
//        조건 1) 사용자 입력으로 2 ~ 9까지 숫자를 하나 입력받기
//        조건 2) 사용자 입력으로 입력 받은 단수에 break와 continue를 사용하는 구구단을 작성하세요

        System.out.println("\n원하는 단수를 입력하세요");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 2; i < 10; i++) {
            System.out.println("----- " + i + "단 -----");
            if (i == n) {
                break;
            }

            for(int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + (i*j));
            }
        }
        for(int i = 2; i < 10; i++) {
            System.out.println("----- " + i + "단 -----");
            if (i == n) {
                continue;
            }
            for(int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + (i*j));
            }
        }


    }
}
