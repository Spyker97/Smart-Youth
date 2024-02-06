package com.smartdev.repository;

import com.smartdev.entities.Alarme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlarmeRepo extends JpaRepository<Alarme , Integer> {

}
