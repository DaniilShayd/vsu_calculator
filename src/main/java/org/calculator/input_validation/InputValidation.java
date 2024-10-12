package org.calculator.input_validation;
import org.calculator.constants.DialogConstants;
import org.calculator.constants.OperationConstants;

import java.util.Scanner;


public class InputValidation {
    public static double readDoubleValue(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.print(DialogConstants.inputNumbException);
            scanner.next();
        }
        return scanner.nextDouble();
    }

    public static String readOperationValue(Scanner scanner) {
        String value;
        while (true) {
            value = scanner.next();
            switch (value) {
                case OperationConstants.division,
                        OperationConstants.subtraction,
                        OperationConstants.multiplication,
                        OperationConstants.addition: return value;
                default: System.out.println(DialogConstants.inputCalcOperationException);
            }
        }
    }
    
}
