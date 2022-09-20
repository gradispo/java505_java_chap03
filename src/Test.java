import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

//        오픈첼린지
//        숨은 번호를 맞추는 게임을 만들어보자. 컴퓨터는 0에서 99까지의 임의의 수를 선택하고, 사용자는 이 수를 맞추는 게임이다.
//        아래와 같이 컴퓨터가 가진 수가 98인 경우를 보자. 사용자가 55라고 입력하면 " 도늪게", 다시 70을 입력하면 "더 높게" 라는
//        식으로 메세지를 출력하고, 범위를 좁혀가면서 수를 맞춘다. 게임을 반복하기 위해서 y/n을 묻고 "n"이 입력되면 종료한다.

//        System.out.println("Up & Down게임입니다. 숨겨진 수를 맞추어 보세요");
//        System.out.println("0-99");



//        실습문제 1번
//        영문 소문자를 하나 입력받고 그 문자보다 알파벳 순위가 낮은 모든 문자를 출력하는 프로그램을 작성하라
        Scanner scan = new Scanner(System.in);
        System.out.print("알파벳 한 문자를 입력하세요>>");
        String s = scan.next();
        char c = s.charAt(0);
        for (int i = 'a'; i <= c; i++) {
            if (i <= c) {
                System.out.println(i);
            }
            
        }

//        실습문제 2번
//        정수를 10개 입력받아 배열에 저장한 후, 배열을 검색하여 3의 배수만 골라 출력하는 프로그램을 작성하라

//        System.out.println("정수 10개 입력>>");

//        실습문제 6번
//        다음과 같이 영어와 한글의 짝을 이루는 2개의 배열을 만들고, 사용자로부터 영어 단어를 입력 받아 한글을 출력하는 프로그램을 작성하라
//        "exit"을 입력하면 프로그램을 종료하라.

//        String eng[] = {"student", "love", "java", "happey", "future"};
//        String kor[] = {"학생", "사랑", "자바", "행복한", "미래"};


//        보너스문제
//        다음은 3x4의 2차원 배열을 만들고 이곳에 0~9 범위의 정수를 랜덤하게 저장한 후 2차원 배열과
//        합을 출력하는 프로그램의 실행 결과와 코드이다. 빈 곳에 적절한 코드를 삽입하라

//        int intArray[][];
//        intArray = new int[3][4]; // 문제
//
//        for(int i=0; i<3; i++)
//            for(int j=0; j<4; j++)
//                intArray[i][j] = (int)(Math.random()*10);
//
//        for(int i=0; i < intArray[i]; i++) { // 문제
//            for(int j=0; j < intArray[j]; j++) { // 문제
//                System.out.println(intArray[i][j]); // 문제
//            }
//            System.out.println();
//        }
//
//        int i=0, sum=0;
//        while(i<3) {
//            sum += i; // 문제
//
//            i++; // 문제
//        }
//        System.out.println("합은 " + sum);

    }
}