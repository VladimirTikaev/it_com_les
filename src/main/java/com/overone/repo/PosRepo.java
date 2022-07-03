package com.overone.repo;

import com.overone.model.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PosRepo extends JpaRepository<Position, Long> {


}
