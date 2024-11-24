package pe.edu.i202224216.cl1_jpa_data.quinones_jhonatan.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "city")
public class City {
	@Id
	@Column(name = "ID")
	private Long id;
	@Column(name = "Name")
	private String name;
	@ManyToOne
	@JoinColumn(name = "CountryCode")
	private Country country;
	@Column(name = "District")
	private String district;
	@Column(name = "Population")
	private int population;
}
