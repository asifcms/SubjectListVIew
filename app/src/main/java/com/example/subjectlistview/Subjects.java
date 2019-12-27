package com.example.subjectlistview;

public class Subjects
{
    private String Subjects;
    private String Division;

    public Subjects(String Subjects, String Division) {
        this.Subjects = Subjects;
        this.Division = Division;
    }

    public String getSubjects() {
        return Subjects;
    }

    public void setSubjects(String subjects) {
        Subjects = subjects;
    }

    public String getDivision() {
        return Division;
    }

    public void setDivision(String division) {
        Division = division;
    }
}
