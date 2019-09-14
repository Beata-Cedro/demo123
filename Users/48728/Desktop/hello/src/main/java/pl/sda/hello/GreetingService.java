package pl.sda.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public final  NameService nameService;

@Autowired
    public GreetingService(NameService nameService) {
        this.nameService = nameService;
    }
    public void sayHallo(){
        System.out.println("Hello " + nameService.getName());
    }
}
