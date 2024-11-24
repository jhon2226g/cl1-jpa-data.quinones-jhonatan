package pe.edu.i202224216.cl1_jpa_data.quinones_jhonatan.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "countrylanguage")
public class CountryLanguage {
	@Embeddable
    @Getter
    @Setter
    public static class CountryLanguageId implements Serializable {
        private String countryCode;
        private String language;

        public CountryLanguageId() {}

        public CountryLanguageId(String countryCode, String language) {
            this.countryCode = countryCode;
            this.language = language;
        }
    }
	
	@EmbeddedId
    private CountryLanguageId language;
	
    @MapsId("countryCode")
	@ManyToOne
	@JoinColumn(name = "CountryCode")
	private Country country;
	@Column(name = "IsOfficial")
	private String is_official;
	@Column(name = "Percentage")
	private String percentage;
}
