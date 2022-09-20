import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        System.out.println("----- 배열 사용하기 -----\n");

//        배열 : 하나의 이름으로 여러개의 데이터를 저장하기 위한 데이터 타입
//        자바의 배열을 동일한 데이터 타입의 데이터만 저장할 수 있음
//        배열은 index를 가지고 있으며 데이터를 index를 통해서 구분함
//        index는 0부터 시작
//        new 키워드를 사용해서 배열을 초기화 시 해당 데이터 타입의 초기값으로 초기화됨
//        System.out.println("배열 array1의 index 4의 값 : " + array1[5]); //  존재하지 않는 곳 불러올시 오류

//        사용법 :
//        선언 : 1. 데이터타입 배열명 [] = new 데이터타입 [크기]
//              2. 데이터타입 배열명[];  배열명 = new 데이터타입 [크기];
//              3. 데이터타입 배열명[] = {데이터1, 데이터2, 데이터3, ...};
//        사용 : 1. 배열명 [index]; // 지정한 index에 있는 데이터를 가져옴
//              2. 배열명 [index] = 데이터; // 지정한 index에 데이터를 저장

//        빈 배열 선언, 메모리 상에 array1이라는 빈 배열을 등록, 해당 배열을 사용 시 반드시 초기화 작업이 필요
        int array1[];   //  이름만 선언된 상태, 빈 메모리
        array1 = new int[5];    //  배열을 초기화 함, 메모리 주소 상태가 입력된 상태
        System.out.println("배열 array1의 메모리 주소 : " + array1);    //  c/c++에서는 주소 사용, 자바에서는 x
        System.out.println("배열 array1의 index 0의 값 : " + array1[0]);
        array1[2] = 10;
        System.out.println("배열 array1의 index 0의 값 : " + array1[2]);
        System.out.println("배열 array1의 index 4의 값 : " + array1[4]);
        System.out.println("배열 array1의 길이 : " + array1.length);  // 해당 배열의 길이 -> int[5];

//      array1 = new int[5];
//      index 는 0에서 4까지
//        [0][1][2][3][4]
//        [0][0][0][0][0]
        System.out.println("");

        int array2[];
        array2 = new int[5];
        System.out.println("배열 array2의 메모리 주소 : " + array2);
        System.out.println("배열 array2의 index 0의 값 : " + array2[0]);
        array2[2] = 20;
        System.out.println("배열 array2의 index 2의 값 : " + array2[2]);
        System.out.println("배열 array2의 index 4의 값 : " + array2[4]);
        System.out.println("배열 array2의 길이 : " + array2.length);

        System.out.println();


//        array3 배열 방법은 무조건 선언과 동시에 데이터 값을 입력
        int array3[] = {10, 20, 30, 40, 50};
        System.out.println("배열 array3의 메모리 주소 : " + array3);
        System.out.println("배열 array3의 index 0의 값 : " + array3[0]);
        array3[2] = 300;
        System.out.println("배열 array3의 index 2의 값 : " + array3[2]);
        System.out.println("배열 array3의 index 4의 값 : " + array3[4]);
        System.out.println("배열 array3의 길이 : " + array3.length);

        System.out.println();

//        배열을 먼저 선언하고 데이터를 나중에 입력하는 1번 형식으로 배열을 선언 시 3번 형식의 데이터 입력은 불가능함
//        int array4[];
//        array4 = {10, 20, 30, 40, 50};    //  오류 발생, 무조건 new 를 사용해야 함
//        array4 = new int[5];
//        array4[0] = 10;
//        array4[1] = 20;
//        array4[2] = 30;
//        array4[3] = 40;
//        array4[4] = 50;


//        문제 5) int 타입의 변수 intArray를 생성하고 크기를 10으로
//        설정한 후 각 index에 1 ~ 10까지의 데이터를 입력하고, 저장된 데이터를 모두 출력하세요

        int array5[] = {1,2,3,4,5,6,7,8,9,10};

        for(int i=0; i < array5.length; i++) {
            System.out.println(array5[i]);
        }

        System.out.println();

        System.out.println(array5[0]);
        System.out.println(array5[1]);
        System.out.println(array5[2]);
        System.out.println(array5[3]);
        System.out.println(array5[4]);
        System.out.println(array5[5]);
        System.out.println(array5[6]);
        System.out.println(array5[7]);
        System.out.println(array5[8]);
        System.out.println(array5[9]);

//        문제 6) 문제 5의 intArray에 저장된 값을 모두 합하는 프로그램을 작성하세요
        System.out.println();
        System.out.println("합계 :" + (array5[0]+array5[1]+array5[2]+array5[3]+array5[4]+array5[5]+array5[6]+array5[7]+array5[8]+array5[9]));

        int sum, j;
        for(sum=0, j=0; j<10; j++) {
            System.out.println(sum += array5[j]);
        }

        int total = 0;
        total = array5[0] + array5[1] + array5[2] + array5[3] + array5[4] + array5[5] + array5[6] + array5[7] + array5[8] + array5[9];
        System.out.println(total);


        System.out.println("\n----- 기본 타입과 래퍼런스 타입 -----\n");
        int a = 10;
        int b = 20;

        System.out.println("변수 a의 값 : " + a + "\t변수 b의 값 : " + b);

//        변수 a의 값을 변수 b에 복사해서 넘겨줌
        b = a;
        System.out.println("변수 a의 값 : " + a + "\t변수 b의 값 : " + b);

//        변수 a의 값을 변경해도 변수 b의 값은 그대로 남아있음, 값을 복사해서 넘겨줬기 때문
        a = 100;
        System.out.println("변수 a의 값 : " + a + "\t변수 b의 값 : " + b);

        System.out.println("");
        int arr1[] = {100};
        int arr2[] = {200};
        System.out.println("배열 arr1의 주소 : " + arr1 + "\t배열 arr2의 주소 : " + arr2);
        System.out.println("배열 arr1[0]의 주소 : " + arr1[0] + "\t배열 arr2[0]의 주소 : " + arr2[0]);

        arr2 = arr1;
        System.out.println("배열 arr1의 주소 : " + arr1 + "\t배열 arr2의 주소 : " + arr2);
        System.out.println("배열 arr1[0]의 주소 : " + arr1[0] + "\t배열 arr2[0]의 주소 : " + arr2[0]);

        arr1[0] = 2000;
        System.out.println("배열 arr1의 주소 : " + arr1 + "\t배열 arr2의 주소 : " + arr2);
        System.out.println("배열 arr1[0]의 주소 : " + arr1[0] + "\t배열 arr2[0]의 주소 : " + arr2[0]);



        Scanner scan = new Scanner(System.in);

//      배열 선언, 5데이터 5개
//        배열 선언 시 배열의 크기를 설정하는 부분에 변수 사용 금지
//        변수는 변경되는 값이기 때문에 배열의 크기가 어떻게 될지 알수 없음
//        배열의 index 접근에는 변수를 사용하는 것이 가능함
        int arrayInt[]; // 배열에 래퍼런스 선언
        arrayInt = new int[5];  //  배열 생성, 크기, 배열객체 생성
        int max = 0;    //  현재 가장 큰 수를 저장할 변수
        System.out.println("양수 5개를 입력하세요");

        for(int i = 0; i < 5; i++) {        //  배열 데이터가 1~5
//            사용자 입력을 통해 얻은 데이터를 배열에 저장
            arrayInt[i] = scan.nextInt();   //  입력받은 정수를 배열에 저장

//            배열에 저장된 데이터를 max와 비교
            if(arrayInt[i] > max) {     //  입력받은 정수가 가장 크면
//                max에 배열에 저장된 값을 저장
                max = arrayInt[i];      //  max 변경
            }

        }
        System.out.println("\n----- for ~ each -----\n");

        int arrNum1[] = {10,20,30,40,50};
        int total1 = 0;

        for (int i = 0; i < arrNum1.length; i++) {      //  반복 조건을 사용자가 지정
            System.out.println("arrNum[" + i + "] : " + arrNum1[i]);
//            total1 += arrNum1[i];
//            System.out.println("total1 : " + total1);
        }

        for (int i = 0; i < arrNum1.length; i++) {
            total1 = total1 + arrNum1[i];
            System.out.println("total1 : " + total1);
        }

        System.out.println("\n----- for ~ each를 사용한 배열의 데이터 출력 -----\n");

        int arrNum2[] = {10,20,30,40,50};
        int total2 = 0;

        for (int num : arrNum2) {       //  반복 가능한 객체의 크기만큼 반복
            System.out.println("num : " + num);
        }

        for (int num : array2) {
            total2 = total2 + num;
            System.out.println("total2 : " + total2);
        }


        int [] n = {1,2,3,4,5};
        int sum2=0;
        for(int k : n) {
            System.out.print(k + " ");
            sum2 += k;
        }

        System.out.println("합은 " + sum2);

        String f[] = {"사과", "배", "바나나", "체리", "딸기", "포도"};
        for(String s :f)
            System.out.print(s + " ");





    }
}
