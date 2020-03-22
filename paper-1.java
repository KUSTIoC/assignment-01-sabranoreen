public class paper
{
        private String paperTitle;
	private int    paperIdNumber;
	private String courseCode;
	private String courseIncharge;
	private int semester;
	private String program;
	private String typeOfExam;   
	private String invigilatorName;
	private String locationOfPaper;
	private int    numberOfStudents;
	private boolean isCollected;
        private date   dateOfPaper;
	private time   timeOfPaper;

    public paper(String paperTitle, int paperIdNumber, String courseCode, String courseIncharge, int semester, String program, String typeOfExam, String invigilatorName, String locationOfPaper, int numberOfStudents, boolean isCollected, date dateOfPaper, time timeOfPaper) {
        this.paperTitle = paperTitle;
        this.paperIdNumber = paperIdNumber;
        this.courseCode = courseCode;
        this.courseIncharge = courseIncharge;
        this.semester = semester;
        this.program = program;
        this.typeOfExam = typeOfExam;
        this.invigilatorName = invigilatorName;
        this.locationOfPaper = locationOfPaper;
        this.numberOfStudents = numberOfStudents;
        this.isCollected = isCollected;
        this.dateOfPaper = dateOfPaper;
        this.timeOfPaper = timeOfPaper;
    }

    public String getPaperTitle() {
        return paperTitle;
    }

    public int getPaperIdNumber() {
        return paperIdNumber;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseIncharge() {
        return courseIncharge;
    }

    public int getSemester() {
        return semester;
    }

    public String getProgram() {
        return program;
    }

    public String getInvigilatorName() {
        return invigilatorName;
    }

    public String getLocationOfPaper() {
        return locationOfPaper;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setIsCollected(boolean isCollected) {
        this.isCollected = isCollected;
    }
    
    public boolean isIsCollected() {
        return isCollected;
    }

    @Override
    public String toString() {
        return "\n\nPaper" + "\nPaper Title = " + paperTitle + "\npaper  IdNumber = " + paperIdNumber + "\nCourseCode = " + courseCode + "\nCourse Incharge = " + courseIncharge + "\nSemester = " + semester + "\nProgram = " + program + "\nType Of Exam = " + typeOfExam + "\nInvigilator Name = " + invigilatorName + "\nlocation Of Paper = " + locationOfPaper + "\nNumber Of Students = " + numberOfStudents + "\n Collected = " + isCollected + "\nDateOfPaper = " + dateOfPaper + "\nTime Of Paper = " + timeOfPaper ;
    }
   
}