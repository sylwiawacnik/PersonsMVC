package pl.sylwia.persons.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.NumberFormat;

@Entity
public class ListHistory {

	@Id
	@GeneratedValue
	private long id;
	@Column(name="Imie")
	private String name;
	@Column(name="Nazwisko")
	private String lastName;
	@Column(name="E_mail")
	private String email;
	@Column(name="Telefon")
	private String phone;
	@Column(name="Ulica_Osiedle")
	private String street;
	@Column(name="Nr_domu")
	private Integer nrHouse;
	@Column(name="Nr_mieszkania")
	private Integer nrApartment;
	@Column(name="Kod_pocztowy")
	private String zipCode;
	@Column(name="Miasto")
	private String city;
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Integer getNrHouse() {
		return nrHouse;
	}

	public void setNrHouse(Integer nrHouse) {
		this.nrHouse = nrHouse;
	}

	public Integer getNrApartment() {
		return nrApartment;
	}

	public void setNrApartment(Integer nrApartment) {
		this.nrApartment = nrApartment;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
