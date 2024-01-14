package io.rizwan.leadscrud.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "leads")
public class Leads {
    @Id
    @Column(name = "lead_id")
    @Digits(integer = 10, fraction = 0, message = "Invalid field type - First Name")
    private int leadId;

    @Column(name = "first_name")
    @Pattern(regexp = "[A-Za-z]+", message = "Invalid field type - First Name")
    private String firstName;

    @Column(name = "middle_name")
    @Pattern(regexp = "[A-Za-z]*", message = "Invalid field type - Middle Name")
    private String middleName;

    @Column(name = "last_name")
    @Pattern(regexp = "[A-Za-z]+", message = "Invalid field type - Last Name")
    private String lastName;

    @Column(name = "mobile_number")
    @Pattern(regexp = "[5-9][0-9]{9}", message = "Invalid field type - Mobile Number")
    private String mobileNumber;

    @Column(name = "gender")
    @Pattern(regexp = "Male|Female|Others", message = "Invalid field type - Gender")
    private String gender;

    @Column(name = "date_of_birth")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")
    @Past
    private Date dateOfBirth;

    @Column(name = "email")
    @Pattern(regexp = "[A-Za-z0-9._%+-]+@[A-Za-z]+\\.[A-Za-z]+", message = "Invalid field type - Email")
    private String email;

    public Leads() {
    }

    public Leads(int leadId, String firstName, String middleName, String lastName, String mobileNumber, String gender, Date dateOfBirth, String email) {
        this.leadId = leadId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    public int getLeadId() {
        return leadId;
    }

    public void setLeadId(int leadId) {
        this.leadId = leadId;
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

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Leads{" +
                "leadId=" + leadId +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mobileNumber=" + mobileNumber +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", email='" + email + '\'' +
                '}';
    }
}
