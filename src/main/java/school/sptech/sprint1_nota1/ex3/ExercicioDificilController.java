package school.sptech.sprint1_nota1.ex3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioDificilController {

    @GetMapping("/ex-03/{n}")
    public ExercicioDificilResponse exercicioDificil(@PathVariable int n) {

        if (n <= 0) {
            return new ExercicioDificilResponse(0, 0);
        }

        int enesimo = fibonacci(n);
        int soma = somaFibonacci(n);

        return new ExercicioDificilResponse(enesimo, soma);
    }

    private int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


    private int somaFibonacci(int n) {
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += fibonacci(i);
        }
        return soma;
    }
}
