package persistence;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import interfaces.IQueriesDao;

public class QueriesDao implements IQueriesDao {

	Transaction transaction;
	Session session;
	Query query;
	Criteria criteria;

	@Override
	public void create(Object o) {

		session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.beginTransaction();
		session.save(o);
		transaction.commit();
		session.close();

	}

	@Override
	public void delete(Integer cod,Object o ) {

		session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.beginTransaction();
		session.delete(findById(cod,o));
		transaction.commit();
		session.close();

	}

	@Override
	public List<Object> findAll(Object o) {
		List<Object> lista = new ArrayList<>();
		session = HibernateUtil.getSessionFactory().openSession();
		lista = session.createCriteria("from" + o).list();
		session.close();
		return lista;
	}

	@Override
	public Object findById(Integer cod, Object o) {

		session = HibernateUtil.getSessionFactory().openSession();
		o = (Object) session.get(Object.class, cod);
		session.close();
		return o;
	}

}
