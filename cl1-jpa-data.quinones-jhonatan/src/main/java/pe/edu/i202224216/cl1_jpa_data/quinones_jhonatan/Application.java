package pe.edu.i202224216.cl1_jpa_data.quinones_jhonatan;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pe.edu.i202224216.cl1_jpa_data.quinones_jhonatan.models.Country;
import pe.edu.i202224216.cl1_jpa_data.quinones_jhonatan.repository.CountryRepository;

@SpringBootApplication
public class Application implements CommandLineRunner{
	
	@Autowired
	private CountryRepository countryRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Optional<Country> optional = countryRepository.findById("ARG");
		
		optional.ifPresentOrElse(
				(country)-> {
					country.getLanguages().forEach(lang-> System.out.println(lang.getLanguage().getLanguage()));
				},
				()-> {
					Optional<Country> optional2 = countryRepository.findById("PER");
					optional2.ifPresent(country -> {
						country.getLanguages().forEach(lang -> System.out.println(lang.getLanguage().getLanguage()));
					});
				}
				);		
//		List<String> lista = Arrays.asList("COL","ARG");
//		lista.stream().filter(countryRepository::existsById).collect(Collectors.toList());
//		countryRepository.deleteAllById(lista);
	}

}
