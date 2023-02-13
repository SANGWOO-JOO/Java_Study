package Calcurator;

import java.util.Scanner;

public class Baseball {
    /*
    기본적으로 1부터 9까지 서로 다른 수로 이루어진 3자리의 수를 맞추는 게임이다.

    같은 수가 같은 자리에 있으면 스트라이크, 다른 자리에 있으면 볼, 같은 수가 전혀 없으면 포볼 또는 낫싱이란 힌트를 얻고, 그 힌트를 이용해서 먼저 상대방(컴퓨터)의 수를 맞추면 승리한다.
    e.g. 상대방(컴퓨터)의 수가 425일 때, 123을 제시한 경우 : 1스트라이크, 456을 제시한 경우 : 1볼 1스트라이크, 789를 제시한 경우 : 낫싱
    위 숫자 야구 게임에서 상대방의 역할을 컴퓨터가 한다. 컴퓨터는 1에서 9까지 서로 다른 임의의 수 3개를 선택한다. 게 임 플레이어는 컴퓨터가 생각하고 있는 3개의 숫자를 입력하고, 컴퓨터는 입력한 숫자에 대한 결과를 출력한다.
    이 같은 과정을 반복해 컴퓨터가 선택한 3개의 숫자를 모두 맞히면 게임이 종료된다.
    게임을 종료한 후 게임을 다시 시작하거나 완전히 종료할 수 있다.
     */
    private String answer;
    protected int ball = 0;
    protected int strike = 0;

    public Baseball(String answer) throws Exception {
        if (!validateLength(answer))
            throw new Exception("적어도 3자리 이상의 길이를 입력해 주십시오.");

        this.answer = answer;
    }

    private boolean validateLength(String answer) {
        return answer != null && answer.length() >= 3;
    }

    public boolean strike(String input) throws Exception {
        if (answer.length() != input.length())
            throw new Exception("입력한 값의 길이와 정답의 길이가 다릅니다.");

        resetStatus();

        if (answer.equals(input)) {
            strike = answer.length();
            return true;
        }

        calc(input);

        return false;
    }

    private void resetStatus() {
        ball = 0;
        strike = 0;
    }

    public void calc(String input) {
        for(int i=0; i<input.length(); i++) {
            calcStrikeAndBall(input.charAt(i), i);
        }
    }

    private void calcStrikeAndBall(char input, int index) {
        if(calcStrike(input, index)) {
            strike++;
            return;
        }

        if(calcBall(input, index)) {
            ball++;
            return;
        }
    }

    private boolean calcStrike(char input, int index) {
        return equals(input, answer.charAt(index));
    }

    private boolean equals(char c1, int c2) {
        return c1 == c2;
    }

    private boolean calcBall(char input, int index) {
        return Stream.of(remains(index).split(""))
                .map(s -> s.charAt(0))
                .filter(c -> c == input)
                .count() > 0;
    }

    private String remains(int index) {
        return answer.substring(0, index) + answer.substring(index + 1);
    }

    public String getStatus() {
        StringBuilder sb = new StringBuilder();

        if(ball == answer.length())
            return "포볼";

        if(strike == answer.length())
            return String.format("%d개의 숫자를 모두 맞히셨습니다! 게임 종료", strike);

        if(ball > 0)
            sb.append(ball + "볼 ");

        if(strike > 0)
            sb.append(strike + "스트라이크");

        if(sb.length() <= 0)
            return "낫싱";

        return sb.toString();
    }

}

