package se.fourth;

public class Student {

    private String name;
    private double[] numbers = new double[5];

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getNumbers() {
        return numbers;
    }

    public void setNumbers(double[] numbers) {
        this.numbers = numbers;
    }

    public double sum() {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }

    public double average() {
        return sum() / numbers.length;
    }

    public double max() {
        double max = numbers[0];
        for (double number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public double min() {
        double min = numbers[0];
        for (double number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public boolean isPassed() {
        for (double number : numbers) {
            if (number < 10) {
                return false;
            }
        }
        return true;
    }
}
