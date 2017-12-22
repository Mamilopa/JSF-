package student;

import dao.studentDao;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import model.Student;

@Named(value = "studentBean")//annotation for NamedBean
@RequestScoped
public class StudentBean {

    private String firstName;
    private String lastName;
    private int age;
    private String location;

    @Inject
    private Subject subject;

    @Inject
    private NavigationController nav;

    @Inject
    private studentDao sdao;

    public String addStudent() {
        Student student1 = new Student(firstName, lastName, age, location,
                subject.getSubject1(), subject.getSubject2(), subject.getSubject3(), subject.getSubject4());
        sdao.addStudent(student1);
        return nav.navigate();

    }

    public NavigationController getNavigationController() {
        return nav;
    }

    public StudentBean(NavigationController navigationController) {
        this.nav = navigationController;
    }

    public StudentBean() {//default constructor

    }

    public StudentBean(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
