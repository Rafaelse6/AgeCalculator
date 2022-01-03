package agecalculator;

import java.time.LocalDate;
import java.time.Month;
import java.time.*;
import java.time.Period;

public class AgeCalculator {

    public static void main(String[] args) {
       
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(2001, 12, 5);
        int years = Period.between(birthDate, today).getYears();
        
        System.out.println(today);
        System.out.println(birthDate);
        System.out.println(years);
    }
    
}
