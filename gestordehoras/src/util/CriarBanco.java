package util;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class CriarBanco {

	
	public static void main(String[] args) {
		
		Configuration configuration = new AnnotationConfiguration();
		configuration.configure("config/mysql_hibernate.cfg.xml");
		SchemaExport se =  new SchemaExport(configuration);
		se.create(true, true);
		
		
	}
	
}
