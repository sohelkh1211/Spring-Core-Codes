package com.sohel.springcore.autowiring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Profile {
    @Value("B.E")
    private String qualification;

    @Value("IT")
    private String department;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Profile(String qualification, String department) {
        super();
        this.qualification = qualification;
        this.department = department;
    }

    public Profile() {
        super();
    }

    @Override
    public String toString() {
        return "Profile [qualification=" + qualification + ", department=" + department + "]";
    }

}
