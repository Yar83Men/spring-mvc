package spring;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2, max = 20, message = "Name length 2 to 20")
    private String name;
    @NotEmpty(message = "Not empty")
    @NotBlank(message = "Not empty")
    private String surname;
    @Min(value = 1000, message = " > 1000")
    private int salary;
    private String department;
    private String carBrand;
    private Map<String, String> carBrands;
    private Map<String, String> departments;
    private String[] lang;

    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "XXX-XX-XX")
    private String phoneNumber;

    @CheckEmail
    private String email;


    private Map<String, String> langs;

    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "Information technology");
        departments.put("HR", "Human Resources");
        departments.put("Sales", "Sales");
        carBrands = new HashMap<>();
        carBrands.put("BMW", "BMW");
        carBrands.put("Audi", "Audi");
        carBrands.put("VW", "VW");
        langs = new HashMap<>();
        langs.put("Eng", "Eng");
        langs.put("Rus", "Rus");
        langs.put("Ua", "Ua");
        langs.put("De", "De");
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Map<String, String> getLangs() {
        return langs;
    }

    public void setLangs(Map<String, String> langs) {
        this.langs = langs;
    }

    public String[] getLang() {
        return lang;
    }

    public void setLang(String[] lang) {
        this.lang = lang;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
