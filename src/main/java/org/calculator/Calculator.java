package org.calculator;

import java.util.Scanner;

import org.calculator.constants.DialogConstants;
import org.calculator.constants.OperationConstants;
import org.calculator.input_validation.InputValidation;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(DialogConstants.inputFirstNum);
        final double firstNum = InputValidation.readDoubleValue(scanner);
        System.out.print(DialogConstants.inputSecondNum);
        final double secondNum = InputValidation.readDoubleValue(scanner);
        System.out.print(DialogConstants.inputOperation);
        final String operation = InputValidation.readOperationValue(scanner);
        System.out.print(performACalculatorOperation(firstNum, secondNum, operation));

    }
    public static double performACalculatorOperation (double firstNum, double secondNum, String operation) {
        try {
            return switch (operation) {
                case OperationConstants.addition -> firstNum + secondNum;
                case OperationConstants.division -> firstNum / secondNum;
                case OperationConstants.multiplication -> firstNum * secondNum;
                case OperationConstants.subtraction -> firstNum - secondNum;
                default -> throw new IllegalStateException("Unexpected value: " + operation);
            };
        } catch (IllegalStateException e) {
            System.out.println("Ошибка в вычислениях");
        }
        return -1;
    }
}
