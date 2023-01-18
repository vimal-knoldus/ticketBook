package com.publisis.design.ticketBook.repository;

import com.publisis.design.ticketBook.model.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowRespository extends JpaRepository<Show, Long> {

    List<Show> findByScreenId(Long screenId);
}
