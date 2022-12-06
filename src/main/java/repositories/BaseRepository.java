package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface BaseRepository <E,ID extends Serializable> extends JpaRepository<E,ID> {
}
