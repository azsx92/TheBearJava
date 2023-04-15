package chap_02;

public class Gugudan2 {
    public static void main(String[] args) {
        for(int i = 2; i < 10 ; i++ ) {
            for(int j = 1; j < 10; j++) {
                if(j % 9 == 1) {
                    System.out.println();
                } else {
                    System.out.print(i  +  " * "  + j +  " = "  + j * i+", ");
                }
            }
        }
    }
}
//diffchecker.com
