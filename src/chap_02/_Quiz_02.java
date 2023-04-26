package chap_02;
/*
키가 115cm 이므로 탑승 불가능합니다.
키가 121cm 이므로 탐승 가능합니다.
*/
public class _Quiz_02 {
    public static void main(String[] args) {
        int a = 115;
        int b = 121;
        String c = (a > b) ? "탐승 가능" : "탑승 불가능";
        System.out.println("키가 " + a +"cm 이므로 "+c+"합니다.");

        c = (a < b) ? "탐승 가능" : "탑승 불가능";
        System.out.println("키가 " + b +"cm 이므로 "+c+"합니다.");
        // 밑에는 강의 정답 위에는 나의 생각 정답
        int height = 121;
        String result = (height >= 120) ? "탑승 가능합니다." : "탑승 불가능합니다.";
        System.out.println("키가  " + height + "cm 이므로 " + result);
    }
}
