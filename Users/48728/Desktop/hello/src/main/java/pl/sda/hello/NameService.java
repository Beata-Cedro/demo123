package pl.sda.hello;

import org.springframework.stereotype.Service;

@Service
public class NameService {
    public String getName(){
        return "Kamil";
    }
}
