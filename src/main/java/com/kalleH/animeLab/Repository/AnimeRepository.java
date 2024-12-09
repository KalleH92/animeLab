package com.kalleH.animeLab.Repository;

import com.kalleH.animeLab.model.Anime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimeRepository extends
        JpaRepository<Anime, Long> {
    List<Anime> findByName (String name);
}
