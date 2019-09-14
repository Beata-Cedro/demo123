package com.borychowska.conf;

import com.borychowska.api.IOrder;
import com.borychowska.api.IPizza;
import com.borychowska.implement.ExoticPizza;
import com.borychowska.implement.Order;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public IPizza pizza(){
        return new ExoticPizza(17, "Exotic");
    }

    @Bean (name = "inna")
    public IOrder order(IPizza pizza){
        return new Order(pizza);
    }

}
