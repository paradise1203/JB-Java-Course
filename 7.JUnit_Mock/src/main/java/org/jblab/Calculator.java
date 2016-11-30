package org.jblab;

/**
 * Created by aleksandrpliskin on 29.11.16.
 */
public class Calculator {

    private BrainCalculator brainCalculator;

    public Calculator(BrainCalculator brainCalculator) {
        this.brainCalculator = brainCalculator;
    }

    public double sum(double n1, double n2) {
        return n1 + n2;
    }

    public double sub(double n1, double n2) {
        return n1 - n2;
    }

    public double mult(double n1, double n2) {
        return n1 * n2;
    }

    public double div(double n1, double n2) {
        return n1 / n2;
    }

    public double sSum(double n1, double... args) {
        double result = n1;
        for (double arg : args) {
            result += arg;
        }
        return result;
    }

    public double sin(double n) {
        return brainCalculator.sin(n);
    }

    public double cos(double n) {
        return brainCalculator.cos(n);
    }

    public void method() {
        boolean flag = true;
        while (flag) {
            System.out.println("infinity loop");
            flag = false;
        }
    }

}
