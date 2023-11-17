package step4.presentation;

import step4.controller.CarController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;

public class RacingInputView {

    public static final String DELIMITER_OF_CAR_NAME = ",";

    private BufferedReader br;
    private CarController carController;
    private InputValidation inputValidation;

    public RacingInputView() {
    }

    public RacingInputView(CarController carController) {
        this.br = new BufferedReader(new InputStreamReader(System.in));
        this.carController = carController;
        this.inputValidation = new InputValidation();
    }

    public int inputNameOfCars() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");

        carController.createCarsOf(splitInputToNameOfCars());

        return carController.getCars().getNumOfCars();
    }

    private String[] splitInputToNameOfCars() {
        String input = inputValidation.validateNameOfCars(readLine(), DELIMITER_OF_CAR_NAME);

        return input.split(DELIMITER_OF_CAR_NAME);
    }

    public int inputNumOfTry() {
        System.out.println("시도할 횟수는 몇 회 인가요?");

        return inputValidation.validateNumOfTry(readLine());
    }

    private String readLine() {
        try {
            return br.readLine();
        } catch (IOException e) {
            throw new UncheckedIOException("쓰기 작업 중 오류가 발생했습니다.", e);
        }
    }
}