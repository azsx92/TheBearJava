package chap_06;
// 개인정보를 비공개로 전환하는 메소드 작성
// 하나의 메소드에서 모든 동작 처리
// 각 정보는 아래 위치부터 비공개 적용
// 이름 : 2번째 글자(나코딩 -> 나**)
// 주민번호 : 9번째 글자(990130-1234567 -> 990130-1******)
// 전화번호 : 10번째 글자(010-1234-5678 -> 010-1234-****)
public class _Quiz_06 {

    public static String getHiddenData(String data , int index) {
        String hiddenData = data.substring(0 , index); // 나코딩 -> 나**
        for (int i = index; i < data.length(); i++) {
        //for (int i = 0; i < data.length() - index; i++) {
            hiddenData += "*";
        }

        return hiddenData;
    }

    // 힌트
    // substring
    // length
    public static void main(String[] args) {
        String s;
    /*    System.out.println(s.replace("and", ",")); // " and" 를 "," 로 변환
        System.out.println(s.substring(7));  // 인덱스 기준 7 부터 시작 (이전 내용은 삭제)
        System.out.println(s.substring(s.indexOf("Java")));
        // "Java" 가 시작하는 위치부터, ","이 시작하는 위치 바로 앞까지
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf("."))); // 시작 위치부터 끝 위치 "직전"*/

        String name = "나코딩";
        String id = "9110130-1234567";
        String phoneNo = "010-1234-5678";

        System.out.println("이름 : " + getHiddenData(name, 1));
        System.out.println("주민번호 : " + getHiddenData(id, 9));
        System.out.println("전화번호 : " + getHiddenData(phoneNo, 9));

    }
}
