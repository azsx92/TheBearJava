package chap_05;
// 신발 사이즈는 250 부터 295 까지 5 단위로 증가
// 신발 사이즈 수는 총 10가지

// 사이즈 250(재고 있음)
// 사이즈 255(재고 있음)
public class _Quiz_05 {
    public static void main(String[] args) {

        // 강의 정답
        int [] sizeArray = new int[10];
        for (int i = 0; i < sizeArray.length; i++) {
            sizeArray[i] = 250 + (5 * i);
        }

        for (int size : sizeArray) {
            System.out.println("사이즈 " + size + " (재고 있음)");
        }
        System.out.println("------- 밑에는 내가 풀었지만 틀렸다.");
        // 못 풀었음
        int [] sizes = new int[8];

        for (int i = 0; i < sizes.length; i++) {
            sizes[i] += 250 + i + 5;
            System.out.println(sizes[i]);
        }
        for (int i = 0; i < sizes.length; i++) {
        }




    }
}
