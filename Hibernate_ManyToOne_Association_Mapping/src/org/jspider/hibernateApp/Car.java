package org.jspider.hibernateApp;
import javax.persistence.*;
@Entity
@Table(name="Car_Details")
public class Car // CHILD CLASS //
{
	@Id
	@GeneratedValue
   private int car_id;
   private String car_name;
   private String car_model;
   @ManyToOne (cascade=CascadeType.ALL)
   private Person person;
public int getCar_id() {
	return car_id;
}
public void setCar_id(int car_id) {
	this.car_id = car_id;
}
public String getCar_name() {
	return car_name;
}
public void setCar_name(String car_name) {
	this.car_name = car_name;
}
public String getCar_model() {
	return car_model;
}
public void setCar_model(String car_model) {
	this.car_model = car_model;
}
public Person getPerson() {
	return person;
}
public void setPerson(Person person) {
	this.person = person;
}
}
