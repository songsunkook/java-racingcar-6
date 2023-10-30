package view;

import constant.Message;
import dto.CarDto;

import java.util.List;

public class OutputView {
    public void inputCarName() {
        System.out.print(Message.INPUT_CAR_NAMES.getMessage());
    }

    public void inputRoundNumber() {
        System.out.println(Message.INPUT_ROUND_NUMBER);
    }

    public void outputRunResult() {
        System.out.println(Message.OUTPUT_RUN_RESULT);
    }

    public void outputCarPosition(List<CarDto> cars) {
        for (CarDto car : cars) {
            System.out.println(
                    Message.OUTPUT_CAR_POSITION.getMessage(car)
            );
        }
        System.out.println(Message.OUTPUT_NEWLINE);
    }

    public void outputFinalWinner(List<CarDto> cars) {
        System.out.println(Message.OUTPUT_FINAL_WINNER.getMessage(cars));
    }
}