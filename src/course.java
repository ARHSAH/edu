public class course {
    String courseName, masterName ;
    int code, capacity, unit ;
    float classStart, classFinish, examStart, examFinish ;
    boolean pog ;

    public course(String courseName, String masterName, int code,
                  int capacity, int unit, float classStart, float classFinish,
                  float examStart , float examFinish, boolean pog) {
        this.courseName = courseName ;
        this.masterName = masterName ;
        this.code = code ;
        this.capacity = capacity ;
        this.unit = unit ;
        this.classStart = classStart ;
        this.classFinish = classFinish ;
        this.examStart = examStart ;
        this.examFinish = examFinish ;
        this.pog = pog ;

    }
}
