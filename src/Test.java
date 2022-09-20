public class Test {
    public static void main(String[] args) {
//        문제1) 점수를 입력받아 점수 및 등급을 출력하는 프로그램을 작성하세요
//        else if 문을 사용하여 작성
//        95이상 = A+, 90이상 = A, 85이상 = B+, 80이상 = B, 75이상 = C+, 70이상 = C, 60이상 = D, 60미만 = F
//        중첩 if 문을 사용하여 각각의 + 대의 점수를 출력

//        Scanner scan = new Scanner(System.in);
//        System.out.println("점수를 입력 해주세요");
//
//        int grade = scan.nextInt();
//
//        if (grade>=90) {
//            if (grade>=95) {
//                System.out.println("A+등급");
//            } else {
//                System.out.println("A등급");
//            }

//        } else if (grade>=80) {
//            if (grade>=85) {
//                System.out.println("B+등급");
//            } else {
//                System.out.println("B등급");
//            }
//        } else if (grade>=70) {
//            if (grade>=75) {
//                System.out.println("C+등급");
//            } else {
//                System.out.println("C등급");
//            }
//        } else if (grade>=60) {
//                System.out.println("D등급");
//            } else {
//            System.out.println("F등급");
//        }

//        System.out.println("점수를 입력 해주세요");
//        Scanner scan = new Scanner(System.in);
//        int grade = scan.nextInt();
//
//        if (grade >= 95) {
//            System.out.println("당신의 등급은 A+ 입니다");
//        } else if (grade >= 90) {
//            System.out.println("당신의 등급은 A 입니다");
//        } else if (grade >= 85) {
//            System.out.println("당신의 등급은 B+ 입니다");
//        } else if (grade >= 80) {
//            System.out.println("당신의 등급은 B 입니다");
//        } else if (grade >= 75) {
//            System.out.println("당신의 등급은 C+ 입니다");
//        } else if (grade >= 70) {
//            System.out.println("당신의 등급은 C 입니다");
//        } else if (grade >= 60) {
//            System.out.println("당신의 등급은 D 입니다");
//        }
//        else {
//            System.out.println("당신의 등급은 F 입니다");
//        }


//      1번 문제
//        두 정수를 입력받아 합을 구하여 출력하는 프로그램을 작성하라. 키보드 입력은 Scanner 클래스를 이용하라
//        두 정수를 입력하세요>> 10 20
//        10 + 20은 30

//        Scanner scan = new Scanner(System.in);
//        System.out.println("두 정수를 입력하세요>>");
//
//        int num1;
//        int num2;
//        int sum;
//
//        num1 = scan.nextInt();
//        num2 = scan.nextInt();
//        sum = num1 + num2;
//        System.out.println(num1 + " + " + num2 + "은 "+ sum);

//      2번 문제
//        한 층의 높이가 5m일 때, 건물이 몇 층인지 입력받아 높이를 출력하라.
//        몇 층인지 입력하세요>>155
//        775m 입니다

//        Scanner scan = new Scanner(System.in);
//        System.out.println("몇 층인지 입력하세요>>");
//
//        int floor;
//        int height = 5; //5m미터
//
//        floor = scan.nextInt();
//        System.out.println((floor * height) + "m 입니다");

//      3번 문제
//        x 값을 입력받아 y = x²-3x+7 식을 계산하여 y값을 출력하는 프로그램을 작성하라
//        x 값을 입력하세요>> 5
//        x=5, y=17

//        Scanner scan = new Scanner(System.in);
//        int x, y;
//
//        System.out.println("x 값을 입력하세요>>");
//
//        x = scan.nextInt();
//        y = x * x -3 * x + 7;
//        System.out.println("x=" + x + ", " + "y=" + y);

//      4번 문제
//        2차원 평면에서 하나의 직사각형은 두 점으로 표현된다. (50, 50)과 (100, 100)의 두점으로 이루어진
//        사각형이 있다고 하자. 한 점을 구성하는 정수 x와 y값을 입력받고 점 (x,y)가 이 직사각형 안에 있는지를
//        판별하는 프로그램을 작성하라
//        점 (x,y)의 좌표를 입력하세요>>60 70
//        점 (60,70)은 (50,50)과 (100,100)의 사각형 내에 있습니다

//        Scanner scan = new Scanner(System.in);
//
//        int x, y;
//
//        System.out.println("점 (x,y)의 좌표를 입력하세요>>");
//
//        x = scan.nextInt();
//        y = scan.nextInt();
//
//        if((x >= 50 && x <= 100) && (y >= 50 && y <= 100)) {
//            System.out.println("점 (" + x + "," + y + ")은" + "(50,50)과 (100,100)의 사각형 내에 있습니다");
//        } else {
//            System.out.println("점 (" + x + "," + y + ")은" + "(50,50)과 (100,100)의 사각형 내에 없습니다");
//        }


//      5번 문제
//        다음과 같이 AND와 OR의 논리 연산을 입력받아 결과를 출력하는 프로그램을 작성하라
//        예를들어 'true AND false'의 결과를 false를, 'true OR false'의 결과로
//        true를 출력하면 된다. if 문 대신 switch 문을 이용하라
//        논리 연산을 입력하세요>>true OR false
//        true

//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("논리 연산을 입력하세요>>");
//
//        boolean x = scan.nextBoolean();
//        String operation = scan.next();
//        boolean y = scan.nextBoolean();
//
//        switch (operation) {
//            case "AND":
//                System.out.println(x&y);
//                break;
//            case "OR":
//                System.out.println(x|y);
//                break;
//            default:
//                System.out.println("입력이 잘못되었습니다.");
//        }


//      6번 문제
//        돈의 액수를 입력받아 오만원권, 만원건, 천원권, 500원짜리 동전, 100원짜리 동전, 10원짜리 동전, 1원짜리 동전
//        각 몇개로 변환되는지 출력하라.
//        돈의 액수를 입력하세요>>65245
//        오만원건1개, 만원1개, 천원5개, 500원0개, 100원2개, 10원4개, 1원5개

//        Scanner scan = new Scanner(System.in);
//        System.out.println("돈의 액수를 입력하세요>>");
//
//        int money = scan.nextInt();
//
//        System.out.println("오만원권" + (money / 50000) + "개");
//        money = money % 50000;
//        System.out.println("만원" + (money / 10000) + "개");
//        money = money % 10000;
//        System.out.println("천원" + (money / 1000) + "개");
//        money = money % 1000;
//        System.out.println("500원" + (money / 500) + "개");
//        money = money % 500;
//        System.out.println("100원" + (money / 100) + "개");
//        money = money % 100;
//        System.out.println("10원" + (money / 10) + "개");
//        money = money % 10;
//        System.out.println("1원" + (money / 1) + "개");

//      7번 문제
//        학점이 A, B이면, "Excellent", 학점이 C,D이면 "Good", 학점이 F이면 "Bye"라고
//        출력하는 프로그램을 작성하라. switch와 break를 활용하라
//        학점을 입력하세요>>B
//        Excellent

//        Scanner scan = new Scanner(System.in);
//        System.out.println("학점을 입력하세요>>");
//
//        String level;
//        level = scan.next();
//
//        switch (level) {
//            case "A":
//            case "B":
//                System.out.println("Excellent");
//                break;
//            case "C":
//            case "D":
//                System.out.println("Good");
//                break;
//            default:
//                System.out.println("Bye");
//                break;
//        }
//      8번 문제
//        음료수 종류와 잔의 개수를 입력받으면
//        가격을 알려주는 프로그램을 작성하라
//        단, 에스프레소는 2000원, 아메리카노 2500원, 카푸치노 3000원, 카페라떼 3500원이다.

//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("주문해주세요");
//        String name = scan.next();
//
//        System.out.println("몇잔 드실겁니까?");
//        int qty = scan.nextInt();
//
//        if(name.equals("에스프레소")) {
//            System.out.println("에스프레소 " + qty + "잔의 가격은 " + (qty * 2000) + "원 입니다.");
//        } else if (name.equals("아메리카노")) {
//            System.out.println("아메리카노 " + qty + "잔의 가격은 " + (qty * 2500) + "원 입니다.");
//        } else if (name.equals("카푸치노")) {
//            System.out.println("카푸치노 " + qty + "잔의 가격은 " + (qty * 3000) + "원 입니다.");
//        } else if (name.equals("카페라떼")) {
//            System.out.println("카페라떼 " + qty + "잔의 가격은 " + (qty * 3500) + "원 입니다.");
//        } else {
//            System.out.println("주문을 잘못하셨습니다");
//        }


//      9번 문제
//        369게임의 일부를 작성해보자.
//        1~99까지의 정수를 입력받고
//        수에 3, 6, 9 중 하나가 있는 경우는 "박수짝"
//        두 개 있는 경우는 "박수짝짝",
//        하나도 없으면 "박수없음"을
//        출력하는 프로그램을 작성하라.

//        예를 들면,
//        13인 경우 "박수짝",
//        36인 경우 "박수짝짝",
//        5인 경우 "박수없음"을 출력하면 된다.

//        1~99 사이의 정수를 입력하세요>>36
//        박수짝짝

//        Scanner scan = new Scanner(System.in);
//        System.out.println("1~99 사이의 정수를 입력하세요>>");
//
//        int number = scan.nextInt();
//        int first = number / 10;
//        int second = number % 10;
//        int count = 0;
//
//        if ((first % 3 == 0) && (second % 3 == 0)) {
//            System.out.println("박수짝짝");
//        } else if ((first % 3 == 0) ^ (second % 3 ==0)) {
//            System.out.println("박수짝");
//        } else {
//            System.out.println("박수없음");
//        }

//     10번 문제
//       8번을 변형해서 에스프레소는 2000원, 아메리카노 2500원, 카푸치노 3000원, 카페라떼 3500원이며
//       에스프소의 경우는 10잔 이상 주문하면 가격의 5%를 할인해준다.

//        Scanner scan = new Scanner(System.in);
//        System.out.println("주문하세요");
//        String name = scan.next();
//
//        System.out.println("몇잔 드실겁니까?");
//        int qty = scan.nextInt();
//
//        if (name.equals("에스프레소")) {
//            if(qty >= 10) {
//                System.out.println(name + " " + qty + "잔의 가격은 " + (qty * 2000) + "원 입니다");
//                System.out.println("10잔 이상 주문하셔서 5% 할인된 금액으로 " + ((qty * 2000) * 0.95) + "원 입니다");
//            } else {
//                System.out.println(name + " " + qty + "잔의 가격은 " + (qty * 2000) + "원 입니다");
//            }
//        } else if (name.equals("아메리카노")) {
//            System.out.println(name + " " + qty + "잔의 가격은 " + (qty * 2000) + "원 입니다");
//        } else if (name.equals("카푸치노")) {
//            System.out.println(name + " " + qty + "잔의 가격은 " + (qty * 2000) + "원 입니다");
//        } else if (name.equals("카페라떼")) {
//            System.out.println(name + " " + qty + "잔의 가격은 " + (qty * 2000) + "원 입니다");
//        } else {
//            System.out.println("없는 메뉴입니다. 다시 주문해주세요.");
//        }

//        문제 2) while문을 사용하여 1 ~ 10까지 화면에 출력하는 프로그램을 작성하세요

//        int count = 1;
//
//        while (count < 11) {
//            System.out.println(count);
//            count++;
//        }

//        문제 3) while문을 사용하여 1 ~ 10까지의 총합을 구하는 프로그램을 작성하세요
//        값이 저장될 변수 필요함

//        int count = 1;
//        int total = 0;
//
//        while (count < 11) {
//            total = total + count;
//            System.out.println("count : " + count + "\ttotal :" + total);
//            count++;
//        }

//        문제 4) while문을 사용하여 지정한 단수의 구구단을 출력하세요
//        출력형태 : 5 * 1 = 5 ~ 5 * 9 = 45

//        Scanner scan = new Scanner(System.in);
//        System.out.println("구구단을 입력하세요");
//
//        int dan = scan.nextInt();
//        int count = 1;
//
//        while (count < 10) {
//            System.out.println(dan + " * " + count + " = " + (dan * count));
//            count++;
//        }

//        문제 5) while문을 사용하여 2 ~ 9 단까지의 구구단을 모두 출력하는 프로그램을 작성하세요
//        다중 while문 사용
//        출력 형태 : 5 * 1 = 5 ~ 5 * 9 = 45

//        System.out.println("1 ~ 9 구구단");
//
//        int a = 1; // 단수
//        while (a < 10) {
//            System.out.println("\n ----- " + a + "단 -----\n");
//
//            int b = 1; // 숫자
//            while (b < 10) {
//                System.out.println(a + " * " + b + " = " + a * b);
//                b++;
//            }
//            a++;
//
//        }

//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("정수를 입력하고 마지막에 0을 입력하세요");
//
//        int count = 0;
//        int n = 0;
//        double sum = 0.0;
//
//        while ((n = scan.nextInt()) != 0) {
//            sum = sum + n;
//            count++;
//        }
//
//        System.out.println(count);
//        System.out.println(sum);



    }
}