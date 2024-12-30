package magazine_sys.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name",nullable = false,length = 50)
    private String firstName;

    @Column(name = "middle_name",nullable = false,length = 50)
    private String middleName;

    @Column(name = "last_name",nullable = false,length = 50)
    private String lastName;

    @ManyToOne
    @JoinColumn(name = "position_id")
    private Position position;

    @Column(name = "telephone_number",nullable = false,unique = true,length = 10)
    private String telephoneNumber;

    @OneToMany(mappedBy = "employee")
    private List<Sale> sales;

    public Employee() {
    }

    public List<Sale> getSales() {
        return sales;
    }

    public void setSales(List<Sale> sales) {
        this.sales = sales;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
}