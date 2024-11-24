package pe.edu.i202224216.cl1_jpa_data.quinones_jhonatan.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "country")
public class Country {
	@Id
	@Column(name = "Code")
	private String code;
	@Column(name = "Name")
	private String name;
	@Column(name = "Continent")
	private String continent;
	@Column(name = "Region")
	private String region;
	@Column(name = "SurfaceArea")
	private float surface_area;
	@Column(name = "IndepYear")
	private Integer indep_year;
	@Column(name = "Population")
	private Integer population;
	@Column(name = "LifeExpectancy")
	private float life_expectancy;
	@Column(name = "GNP")
	private float gnp;
	@Column(name = "GNPOld")
	private float gnpo_id;
	@Column(name = "LocalName")
	private String localname;
	@Column(name = "GovernmentForm")
	private String governamentForm;
	@Column(name = "HeadOfState")
	private String head_of_state;
	@Column(name = "Capital")
	private Integer capital;
	@Column(name = "Code2")
	private String code2;
	
	@OneToMany(mappedBy = "country" , cascade = CascadeType.ALL , orphanRemoval = true)
	private List<City> ciies;
	
	@OneToMany(mappedBy = "country" , cascade = CascadeType.ALL, fetch = FetchType.EAGER,  orphanRemoval = true )
	private List<CountryLanguage> languages;
		
}
