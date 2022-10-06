package racingGame.view;

import racingGame.domain.Car;
import racingGame.domain.Cars;
import racingGame.domain.NamingCar;

public class ResultView {
    private static final String TIRE_MARK = "-";
    private static final String WINNING_SENTENCE = "가 최종 우승했습니다.";
    private static final String SEPARATOR = ":";
    public void printRacingResult(Cars cars, int tryNum) {
        printTitle();
        for (int i = 0; i < tryNum; i++) {
            printEachRound(cars);
            System.out.println();
        }
        System.out.println(joinWinners(cars));
    }

    private static void printEachRound(Cars cars) {
        for (Car namingCar : cars.getCars()) {
            namingCar.move();
            System.out.println(namingCar.convertRound(SEPARATOR, TIRE_MARK));
        }
    }

    private static String joinWinners(Cars cars) {
        return String.join(", ", cars.findCoWinner()).concat(WINNING_SENTENCE);
    }

    private static void printTitle() {
        System.out.println("살행결과");
    }

}
