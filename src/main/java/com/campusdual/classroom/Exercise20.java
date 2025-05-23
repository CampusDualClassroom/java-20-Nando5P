package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;

public class Exercise20 {

    public static List<Person> getPeopleList() {
        List<Person> stringList = new ArrayList<>();
        stringList.add(new Person("John", "Smith"));
        stringList.add(new Teacher("María", "Montessori", "Educación"));
        stringList.add(new PoliceOfficer("Jake", "Peralta", "B-99"));
        stringList.add(new Doctor("Gregory", "House", "Nefrología e infectología"));

        return stringList;
    }

    public static void showPeopleDetails(List<Person> stringList) {
for(Person person : stringList) {
            person.getDetails();
        }
    }

    public static void main(String[] args) {
        List<Person> stringList = getPeopleList();
        showPeopleDetails(stringList);
    }
}
