package com.github.mm.citiesapi.countries.repositories;

import com.github.mm.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContryRepository extends JpaRepository<Country, Long> {
}
