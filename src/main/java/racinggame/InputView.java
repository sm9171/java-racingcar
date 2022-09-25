package racinggame;

import java.util.Scanner;

public class InputView {
    private static final Scanner SCANNER = new Scanner(System.in);

    public int inputUserCarCount() {
        System.out.println("자동차 대수는 몇 대 인가요?");
        return SCANNER.nextInt();
    }

    public int inputUserTryCount() {
        System.out.println("시도할 횟수는 몇 회 인가요?");
        return SCANNER.nextInt();
    }
}