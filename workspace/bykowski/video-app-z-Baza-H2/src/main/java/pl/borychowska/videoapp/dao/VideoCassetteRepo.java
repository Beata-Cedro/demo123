package pl.borychowska.videoapp.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.borychowska.videoapp.VideoCassette;

@Repository
public interface VideoCassetteRepo extends CrudRepository <VideoCassette, Long>{
}
