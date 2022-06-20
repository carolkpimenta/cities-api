package com.github.carolkpimenta.citiesapi.countries.repository;

import com.github.carolkpimenta.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
