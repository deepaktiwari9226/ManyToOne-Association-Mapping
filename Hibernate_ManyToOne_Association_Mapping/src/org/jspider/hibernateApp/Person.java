package org.jspider.hibernateApp;
import javax.persistence.*;
@Entity
@Table(name="Person_Details")
public class Person  // PARENT CLASS//
{   
	@Id
	@GeneratedValue
   private int person_id;
   private String person_name;
public int getPerson_id() {
	return person_id;
}
public void setPerson_id(int person_id) {
	this.person_id = person_id;
}
public String getPerson_name() {
	return person_name;
}
public void setPerson_name(String person_name) {
	this.person_name = person_name;
}
}
