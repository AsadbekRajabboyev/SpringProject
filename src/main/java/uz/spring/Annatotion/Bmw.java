package uz.spring.Annatotion;

import org.springframework.stereotype.Component;

@Component

public class Bmw implements Transport{

    private String color;
    private int price;

    @Override
    public String toString() {
        return "uz.spring.Annatotion.Bmw{" +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
