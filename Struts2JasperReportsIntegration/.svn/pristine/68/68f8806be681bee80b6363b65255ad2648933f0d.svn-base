package action;

import java.util.ArrayList;
import java.util.List;



import model.Person;
import model.Phone;

import com.opensymphony.xwork2.ActionSupport;

public class JasperAction extends ActionSupport {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public String execute() throws Exception {
        System.out.println("jasper action is called");
        return SUCCESS;
    }
    List<Person> beanCollection=new ArrayList<Person>();

    public List<Person> getBeanCollection() {
        System.out.println("get beancollection is called");

        Phone phone1 = new Phone("home", "913-906-9000");
        Phone phone2 = new Phone("work", "913-906-9001");
        Phone phone3 = new Phone("mobile", "(913-906-9002");

        ArrayList<Phone> phones = new ArrayList<Phone>();

        phones.add(phone1);
        phones.add(phone2);
        phones.add(phone3);
        //Create Person

        Person person = new Person("Bruce", "Phillips", phones);

        ArrayList<Person> people = new ArrayList<Person>();

        people.add(person);

        phone1 = new Phone("home", "913-907-6000");
        phone2 = new Phone("work", "913-907-6001");
        phone3 = new Phone("mobile", "(913-907-6002");

        phones = new ArrayList<Phone>();

        phones.add(phone1);
        phones.add(phone2);
        phones.add(phone3);
        //Create Person

        person = new Person("Tom", "Jackson", phones);

        people.add(person);

        phone1 = new Phone("home", "913-908-6000");
        phone2 = new Phone("work", "913-908-6001");
        phone3 = new Phone("mobile", "(913-908-6002");

        phones = new ArrayList<Phone>();

        phones.add(phone1);
        phones.add(phone2);
        phones.add(phone3);
        //Create Person

        person = new Person("Sue", "Smith", phones);
        people.add(person);
        System.out.println("in jasperaction  " +people.size());

        return people;
    }

    public void setBeanCollection(List<Person> beanCollection) {
        this.beanCollection = beanCollection;
    }
}
