/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mwillard
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Employees {
    List<Person> persons;
    
    public Employees() {
        this.persons = new ArrayList<>();
    }
    
    public void add(Person personToAdd) {
        persons.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd) {
        for (Person p : peopleToAdd) {
            persons.add(p);
        }
        
    }
    
    public void print() {
        Iterator<Person> iterator = persons.iterator();
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    public void print(Education education) {
        Iterator<Person> iterator = persons.iterator();
        
        //iterator.forEachRemaining(person)
        
        while (iterator.hasNext()) {
            Person p = iterator.next();
            
            if (p.getEducation() == education) {
                System.out.println(p);
            }
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> iterator = persons.iterator();
        
        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
