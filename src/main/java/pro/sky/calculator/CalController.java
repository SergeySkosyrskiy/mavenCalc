package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class CalController  {
   private final CalcService calcService = new CalcService();


    @GetMapping(path = "/calculator")
    public String answerCalculator() {
        return calcService.answerCalculator();
    }

    @GetMapping(path = "/calculator/plus")
    public String answerPlusCalculator(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
            return calcService.answerPlusCalculator(num1,num2);
    }


//    @GetMapping(path = "/calculator/minus")
//    public String answerMinusCalculator(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
//        if (num1 == null || num2 == null || num1 == null && num2 == null) {
//            return "Ошибка!!! Введены не все данные!!!";
//        } else {
//            return num1 + "-" + num2 + "=" + (num1 - num2);
//        }
//    }
//
//
//    @GetMapping(path = "/calculator/multiply")
//    public String answerMultiplyCalculator(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
//        if (num1 == null || num2 == null || num1 == null && num2 == null) {
//            return "Ошибка!!! Введены не все данные!!!";
//        } else {
//            return num1 + "*" + num2 + "=" + (num1 * num2);
//        }
//    }
//
//
//    @GetMapping(path = "/calculator/divide")
//    public String answerDividelyCalculator(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
//        if (num1 == null || num2 == null || num1 == null && num2 == null) {
//            return "Ошибка!!! Введены не все данные!!!";
//        } else if (num2 == 0) {
//            return "ОШИБКА!!! на 0 делить нельзя!!!";
//        } else {
//            return num1 + "/" + num2 + "=" + (num1 / num2);
//        }
//    }
}
