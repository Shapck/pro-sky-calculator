package proskycalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalclutaorService calclutaorService;

    public CalculatorController(CalclutaorService calclutaorService) {
        this.calclutaorService = calclutaorService;
    }

    @GetMapping
    public String hello() {
        return calclutaorService.hello();
    }

    @GetMapping(path = "/calculator")
    public String answerWelcome(){
        return calclutaorService.answerWelcomee();
    }

    @GetMapping(path = "/calculator/plus")
    public String numPlus(@RequestParam(required = false,name = "num1") Integer num1, @RequestParam(required = false, name = "num2") Integer num2) {
        return calclutaorService.numPlus(num1, num2);
    }

    @GetMapping(path = "/calculator/minus")
    public String numMinus(@RequestParam(required = false,name = "num1") Integer num1, @RequestParam(required = false,name = "num2") Integer num2) {
        return calclutaorService.numMinus(num1, num2);
    }

    @GetMapping(path = "/calculator/divide")
    public String numDivide(@RequestParam(required = false,name = "num1") Double num1, @RequestParam(required = false,name = "num2") Double num2) {
        return calclutaorService.numDivide(num1, num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String numMultiply(@RequestParam(required = false,name = "num1") Integer num1, @RequestParam(required = false,name = "num2") Integer num2) {
        return calclutaorService.numMultiply(num1, num2);
    }
}
