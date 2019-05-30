package rocks.zipcode.io.quiz3.collections.student;

import org.junit.Test;
import rocks.zipcode.io.quiz3.collections.Lab;
import rocks.zipcode.io.quiz3.collections.Student;
import rocks.zipcode.io.quiz3.collections.LabStatus;

/**
 * @author leon on 10/12/2018.
 */
public class SetLabStatusOfUnforkedLab {
    @Test(expected = UnsupportedOperationException.class)
    public void testCompleted() {
        // given
        String labName = "duplicate deleter";
        Lab lab = new Lab(labName);
        Student student = new Student();
        LabStatus expected = LabStatus.valueOf("COMPLETED");

        // when : setting the lab status of an unforked-lab results in UnsupportedOperationException
        student.setLabStatus(labName, expected);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testPending() {
        // given
        String labName = "duplicate deleter";
        Lab lab = new Lab(labName);
        Student student = new Student();
        LabStatus expected = LabStatus.valueOf("PENDING");

        // when : setting the lab status of an unforked-lab results in UnsupportedOperationException
        student.setLabStatus(labName, expected);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testIncomplete() {
        // given
        String labName = "duplicate deleter";
        Lab lab = new Lab(labName);

        Student student = new Student();
        LabStatus expected = LabStatus.valueOf("INCOMPLETE");

        // when : setting the lab status of an unforked-lab results in UnsupportedOperationException
        student.setLabStatus(labName, expected);
    }
}
