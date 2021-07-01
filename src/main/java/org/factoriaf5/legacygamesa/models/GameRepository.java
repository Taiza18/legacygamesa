package org.factoriaf5.legacygamesa.models;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> { }
