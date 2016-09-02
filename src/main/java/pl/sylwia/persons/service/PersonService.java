package pl.sylwia.persons.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.stereotype.Service;

import pl.sylwia.persons.dao.PersonHistoryDao;
import pl.sylwia.persons.domain.Form;
import pl.sylwia.persons.domain.ListHistory;

@Service
public class PersonService {

	@Autowired
	private PersonHistoryDao personHistoryDao;

	public void saveListPersons(Form form) {
		ListHistory listHistory= new ListHistory();
		
		saveListHistoryElements(form, listHistory);
		
	}
	public List<ListHistory> showHistory(){
		return personHistoryDao.getAllHistory();
	}

	public void deleteRecord(long id){
		personHistoryDao.deleteId(id);
	}
	
	public ListHistory getHistory(long id){
		return personHistoryDao.getHistoryList(id);
	}
	
	public void editRecord(Form form){
		ListHistory history = getHistory(Long.valueOf(form.getId()));
		
		saveListHistoryElements(form, history);
	}
	private void saveListHistoryElements(Form form, ListHistory history) {
		history.setName(form.getName());
		history.setLastName(form.getLastName());
		history.setEmail(form.getEmail());
		history.setPhone(form.getPhone());
		history.setStreet(form.getStreet());
		history.setNrHouse(form.getNrHouse());
		history.setNrApartment(form.getNrApartment());
		history.setZipCode(form.getZipCode());
		history.setCity(form.getCity());
		
		personHistoryDao.save(history);
	}
}
