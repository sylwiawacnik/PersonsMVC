package pl.sylwia.persons.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pl.sylwia.persons.domain.ListHistory;

@Repository
public class PersonHistoryDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void save(ListHistory listHistory){
		sessionFactory.getCurrentSession().saveOrUpdate(listHistory);
	}
	
	public void refresh(ListHistory listHistory){
		sessionFactory.getCurrentSession().refresh(listHistory);
	}
	
	public void delete(ListHistory listHistory){
		sessionFactory.getCurrentSession().delete(listHistory);
	}
	
	public List<ListHistory> getAllHistory(){
		return sessionFactory.getCurrentSession().createCriteria(ListHistory.class).list();
	}
	
	public void deleteId(long id){
		Object deleteId = sessionFactory.getCurrentSession().get(ListHistory.class, id);
		sessionFactory.getCurrentSession().delete(deleteId);
	}
	
	public ListHistory getHistoryList(long id){
		return (ListHistory) sessionFactory.getCurrentSession().get(ListHistory.class, id);
		
	}
	
}
