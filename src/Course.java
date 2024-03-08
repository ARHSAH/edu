public class Course {
    String code, courseName, masterName, examDay ;
    String[] classDay;
    int  capacity, unit , registered = 0;
    double classStart, classFinish, examStart, examFinish ;

    public Course(String courseName, String masterName, String code,
                  int capacity, int unit, String[] classDay,
                  double classStart, double classFinish,
                  String examDay, double examStart , double examFinish) {
        this.courseName = courseName;
        this.masterName = masterName;
        this.code = code;
        this.capacity = capacity;
        this.unit = unit;
        this.classStart = classStart;
        this.classFinish = classFinish;
        this.examStart = examStart;
        this.examFinish = examFinish;
        this.classDay = classDay;
        this.examDay = examDay;

    }
}
