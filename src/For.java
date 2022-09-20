import java.util.Scanner;

public class For {
    public static void main(String[] args) {

        System.out.println("\n ----- for문 -----\n");
//      가장 많이 사용 되는 반복문
//      while문과 차이점
//        1. 초기화 변수와 초기화 변수 카운트를 for문의 설정 부분에 입력
//        2. 초기화 변수가 for문의 설정 부분에 입력되면서 for 문의 지역변수로 사용되어 같은 이름의 변수를 계속 사용할 수 있다
//        3. 초기화 변수 카운트가 항상 마지막에 동작함
//        for문은 초기화와 조건식, 카운트를 한줄에 같이 적는다 (카운트 입력시 초기화; x )
//        while 문과 달리 카운트 위치 변화가 없으므로 고정되어 있어 일정한 값이 출력

        for(int i=0; i<10; i++) { // int 1=0; 지역변수로 사용되어 for문 탈출후 동일한 이름 변수 사용 가능
            System.out.print(i);
        }

//        초기화 변수가 for문 안에서 사용 되기 때문에 동일한 이름 변수 사용 가능
//        for문에서 탈출한 형태이기 때문에 메모리에서 다시 사용이 가능

        for(int i=0; i<10; i++) {
            System.out.print(i);
        }

        System.out.println("\n ----- while문 -----\n");

//        while 문의 경우 초기화 변수를 선언하고 실행
//        while 문에서 카운트 위치에 따라 출력값이 틀려진다 주의.
        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count++;
        }

//        동일한 이름 변수를 선언 할수 없다 => int count = 0;
//        기존의 변수를 재활용하고 저장된 값을 초기화하여 사용해야 한다
        count = 0;
        while (count < 10) {
            System.out.println(count);
            count++;
        }

//        문제 1) 아래의 while문을 for으로 변환하여 출력하세요
//        System.out.println("\n----- while 문 -----\n");
//
//        int hit = 0; // 초기화 변수
//        while (hit < 10){ // 히트가 10보다 작다 -> true
//            System.out.println("나무를 " + hit + "번 찍었습니다.");
//            if (hit == 10) {
//                System.out.println("나무가 넘어갑니다.");
//            }
//            hit++; // hit + (+)
//        }
        System.out.println("\n----- 문제1 -----\n");
        for(int i=0; i < 11; i++) {
            System.out.println("나무를 " + i + "번 찍었습니다.");
            if (i == 10) {
                System.out.println("나무가 넘어갑니다.");
            }
        }

//        문제 2) 원하는 단수의 구구단을 출력하는 프로그램을 for문을 사용하여 출력하세요
        System.out.println("\n----- 문제2 -----\n");
        for(int i=1; i < 10; i++) {
            int dan = 5;
            System.out.println(dan + " * " + i + " = " + (dan*i));
        }

//        문제 3) for문을 사용하여 아래의 모양과 동일한 모양이 출력되도록 프로그래밍을 하세요
//        *
//        **
//        ***
//        ****
//        *****
        System.out.println("\n----- 문제3 -----\n");

        String star = "";
        for(int i = 0; i < 5; i++) {
            star += "*";
//            star = star = "*";
            System.out.println(star);
        }


        System.out.println("\n----- 중첩 for문 -----\n");
//        for 문 안에 for문 존재하는 형태의 for문
//        2차원 배열의 내용을 출력할 때 많이 사용함

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.println("i의 값 : " + i + "\tj의 값 : " + j );
            }
            System.out.println("----------------------");
        }

//        변수의 카운트 부분을 ++를 사용한 단항 연산자가 아닌 산출 대입 연산자를 사용 시
//        원하는 크기만큼 카운트 값을 변경할수 있다
        for(int i = 2; i < 10; i += 1) { // i+=1 = i++ 동일, i+=2.. 사용가능
            System.out.println("----- " + i + "단 -----");
            for(int j = 1; j < 10; j++) {
                System.out.println((i + " * " + j + " = " + (i*j)));
            }
        }



    }
}
