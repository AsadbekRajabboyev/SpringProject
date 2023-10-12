package uz.spring.Annatotion;

import org.springframework.stereotype.Component;

@Component
public class Merc implements Transport{
    private String color;
    private int price;


    @Override
    public String toString() {
        return "uz.spring.Car{" +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
