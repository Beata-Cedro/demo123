package pl.cedro.videoapplistadoskasowania.api;

import org.springframework.web.bind.annotation.*;
import pl.cedro.videoapplistadoskasowania.dao.entity.VideoCassette;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/bb")
public class VideoCassetteApi {

    List<VideoCassette> cassettes;

    public VideoCassetteApi() {
        this.cassettes = new ArrayList<>();
        cassettes.add(new VideoCassette(1L, "Klan", LocalDate.of(2000,1,1)));
        cassettes.add(new VideoCassette(2L, "Złoptopolscy", LocalDate.of(1990,2,2)));
    }

    @GetMapping("/all")
    public List<VideoCassette> getAll(){
        return cassettes;
    }

    @GetMapping
    public VideoCassette getById(@RequestParam int index){
        Optional<VideoCassette> first = cassettes.stream()
                .filter(element -> element.getId() == index)
                .findFirst();
        return first.get();
    }

    @PostMapping
    public boolean addVideo(@RequestBody VideoCassette videoCassette){
        return cassettes.add(videoCassette);
    }

    @PutMapping
    public boolean updateVideo(@RequestBody VideoCassette videoCassette){
        return cassettes.add(videoCassette);
    }

    @DeleteMapping
    public boolean deleteVideo (@RequestParam int index){
        return cassettes.removeIf(e->e.getId()==index);
    }


}
