import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestCases
{
   /*
    * This test is just to get you started.
    */
   @Test
   public void testGetName()
   {
      // This will not compile until you implement the Applicant class
      List<CourseGrade> grades = Arrays.asList(
              new CourseGrade("Intro to CS", 100),
              new CourseGrade("Data Structures", 95),
              new CourseGrade("Algorithms", 91),
              new CourseGrade("Computer Organization", 91),
              new CourseGrade("Operating Systems", 75),
              new CourseGrade("Non-CS", 83)
      );
      Applicant testApplicant = new Applicant("Aakash", grades);
      assertEquals("Aakash", testApplicant.getName());
   }

   @Test
   public void testGetGrades() {
      // This will not compile until you implement the Applicant class
      List<CourseGrade> grades = Arrays.asList(
              new CourseGrade("Intro to CS", 100),
              new CourseGrade("Data Structures", 95),
              new CourseGrade("Algorithms", 91),
              new CourseGrade("Computer Organization", 91),
              new CourseGrade("Operating Systems", 75),
              new CourseGrade("Non-CS", 83)
      );
      Applicant testApplicant = new Applicant("Aakash", grades);
      assertEquals(grades, testApplicant.getGrades());
   }

   @Test
   public void testGetGradeFor() {
      // This will not compile until you implement the Applicant class
      List<CourseGrade> grades = Arrays.asList(
              new CourseGrade("Intro to CS", 100),
              new CourseGrade("Data Structures", 95),
              new CourseGrade("Algorithms", 91),
              new CourseGrade("Computer Organization", 91),
              new CourseGrade("Operating Systems", 75),
              new CourseGrade("Non-CS", 83)
      );
      Applicant testApplicant = new Applicant("Aakash", grades);
      assertEquals(grades.get(1), testApplicant.getGradeFor("Data Structures"));
   }

   @Test
   public void testanalyzeApplicant2() {
      List<CourseGrade> grades = Arrays.asList(
              new CourseGrade("Intro to CS", 100),
              new CourseGrade("Data Structures", 95),
              new CourseGrade("Algorithms", 91),
              new CourseGrade("Computer Organization", 91),
              new CourseGrade("Operating Systems", 75),
              new CourseGrade("Non-CS", 83)
      );
      Applicant testApplicant = new Applicant("Aakash", grades, 18);
      assertEquals(true, SimpleIf.analyzeApplicant2(testApplicant));
   }

   @Test
   public void analyzeApplicant2_age() {
      List<CourseGrade> grades = Arrays.asList(
              new CourseGrade("Intro to CS", 100),
              new CourseGrade("Data Structures", 95),
              new CourseGrade("Algorithms", 91),
              new CourseGrade("Computer Organization", 91),
              new CourseGrade("Operating Systems", 75),
              new CourseGrade("Non-CS", 83)
      );
      Applicant testApplicant = new Applicant("Bob", grades, 17);
      assertEquals(false, SimpleIf.analyzeApplicant2(testApplicant));
   }

   @Test
   public void analyzeApplicant2_2bs() {
      List<CourseGrade> grades = Arrays.asList(
              new CourseGrade("Intro to CS", 100),
              new CourseGrade("Data Structures", 72),
              new CourseGrade("Algorithms", 91),
              new CourseGrade("Computer Organization", 91),
              new CourseGrade("Operating Systems", 75),
              new CourseGrade("Non-CS", 83)
      );
      Applicant testApplicant = new Applicant("Kevin", grades, 19);
      assertEquals(false, SimpleIf.analyzeApplicant2(testApplicant));
   }

   @Test
   public void testanalyzeApplicant2_101() {
      List<CourseGrade> grades = Arrays.asList(
              new CourseGrade("Intro to CS", 89),
              new CourseGrade("Data Structures", 95),
              new CourseGrade("Algorithms", 91),
              new CourseGrade("Computer Organization", 91),
              new CourseGrade("Operating Systems", 100),
              new CourseGrade("Non-CS", 83)
      );
      Applicant testApplicant = new Applicant("Amy", grades, 18);
      assertEquals(false, SimpleIf.analyzeApplicant2(testApplicant));
   }