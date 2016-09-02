package pl.sylwia.persons.domain;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.NumberFormat;

public class Form {

	private String id;

	@NotBlank
	@NotEmpty
	@NotNull
	private String name;
	@NotBlank
	@NotEmpty
	@NotNull
	private String lastName;
	@NotBlank
	@NotEmpty
	@NotNull
	@Email
	private String email;
	@NumberFormat
	private String phone;
	@NotBlank
	@NotEmpty
	@NotNull
	private String street;
	@NumberFormat
	private Integer nrHouse;
	@NumberFormat
	private Integer nrApartment;
	@NotBlank
	@NotEmpty
	@NotNull
	private String zipCode;
	@NotBlank
	@NotEmpty
	@NotNull
	private String city;

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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
