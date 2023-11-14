package com.ssafy.seniornaver.mz.repository;

import com.ssafy.seniornaver.mz.entity.Dictionary;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DictionaryRepository extends JpaRepository<Dictionary, Long> {
    Optional<Dictionary> findByWordId(Long wordId);
    Optional<Dictionary> findByWord(String word);
    List<Dictionary> findAllByWordContaining(String word, Pageable pageable);
    List<Dictionary> findAllByWordContaining(String word);
    boolean existsByWord(String word);
}
