package uz.spring.Annatotion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:car.properties")
public class CarShop {
    @Autowired
    @Qualifier("bmw")
    private Transport transport;
    @Value("${car.name}")
    private String name;
    @Value("${car.price}")

    private int price;

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public CarShop() {
    }

    public void getInfo(){
        System.out.println("Mashinalar");
    }
}
