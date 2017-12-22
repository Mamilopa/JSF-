
package student;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedProperty;
import javax.inject.Inject;

@Named(value = "studentBean")//annotation for NamedBean
@RequestScoped
public class StudentBean {

    
    private String firstName;
    private String lastName;
    private int age;
    private String location;
    
    @Inject
    @ManagedProperty(value="#{subject}")
    private Subject subject;
    
    @Inject
private NavigationController nav;
    
    public NavigationController getNavigationController(){
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
