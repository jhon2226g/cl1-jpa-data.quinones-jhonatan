package pe.edu.i202224216.cl1_jpa_data.quinones_jhonatan.repository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pe.edu.i202224216.cl1_jpa_data.quinones_jhonatan.models.Country;
import pe.edu.i202224216.cl1_jpa_data.quinones_jhonatan.models.CountryLanguage;

@Repository
public interface CountryRepository extends CrudRepository<Country, String> {
		
}
