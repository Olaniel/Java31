package by.epam.unit02.main;

//Вычислить значение выражения по формуле (все переменные принимают действительные значения): 𝑠𝑖𝑛𝑥+𝑐𝑜𝑠𝑦𝑐𝑜𝑠𝑥−𝑠𝑖𝑛𝑦∗𝑡𝑔 𝑥𝑦

public class Task05 {

    public static void main(String[] args) {

        double x = 4;
        double y = 5;
        double result;

        result = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);


        System.out.println(result);

    }

}
