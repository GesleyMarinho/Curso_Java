package PacotesAulas_Interfaces.Default_methods.Services;

import java.security.InvalidParameterException;

public interface InterestService {

    double getInterestRate(); // recebe o valor do juros para a calculo;

    default double payment(double amount, int months) {
        if (months < 1 || months > 12) {
            throw new InvalidParameterException("Meses é menor que  0 ou maior que 12, e não pode.");
        }
        return amount * Math.pow(1.0 + getInterestRate() / 100.0, months); // retorna o valor do juros composto pela quantidade de meses;
    }
}

