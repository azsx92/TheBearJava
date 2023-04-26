package chap_03;
    /*
    주민등록번호에서 생년월일 및 성별까지만 출력하는 프로그램
    901231-1
    030708-4
    */
public class _Quiz_03 {
    public static void main(String[] args) {
        String a = "901231-1234567";
        String b = "030708-4567890";
        System.out.println(a.substring(0 , 8));  // 0 위치 부터 8 위치 까지 직전까지
        System.out.println(b.substring(0 , 8));
        // 변형된 내용
        System.out.println(b.substring(0 , b.indexOf("-") + 2)); //0 위치부터 하이픈 위치 + 2 직전까지

    }
}
