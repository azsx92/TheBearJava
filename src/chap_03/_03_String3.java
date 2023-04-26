package chap_03;

public class _03_String3 {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java"));  // 문자열 내용이 같으면 true, 다르면 false
        // equalsInnoreCase 대소문자 구분 없이 문자열 내용이 같으지 여부 체크
        System.out.println(s2.equalsIgnoreCase("python"));

        // 문자열 비교 심화
        s1 = "1234"; // 벽에 붙은 메모지의 비밀번호 정보 (참조)
        s2 = "1234";
        System.out.println(s1.equals(s2)); // true (내용)
        System.out.println(s1 == s2 );    //  true (참조)

        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); //  true (내용)
        System.out.println(s1 == s2 );     //  false (참조)
        // 자바에서는 문자열을 비교할 때는 등호를 쓰지 말고 equals를 쓰도록하자 등호는 참조 영역을 비교하기 때문이다.

    }
}
