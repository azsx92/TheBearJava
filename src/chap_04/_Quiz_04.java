package chap_04;
/*
*  주차 요금은 시간당 4000원 (일일 최대 요금은 30000원)
*  경차 또는 장애인 차량은 최종 요금에서 50% 할인
*
*  일반 차량은 5시간 주차 시 20000원
*  경차 5시간 주차 시 10000원
*  장애인 차량 10시간 주차 시 15000 원
*
* 실행 결과 : 주차 요금은 xx 원입니다.
* */
public class _Quiz_04 {
    public static void main(String[] args) {
        // 이건 틀린 답이다. 내가 작성한 답안
        int hour  = 1;
        int price = 4000;
        int dPrice = 30000;

        int light_car  = 2;
        int disability = 2;
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
        //        System.out.println("일반 차량은 5시간 주차 시 " + price * i);
         //       System.out.println("경차 차량은 5시간 주차 시 " + (price * i) / 2 );
            } else if (i == 10) {
           //     System.out.println("장애인 차량은 10시간 주차 시 " + dPrice / disability);
            }
        }


        // 이건 강의 답이다. 내가 작성한 답안
        hour  = 5; // 주차 시간
        boolean isSmallCal = false;          // 경차 차량
        boolean withDisabledPerson = false; // 장애인 차량 여부

        int fee = hour * 4000; // 주차 정산 요금 (시간당 4000원 곱하기)

        if (fee > 30000) {
            fee = 30000; // 일일 최대 요금
        }

        if(isSmallCal || withDisabledPerson){   // 경차 또는 장애인 차량인 경우 50%
            fee /= 2; // 50%
        }

        // 실행 결과 출력
        System.out.println("주차 요금은 "+ fee + "입니다.");


    }
}
