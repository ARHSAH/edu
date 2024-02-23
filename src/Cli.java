import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Cli {
    ArrayList<course> computerScience = new ArrayList<course>();
    ArrayList<course> Physic = new ArrayList<course>();
    ArrayList<course> languageStructure = new ArrayList<course>();
    ArrayList<course> Chemistry = new ArrayList<course>();

    ArrayList<Integer> registeredStudentsNo = new ArrayList<>();
    ArrayList<course> registeredStudentsCourses = new ArrayList<>();

    Scanner scanner;

    public Cli() {
        scanner = new Scanner(System.in);
        generalCourse generalMath1 = new generalCourse("generalMath1"
                , "Mohsen Jamali",
                4128, 200, 4, "Monday",
                10.5, 12.5, "13 January",
                9, 12);
        specializedCourse advancedProgramming = new specializedCourse
                ("advancedProgramming"
                        , "Hossein boomri",
                        3029, 80, 4, "Saturday",
                        13, 15, "15 January",
                        9, 13);
        specializedCourse dataStructure = new specializedCourse
                ("dataStructure"
                        , "Javad miri",
                        5467, 60, 4, "Sunday",
                        8, 10, "21 January",
                        9, 11);
        specializedCourse combination = new specializedCourse
                ("combination"
                        , "Abbas Servati",
                        7345, 50, 3, "Tuesday",
                        15, 17, "18 January",
                        9, 13);
        computerScience.add(generalMath1);
        computerScience.add(advancedProgramming);
        computerScience.add(dataStructure);
        computerScience.add(combination);

        generalCourse physicLab1 = new generalCourse(" physicLab1"
                , "Saman Moghimi",
                1252, 40, 1, "Tuesday",
                15, 17, "11 January",
                9, 10.5);
        specializedCourse quantumTheory = new specializedCourse
                ("quantumTheory"
                        , "Hossein Alikhani",
                        9766, 60, 3, "Saturday",
                        13, 15, "14 January",
                        9, 11);
        specializedCourse physic3 = new specializedCourse
                ("physic3"
                        , "Reza Hassani",
                        9843, 50, 3, "Sunday",
                        8, 10, "10 January",
                        9, 11);
        specializedCourse specialRelativity = new specializedCourse
                ("specialRelativity"
                        , "Kokab Ramezani",
                        2078, 50, 3, "Tuesday",
                        15, 17, "19 January",
                        13, 15);
        Physic.add(physicLab1);
        Physic.add(quantumTheory);
        Physic.add(physic3);
        Physic.add(specialRelativity);

        generalCourse English = new generalCourse("English"
                , "Azzade Asgari",
                1222, 40, 3, "Tuesday",
                13, 15, "11 January",
                13, 14);
        specializedCourse Spanish = new specializedCourse
                ("Spanish"
                        , "Zahra Motaghi",
                        9716, 30, 3, "Wednsday",
                        17, 19, "14 January",
                        14, 15);
        specializedCourse Toefl = new specializedCourse
                ("Toefl"
                        , "Benyamin Karimi",
                        9883, 50, 3, "Sunday",
                        18, 19.5, "10 January",
                        11, 12.5);
        specializedCourse Ielts = new specializedCourse
                ("Ielts"
                        , "Amirali Shafiei",
                        2432, 50, 3, "Tuesday",
                        9, 10.5, "19 January",
                        9, 10.5);

        languageStructure.add(English);
        languageStructure.add(Spanish);
        languageStructure.add(Toefl);
        languageStructure.add(Ielts);

        generalCourse chemistry1 = new generalCourse("chemistry1"
                , "Milad Derakhshan",
                1452, 150, 3, "Tuesday",
                13, 14.5, "7 January",
                13, 14);
        specializedCourse chemistryLab = new specializedCourse
                ("chemistryLab"
                        , "Mohammad Jafari",
                        8888, 30, 4, "Wednsday",
                        16, 18, "16 January",
                        8, 10);
        specializedCourse organicChemistry = new specializedCourse
                ("organicChemistry"
                        , "Arman Ramezani",
                        6578, 50, 3, "Sunday",
                        18, 19.5, "15 January",
                        10, 11.5);

        Chemistry.add(chemistry1);
        Chemistry.add(chemistryLab);
        Chemistry.add(organicChemistry);


    }

    public void welcome() {
        System.out.println("welcome to edu how do you want to enter? :");
        System.out.println("1.admin");
        System.out.println("2.student");
        String welcome1 = scanner.next();
        if (welcome1.equals("1")) {
            adminChoose();
        }
        if (welcome1.equals("2")) {
            getStudentId();
        }
    }



    public void adminChoose() {
        System.out.println("choose which faculty :");
        System.out.println("1.computerScience " + "2.Physic " + "3.languageStructure " + "4.Chemistry" +
                " 5.back");
        String faculty = scanner.next();
        if (faculty.equals("1") || faculty.equals("computerScience")) {
            printingInfo(computerScience);
            adminAddOrDetails(computerScience);
        } else if (faculty.equals("2") || faculty.equals("Physic")) {
            printingInfo(Physic);
            adminAddOrDetails(Physic);
        } else if (faculty.equals("3") || faculty.equals("languageStructure")) {
            printingInfo(languageStructure);
            adminAddOrDetails(languageStructure);
        } else if (faculty.equals("4") || faculty.equals("Chemistry") ) {
            printingInfo(Chemistry);
            adminAddOrDetails(Chemistry);

        } else if (faculty.equals("5") || faculty.equals("back")) {
            welcome();
        } else {
            System.out.println("Sorry there is no such course ");
            adminChoose();
        }
    }

    public void adminAddOrDetails(ArrayList<course> faculty) {
        System.out.println("1.Add course ");
        System.out.println("2.Select course to review details ");
        System.out.println("3.back");
        String addOrReview = scanner.next();

        if (addOrReview.equals("add") || addOrReview.equals("1")) {
            System.out.print("courseName : ");
            String courseName = scanner.next();
            System.out.print("masterName : ");
            String masterName = scanner.next();
            System.out.print("code : ");
            int code = scanner.nextInt();
            System.out.print("capacity : ");
            int capacity = scanner.nextInt();
            System.out.print("unit : ");
            int unit = scanner.nextInt();
            System.out.print("classDay : ");
            String classDay = scanner.next();
            System.out.print("classStart : ");
            double classStart = scanner.nextDouble();
            System.out.print("classFinish : ");
            double classFinish = scanner.nextDouble();
            System.out.print("examDay : ");
            String examDay = scanner.next();
            System.out.print("examStart : ");
            double examStart = scanner.nextDouble();
            System.out.print("examFinish : ");
            double examFinish = scanner.nextDouble();
            System.out.print("general : ");
            boolean general = scanner.nextBoolean();
            if (general) {
                generalCourse course = new generalCourse(
                        courseName
                        , masterName,
                        code, capacity, unit, classDay,
                        classStart, classFinish, examDay,
                        examStart, examFinish);
                faculty.add(course);
            } else {
                specializedCourse course = new specializedCourse(
                        courseName
                        , masterName,
                        code, capacity, unit, classDay,
                        classStart, classFinish, examDay,
                        examStart, examFinish);
                faculty.add(course);
            }
            System.out.println("Ok successfully added now what you wanna do ?");
            System.out.print("1.finish  " + "2.back");
            String option1 = scanner.next();
            if (option1.equals("1")) {
                welcome();
            }
            if (option1.equals("2")) {
                adminAddOrDetails(faculty);
            }
        }
    }

    public void adminReviewDetails(ArrayList<course> faculty) {
        System.out.println("which course do you want to select : ");
        for (int i = 0; i < faculty.size(); i++) {
            System.out.print(faculty.get(i).courseName + " ");
        }
        System.out.println();

    }


    //student

    public void getStudentId() {
        System.out.println("Please enter your id : ");
        String id = scanner.next();
        if(id.equals("back")){
            welcome();
        }else{
            int a = 0;
            for(int i = 0 ; i < id.length() ; i++){
                a = (a * 10) + ((int)id.charAt(i) - '0');
            }
            studentChoose(a);
        }

    }

    public void studentChoose(int studentId){
        System.out.println("welcome " + studentId + " please choose in below options :");
        System.out.println("1.registered courses list ");
        System.out.println("2.presented courses");
        System.out.println("3.back");
        String regOrPer = scanner.next();

        if(regOrPer.equals("1")){
        }

        if(regOrPer.equals("2")){
            presentedCourses(studentId);
        }
        if (regOrPer.equals("3")){
            getStudentId();
        }
    }

    public void presentedCourses(int studentId){
        System.out.println("choose which faculty :");
        System.out.println("1.computerScience " + "2.Physic " + "3.languageStructure " + "4.Chemistry " +"5.back");
        String faculty = scanner.next();
        if (faculty.equals("computerScience") || faculty.equals("1")) {
            printingInfo(computerScience);
            studentRegister(computerScience, studentId);

        } else if (faculty.equals("Physic") || faculty.equals("2")) {
            printingInfo(Physic);
            studentRegister(Physic, studentId);

        } else if (faculty.equals("languageStructure") || faculty.equals("3")) {
            printingInfo(languageStructure);
            studentRegister(languageStructure, studentId);

        } else if (faculty.equals("Chemistry") || faculty.equals("4")) {
            printingInfo(Chemistry);
            studentRegister(Chemistry, studentId);

        } else if (faculty.equals("back") || faculty.equals("5")) {
            studentChoose(studentId);
        } else {
            System.out.println("Sorry there is no such course ");
        }
    }

    public void studentRegister(ArrayList<course> faculty, int studentId){
        int unitsNumber = 0, generalNo = 0 , i1 = 0;
        ArrayList<course> helper1 = new ArrayList<>();
        System.out.println("Enter code of course you want to take :");
        String courseCodeOrBack = scanner.next();
        int courseCode = 0;
        for(int i = 0 ; i < courseCodeOrBack.length() ; i++){
            courseCode = (courseCode * 10) + ((int)courseCodeOrBack.charAt(i) - '0');
        }

        if(courseCodeOrBack.equals("back")){
            presentedCourses(studentId);
        }

        for(int i = 0 ; i < faculty.size() ; i++){
            if(courseCode == faculty.get(i).code){
                i1 = i;
                break ;
            }
            if(i == faculty.size() - 1){
                System.out.println("Sorry there is no such course please try again");
                studentRegister(faculty, studentId);
            }
        }
        for(int i = 0 ; i < registeredStudentsNo.size() ; i++){
            if(registeredStudentsNo.get(i) == studentId){
                helper1.add(registeredStudentsCourses.get(i));
                unitsNumber += registeredStudentsCourses.get(i).unit;
                if(registeredStudentsCourses.get(i) instanceof generalCourse){
                    generalNo += registeredStudentsCourses.get(i).unit;
                }
            }
        }

        if(faculty.get(i1).capacity == 0){
            System.out.println("Sorry course completely full");
            studentRegister(faculty, studentId);
        }

        if(unitsNumber + faculty.get(i1).unit > 20){
            System.out.println("Sorry your units numbers exceed out of 20");
            studentRegister(faculty, studentId);
        }
        if(faculty.get(i1) instanceof generalCourse) {
            if (generalNo + faculty.get(i1).unit > 5) {
                System.out.println("Sorry your generalUnits numbers exceed out of 5");
                studentRegister(faculty, studentId);
            }
        }
        for(int i = 0 ; i < registeredStudentsNo.size() ; i++){
            if(faculty.get(i1).classDay.equals(registeredStudentsCourses.get(i).classDay) &&
                    checkOverlap(faculty.get(i1).classStart, faculty.get(i1).classFinish
            , registeredStudentsCourses.get(i).classStart,
                    registeredStudentsCourses.get(i).classFinish)){
                System.out.println("Sorry this course has interference " +
                        "with your other courses");
                studentRegister(faculty, studentId);
            }
            if(faculty.get(i1).examDay.equals(registeredStudentsCourses.get(i).classDay) &&
                    checkOverlap(faculty.get(i1).examStart, faculty.get(i1).examFinish
                    , registeredStudentsCourses.get(i).examStart,
                    registeredStudentsCourses.get(i).examFinish)){
                System.out.println("Sorry this exam has interference " +
                        "with your other courses");
                studentRegister(faculty, studentId);
            }
        }
        registeredStudentsNo.add(studentId);
        registeredStudentsCourses.add(faculty.get(i1));
        faculty.get(i1).capacity --;
        faculty.get(i1).registered ++;
        System.out.println("Ok successfully added to your courses now what you wanna do ?");
        System.out.println("1.finish  " + "2.back");
        String option1 = scanner.next();
        if (option1.equals("1")) {
            welcome();
        }
        if (option1.equals("2")) {
            studentRegister(faculty, studentId);
        }

    }

    public void printingInfo(ArrayList<course> faculty ){
        for (int i = 0; i < faculty.size(); i++) {
            System.out.print("code : " + faculty.get(i).code + " /");
            System.out.print("unit : " + faculty.get(i).unit + " /");
            System.out.print("courseName : " + faculty.get(i).courseName + " /");
            System.out.print("capacity :" + faculty.get(i).capacity + " /");
            System.out.print("registered : " + faculty.get(i).registered + " /");
            System.out.print("master : " + faculty.get(i).masterName + " /");
            System.out.print("exam : " +
                    faculty.get(i).examDay + " " +
                    faculty.get(i).examStart + " to " +
                    faculty.get(i).examFinish + " /");
            System.out.print("Weekly Schedule : " +
                    faculty.get(i).classDay + " " +
                    faculty.get(i).classStart + " to " +
                    faculty.get(i).classFinish + " ");
            if(faculty.get(i) instanceof generalCourse) {
                System.out.println("general : " + "true");
            }else{
                System.out.println("general : " + "false");
            }
            System.out.println();


        }
    }

    public boolean checkOverlap(double x1, double y1, double x2, double y2){
        if((x1 >= x2 && x1 < y2) || (y1 > x2 && y1 <= y2)){
            return true;
        }
        return false;
    }

}

