package com.github.mm.citiesapi.states.repositories;

import com.github.mm.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
