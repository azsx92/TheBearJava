package chap_05;

public class _05_ASCII {
    // ASCII 배워서 화성가자.
    public static void main(String[] args) {
        char c = 'A';   // 알파벳 대문자는(A)는 65 부터 시작, 소문자 97부터 시작 , 숫자는 0부터 시작
        System.out.println(c);
        System.out.println((int)c);

        c = 'B';
        System.out.println(c);
        System.out.println((int)c);

        // 세로 크기 10 x  가로 크기 15 에 해당하는 영화관 좌석
        String[][] seats3 = new String[10][15];
        char ch = 'A';
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = String.valueOf(ch) + (j + 1);
            }
            ch++;
        }

        // 표 구매
        // H9 H10
        seats3[7][8] = "__";  // H9
        seats3[7][9] = "___";  // H10


        // 영화관 좌석 번호 확인
        for (int i = 0; i < seats3.length; i++) { // 세로
            for (int j = 0; j < seats3[i].length; j++) {
                System.out.print(seats3[i][j] + " "); //A1 A2 A3
            }
            System.out.println();
        }
        System.out.println("---------------------------");
    }
}
