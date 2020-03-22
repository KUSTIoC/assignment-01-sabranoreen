public class course
{
    private static String course_Name;
    private String program_Name;
    private int course_Code;
    private String course_Offered;

    public course(String program_Name, int course_Code, String course_Offered) {
        this.program_Name = program_Name;
        this.course_Code = course_Code;
        this.course_Offered = course_Offered;
        
    }

    public static String getCourse_Name() {
        return course_Name;
    }

    public String getProgram_Name() {
        return program_Name;
    }

    public int getCourse_Code() {
        return course_Code;
    }

    public String getCourse_Offered() {
        return course_Offered;
    }

    public void setCourse_Code(int course_Code) {
        this.course_Code = course_Code;
    }

    @Override
    public String toString() {
        return "\nCourse" + "\nProgram Name = " + program_Name + "\nCourse  Code = " + course_Code + "\nCourse Offered = " + course_Offered ;
    }
    
    
    
    
    
    
}