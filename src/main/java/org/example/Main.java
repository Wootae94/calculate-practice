package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("띄어쓰기로 구분된 operand operator operand 형식을 지켜주세요.");
            System.out.println("올바른 입력 혹은 exit 입력시, 종료됩니다.");
            System.out.print("수식 : ");
            String inputStr = input.nextLine();
            if (inputStr.equals("exit")){
                System.out.println("프로그램이 종료됩니다.");
                break;
            }
            String[] tokens = inputStr.split("\\s+");
            if (tokens.length != 3) { // 토큰 개수가 3개가 아닌 경우
                System.out.println("잘못된 입력입니다. 정확한 형식으로 입력해주세요.");
                continue; // 다시 입력 받음
            }

            try {
                double operand1 = Double.parseDouble(tokens[0]);
                String operator = tokens[1];
                double operand2 = Double.parseDouble(tokens[2]);

                double result = Calculator.calculate(operand1, operator, operand2);
                System.out.println("결과: " + result);
                break; // 계산이 성공적으로 완료되었으므로 루프 종료
            } catch (NumberFormatException e) { // 숫자로 변환할 수 없는 경우
                System.out.println("숫자를 올바르게 입력해주세요.");
            } catch (IllegalArgumentException e) { // 연산자가 올바르지 않은 경우
                System.out.println(e.getMessage());
            }
        }
    }
}
