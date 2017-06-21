package interfaces;

import java.util.List;

public interface IQueriesDao {

	public void create(Object o);

	public void delete(Integer cod, Object o);

	public List<Object> findAll(Object o);

	public Object findById(Integer cod, Object o);

}
