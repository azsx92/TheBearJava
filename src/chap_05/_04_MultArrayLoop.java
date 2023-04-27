package chap_05;

public class _04_MultArrayLoop {
    public static void main(String[] args) {
        // 다차원 배열 순회
        // 3 X 5 크기의 2차원 배열
        String[][] seats = new String[][] {
                {"A1","A2","A3","A4","A5"}, // 0 배열
                {"B1","B2","B3","B4","B5"}, // 1 배열
                {"C1","C2","C3","C4","C5"}  // 2 배열
        };

        for (int i = 0; i < 3; i++) { // 세로
            for (int j = 0; j < 5; j++) {
                System.out.print(seats[i][j] + " "); //A1 A2 A3
            }
            System.out.println();
        }
        System.out.println("---------------------------");

        // 첫 줄에는 3칸, 둘째 줄에는 4칸 , 셋째 줄에는 5칸
        String [][] seats2 = {
                {"A1","A2","A3"}, // 0 배열
                {"B1","B2","B3","B4"}, // 1 배열
                {"C1","C2","C3","C4","C5"}  // 2 배열
        };

        for (int i = 0; i < seats2.length; i++) { // 세로
            for (int j = 0; j < seats2[i].length; j++) {
                System.out.print(seats2[i][j] + " "); //A1 A2 A3
            }
            System.out.println();
        }

        System.out.println("------------------------");
        // 세로 크기 10 x  가로 크기 15 에 해당하는 영화관 좌석
        String[][] seats3 = new String[10][15];
        String[] ebg = {"A","B","C","D","E","F","G","H","I","J"};
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = ebg[i] + (j + 1);
            }
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
