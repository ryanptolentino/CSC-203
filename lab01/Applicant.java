import java.util.List;


public class Applicant {
    private final String name;
    private final List<CourseGrade> grades;
    private boolean referrals;

    public Applicant(final String name, final List<CourseGrade> grades){
        this.name = name;
        this.grades = grades;
    }

    //overloading
    public Applicant(final String name, final List<CourseGrade> grades, boolean referrals){
        this.name = name;
        this.grades = grades;
        this.referrals = referrals;
    }

    // returns applicant's name
    public String getName(){
        return name;
    }

    // returns applicant's list of scores
    public List<CourseGrade> getGrades(){
        return grades;
    }

    // returns applicant's resume
    public boolean getReferrals(){
        return referrals;
    }

    // returns course grade that was asked for (object)
    public CourseGrade getGradeFor(String course){
        for (int i = 0; i < grades.size(); i++ ){
            if (grades.get(i).getCourseName().equals(course)){
                return grades.get(i);
            }
        }
        return null;
    }
}
