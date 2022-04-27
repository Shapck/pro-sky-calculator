package proskycalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalclutaorService {

    public String hello() {
        return "Привет";
    }

    public String answerWelcome() {
        return "Добро пожаловать  в калькулятор";
    }

    public String numPlus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Вы не ввели число";
        } else {
            int result = num1 + num2;
            return num1 + "+" + num2 + "=" + result;
        }
    }

    public String numMinus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Вы не ввели число";
        } else {
            int result = num1 - num2;
            return num1 + "-" + num2 + "=" + result;
        }
    }

    public String numMultiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Вы не ввели число";
        } else {
            int result = num1 * num2;
            return num1 + "*" + num2 + "=" + result;
        }
    }

    public String numDivide(Double num1, Double num2) {
        if (num1 == null || num2 == null) {
            return "Вы не ввели число";
        }
        else if (num1 == 0 || num2 == 0) {
            return "На ноль делить нельзя";
        }
        else{
            double result = num1 / num2;
            return num1 + "/" + num2 + "=" + result;
        }

    }
}
