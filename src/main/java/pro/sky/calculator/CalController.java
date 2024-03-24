package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class CalController {
    private final CalcService calcService;

    public CalController(CalcService calcService) {
        this.calcService = calcService;
    }

    @GetMapping(path = "/calculator")
    public String answerCalculator() {
        return "<h1>Добро пожаловать в калькулятор. <h1>";
    }


    @GetMapping(path = "/calculator/plus")
    public String answerPlusCalculator(@RequestParam Integer num1, @RequestParam Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка!!! Введены не все данные!!!";
        } else {
            int result = calcService.sum(num1, num2);
            return num1 + "+" + num2 + "=" + (num1 + num2);
        }
    }

    @GetMapping(path = "/calculator/minus")
    public String answerMinusCalculator(@RequestParam Integer num1, @RequestParam Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка!!! Введены не все данные!!!";
        } else {
            int result = calcService.subtract(num1, num2);
            return num1 + "-" + num2 + "=" + (num1 - num2);
        }
    }


    @GetMapping(path = "/calculator/multiply")
    public String answerMultiplyCalculator(@RequestParam Integer num1, @RequestParam Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка!!! Введены не все данные!!!";
        } else {
            int result = calcService.multiply(num1, num2);
            return num1 + "*" + num2 + "=" + (num1 * num2);
        }
    }


    @GetMapping(path = "/calculator/divide")
    public String answerDividelyCalculator(@RequestParam Integer num1, @RequestParam Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка!!! Введены не все данные!!!";
        } else if (num2 == 0) {
            return "ОШИБКА!!! на 0 делить нельзя!!!";
        } else {
            int result = calcService.divide(num1, num2);
            return num1 + "/" + num2 + "=" + (num1 / num2);
        }
    }
}
