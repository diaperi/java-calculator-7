package calculator.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public String getInput() {
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        return Console.readLine();
    }

    public void showResult(int result) {
        System.out.println("결과: " + result);
    }

    public void showError(String errorMessage) {
        System.out.println("에러: " + errorMessage);
    }
}
