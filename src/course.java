public class course {
    String courseName, masterName, classDay, examDay ;
    int code, capacity, unit , registered = 0 ;
    double classStart, classFinish, examStart, examFinish ;
    boolean pog ;

    public course(String courseName, String masterName, int code,
                  int capacity, int unit, String classDay,
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
