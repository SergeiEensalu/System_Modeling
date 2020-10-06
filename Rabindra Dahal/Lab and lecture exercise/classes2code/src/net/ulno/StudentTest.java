package net.ulno;

import org.junit.Test;
//import org.fulib.FulibTools;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    void testKarliTakesMath(){
        University sru = new University();
        Student karli = new Student().withName("Karli").withUniversity(sru);
        LectureHall audimax = new LectureHall();
        Course math = new Course().withName("Math").withLectureHall(audimax);
        math.addStudent(karli);

//        FulibTools.objectDiagrams().dumpSVG("tmp/test1.svg",math);


    }

}