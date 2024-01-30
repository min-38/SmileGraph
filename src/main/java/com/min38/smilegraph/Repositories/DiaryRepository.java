package com.min38.smilegraph.Repositories;

import com.min38.smilegraph.Entities.Diary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiaryRepository extends JpaRepository<Diary, Long> {
}
