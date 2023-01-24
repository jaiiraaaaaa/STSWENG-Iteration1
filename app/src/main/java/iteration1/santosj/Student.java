package iteration1.santosj;

import java.util.*;
class Student {

    private final int studentNumber;
    private final Collection<Section> sections = new HashSet<>();

    /** 
     * CONSTRUCTOR
    */
    Student (int studentNumber, Collection<Section> sections) {
        if (studentNumber < 0) {
            throw new IllegalArgumentException("studentNumber should be non-negative, was: " 
                                                + studentNumber);
        }

        if (sections == null) {
            throw new NullPointerException("sections should not be null");
        }
        this.studentNumber = studentNumber;
        this.sections.addAll(sections);

        //Remove any nulls
        this.sections.removeIf(Objects::isNull);
    }

    /** 
     * ENLIST STUDENT TO A SECTION
    */

    void enlist (Section section) {
        if (section == null) {
            throw new NullPointerException("section should not be null");
        }

        // Cannot enlist in a section already previously enlisted in
        // No need for the "if" condition anymore since we sections type arraylist was changed to hashset
        /*if (sections.contains(section))
            throw new RuntimeException();*/

        this.sections.add(section);
    }

    /**
     * OVERRIDDEN METHODS
     */
    @Override
    public String toString() {
        return "Student# " + studentNumber;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;
        return studentNumber = o.studentNumber;
    }

    @Override
    public int hashCode() {
        return this.studentNumber;
    }
}
