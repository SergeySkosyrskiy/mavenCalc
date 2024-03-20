package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcService {
    // int num1 = 5;
    //  int num2 = 5;


    public String answerCalculator() {
        return "<h1>Добро пожаловать в калькулятор. <h1>";
    }

    public String answerPlusCalculator(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка!!! Введены не все данные!!!";
        } else {
            return num1 + "+" + num2 + "=" + (num1 + num2);
        }
    }


//    public String answerMinusCalculator(Integer num1, Integer num2) {
//        if (num1 == null || num2 == null || num1 == null && num2 == null) {
//            return "Ошибка!!! Введены не все данные!!!";
//        } else {
//            return num1 + "-" + num2 + "=" + (num1 - num2);
//        }
//    }
//
//
//    public String answerMultiplyCalculator(Integer num1, Integer num2) {
//        if (num1 == null || num2 == null) {
//            return "Ошибка!!! Введены не все данные!!!";
//        } else {
//            return num1 + "*" + num2 + "=" + (num1 * num2);
//        }
//    }
//
//
//    public String answerDividelyCalculator(Integer num1, Integer num2) {
//        if (num1 == null || num2 == null) {
//            return "Ошибка!!! Введены не все данные!!!";
//        } else if (num2 == 0) {
//            return "ОШИБКА!!! на 0 делить нельзя!!!";
//        } else {
//            return num1 + "/" + num2 + "=" + (num1 / num2);
//        }
//    }
}