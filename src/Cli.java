import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cli {
    ArrayList<Course> computerScience = new ArrayList<Course>();
    ArrayList<Course> Physic = new ArrayList<Course>();
    ArrayList<Course> languageStructure = new ArrayList<Course>();
    ArrayList<Course> Chemistry = new ArrayList<Course>();
    ArrayList<HashMap<String, Integer>> singedInStudents = new ArrayList<>();

    ArrayList<Integer> registeredStudentsNo = new ArrayList<>();
    ArrayList<Course> registeredStudentsCourses = new ArrayList<>();

    Scanner scanner;

    public Cli() {
        scanner = new Scanner(System.in);
        String[] d1 = new String[2];
        d1[0] = "Saturday";
        d1[1] = "Monday";
        GeneralCourse generalMath1 = new GeneralCourse("generalMath1"
                , "Mohsen Jamali",
                "4128", 200, 4, d1,
                10.5, 12.5, "13 January",
                9, 12);

        SpecializedCourse advancedProgramming = new SpecializedCourse
                ("advancedProgramming"
                        , "Hossein boomri",
                        "3029", 80, 4, d1,
                        13, 15, "15 January",
                        9, 13);
        String[] d2 = new String[2];
        d2[0] = "Sunday";
        d2[1] = "Tuesday";
        SpecializedCourse dataStructure = new SpecializedCourse
                ("dataStructure"
                        , "Javad miri",
                        "5467", 60, 4, d2,
                        8, 10, "21 January",
                        9, 11);
        SpecializedCourse combination = new SpecializedCourse
                ("combination"
                        , "Abbas Servati",
                        "7345", 50, 3, d2,
                        15, 17, "18 January",
                        9, 13);
        computerScience.add(generalMath1);
        computerScience.add(advancedProgramming);
        computerScience.add(dataStructure);
        computerScience.add(combination);

        String[] d3 = new String[1];
        d3[0] = "Tuesday";
        GeneralCourse physicLab1 = new GeneralCourse(" physicLab1"
                , "Saman Moghimi",
                "1252", 40, 1,d3 ,
                15, 17, "11 January",
                9, 10.5);
        SpecializedCourse quantumTheory = new SpecializedCourse
                ("quantumTheory"
                        , "Hossein Alikhani",
                        "9766", 60, 3, d1,
                        13, 15, "14 January",
                        9, 11);
        SpecializedCourse physic3 = new SpecializedCourse
                ("physic3"
                        , "Reza Hassani",
                        "9843", 50, 3, d3,
                        8, 10, "10 January",
                        9, 11);
        SpecializedCourse specialRelativity = new SpecializedCourse
                ("specialRelativity"
                        , "Kokab Ramezani",
                        "2078", 50, 3, d3,
                        15, 17, "19 January",
                        13, 15);
        Physic.add(physicLab1);
        Physic.add(quantumTheory);
        Physic.add(physic3);
        Physic.add(specialRelativity);

        GeneralCourse English = new GeneralCourse("English"
                , "Azzade Asgari",
                "1222", 40, 3, d3,
                13, 15, "11 January",
                13, 14);

        String[] d4 = new String[2];
        d4[0] = "Monday";
        d4[1] = "Wednesday";
        SpecializedCourse Spanish = new SpecializedCourse
                ("Spanish"
                        , "Zahra Motaghi",
                        "9716", 30, 3, d4,
                        17, 19, "14 January",
                        14, 15);
        SpecializedCourse Toefl = new SpecializedCourse
                ("Toefl"
                        , "Benyamin Karimi",
                        "9883", 50, 3, d2,
                        18, 19.5, "10 January",
                        11, 12.5);
        SpecializedCourse Ielts = new SpecializedCourse
                ("Ielts"
                        , "Amirali Shafiei",
                        "2432", 50, 3, d2,
                        9, 10.5, "19 January",
                        9, 10.5);

        languageStructure.add(English);
        languageStructure.add(Spanish);
        languageStructure.add(Toefl);
        languageStructure.add(Ielts);

        GeneralCourse chemistry1 = new GeneralCourse("chemistry1"
                , "Milad Derakhshan",
                "1452", 150, 3, d2,
                13, 14.5, "7 January",
                13, 14);
        SpecializedCourse chemistryLab = new SpecializedCourse
                ("chemistryLab"
                        , "Mohammad Jafari",
                        "8888", 30, 4, d4,
                        16, 18, "16 January",
                        8, 10);
        SpecializedCourse organicChemistry = new SpecializedCourse
                ("organicChemistry"
                        , "Arman Ramezani",
                        "6578", 50, 3, d2,
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
            adminPassword();
        }
        if (welcome1.equals("2")) {
            signInUp();
        }
    }

    public void adminPassword(){
        System.out.println("Enter admin's password :");
        String a = scanner.next();
        if(a.equals("back")){
            welcome();
        }else if (a.equals("admin")){
            adminChoose();
        }else{
            System.out.println("Sorry invalid password please try again");
            adminPassword();
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
            adminPassword();
        } else {
            System.out.println("Sorry there is no such course ");
            adminChoose();
        }
    }

    public void adminAddOrDetails(ArrayList<Course> faculty) {
        System.out.println("1.Add course ");
        System.out.println("2.remove course");
        System.out.println("3.Select course to review details ");
        System.out.println("4.increase capacity");
        System.out.println("5.back");
        System.out.println("6.welcome menu");
        String addOrReview = scanner.next();

        if(addOrReview.equals("6") || addOrReview.equals("welcome menu")){
            welcome();
        }

        if(addOrReview.equals("5") || addOrReview.equals("back")){
            adminChoose();
        }

        if (addOrReview.equals("add") || addOrReview.equals("1")) {
            adminAdd(faculty);
        }

        if (addOrReview.equals("Select course to review details") || addOrReview.equals("3")) {
            adminReviewDetails(faculty);
        }

        if(addOrReview.equals("4")){
            adminIncreaseCapacity(faculty);
        }

        if(addOrReview.equals("2")){
            adminRemoveCourse(faculty);
        }
    }


    public void adminAdd(ArrayList<Course> faculty){
        String[] days;
        System.out.print("courseName : ");
        String courseName = scanner.next();
        System.out.print("masterName : ");
        String masterName = scanner.next();
        System.out.print("code : ");
        String code = scanner.next();
        System.out.print("capacity : ");
        int capacity = scanner.nextInt();
        System.out.print("unit : ");
        int unit = scanner.nextInt();
        if(unit < 3) {
            days = new String[1];
            System.out.print("classDay : ");
            String classDay = scanner.next();
            days[0] = classDay;
        }else{
            days = new String[2];
            System.out.print("classDay1 : ");
            String classDay1 = scanner.next();
            System.out.print("classDay2 : ");
            String classDay2 = scanner.next();
            days[0] = classDay1;
            days[1] = classDay2;
        }
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
            GeneralCourse course = new GeneralCourse(
                    courseName
                    , masterName,
                    code, capacity, unit, days,
                    classStart, classFinish, examDay,
                    examStart, examFinish);
            faculty.add(course);
        } else {
            SpecializedCourse course = new SpecializedCourse(
                    courseName
                    , masterName,
                    code, capacity, unit, days,
                    classStart, classFinish, examDay,
                    examStart, examFinish);
            faculty.add(course);
        }
        System.out.println("Ok successfully added now what you wanna do ?");
        System.out.print("1.Add another course " + "2.back " + "3.welcome menu");
        String option1 = scanner.next();
        if (option1.equals("1")) {
            adminAdd(faculty);
        }
        if (option1.equals("2")) {
            adminAddOrDetails(faculty);
        }
        if (option1.equals("3")) {
            welcome();
        }
    }

    public void adminRemoveCourse(ArrayList<Course> faculty){
        System.out.println("Please enter course code you want to remove :");
        String courseCodeOrBack = scanner.next();
        int i1 = 0, i2 = 0;

        if(courseCodeOrBack.equals("back")){
            adminAddOrDetails(faculty);
            return;
        }

        for(int i = 0 ; i < faculty.size() ; i++){
            if(courseCodeOrBack.equals(faculty.get(i).code)){
                i1 = i;
                break ;
            }
            if(i == faculty.size() - 1){
                System.out.println("Sorry there is no such course please try again");
                adminRemoveCourse(faculty);
                return;
            }
        }

        for(int i = 0 ; i < registeredStudentsNo.size() ; i++){
            if(registeredStudentsCourses.get(i) == faculty.get(i1)){
                registeredStudentsNo.remove(i);
                registeredStudentsCourses.remove(i);
            }
        }
        faculty.remove(i1);
        System.out.println("Ok course successfully removed now what you wanna do ? :");
        System.out.println("1.back 2.welcome menu");
        String option = scanner.next();
        if(option.equals("1")){
            adminRemoveCourse(faculty);
        }
        if(option.equals("2")){
            welcome();
        }
    }


    public void adminIncreaseCapacity(ArrayList<Course> faculty){
        System.out.println("Enter course code you want to increase capacity :");
        int i1 = 0;
        String changeCourseCode = scanner.next();
        if(changeCourseCode.equals("back")){
            adminAddOrDetails(faculty);
        }
        for(int i = 0 ; i < faculty.size() ; i++){
            if(changeCourseCode.equals(faculty.get(i).code)){
                i1 = i;
                break ;
            }
            if(i == faculty.size() - 1){
                System.out.println("Sorry there is no such course please try again");
                adminIncreaseCapacity(faculty);
                return;
            }
        }
        increase(faculty, i1);

    }

    public void increase(ArrayList<Course> faculty, int i1){
        System.out.println("Alright enter new capacity :");
        String increase = scanner.next();
        if(increase.equals("back")){
            adminIncreaseCapacity(faculty);
        }
        int capacity = 0;
        for(int i = 0 ; i < increase.length() ; i++){
            capacity = (capacity * 10) + ((int)increase.charAt(i) - '0');
        }
        if(faculty.get(i1).capacity >= capacity){
            System.out.println("Sorry you can only increase the capacity");
            increase(faculty, i1);
            return;
        }
        faculty.get(i1).capacity = capacity;
        System.out.println("Ok capacity increased successfully");
        System.out.println("now what you wanna do ? :");
        System.out.println("1.back " + "2.welcome menu");
        String option = scanner.next();
        if(option.equals("1")){
            increase(faculty, i1);
            return;
        }if(option.equals("2")){
            welcome();
        }
    }
    public void adminReviewDetails(ArrayList<Course> faculty) {
        System.out.println("Enter course code you want to review and change : ");
        String changeCourseCode = scanner.next();
        if(changeCourseCode.equals("back")){
            adminAddOrDetails(faculty);
            return;
        }
        int i1 = 0;

        for(int i = 0 ; i < faculty.size() ; i++){
            if(changeCourseCode.equals(faculty.get(i).code)){
                i1 = i;
                break;
            }
            if(i == faculty.size() - 1){
                System.out.println("Sorry no such course found please try again");
                adminReviewDetails(faculty);
                return;
            }
        }
        adminReviewOrAdd(faculty, i1);

    }

    public void adminReviewOrAdd(ArrayList<Course> faculty, int i1){
        ArrayList<Integer> helper1 = new ArrayList<>();
        for(int i = 0 ; i < registeredStudentsNo.size() ; i++){
            if(registeredStudentsCourses.get(i).code.equals(faculty.get(i1).code)){
                System.out.println(registeredStudentsNo.get(i));
                helper1.add(registeredStudentsNo.get(i));

            }
        }
        System.out.println("please choose in below options :");
        System.out.println("1.add student");
        System.out.println("2.remove student");
        System.out.println("3.back");
        System.out.println("4.welcome menu");
        String option = scanner.next();
        if(option.equals("1")){
            adminAddStudent(helper1, faculty, i1);
        }else if(option.equals("2")){
            adminRemoveStudent(helper1, faculty, i1);
        }else if(option.equals("3")) {
            adminReviewDetails(faculty);
        }else if(option.equals("4")){
            welcome();
        }else{
            System.out.println("Sorry that's not command");
            adminReviewOrAdd(faculty, i1);
        }
    }

    public void adminAddStudent(ArrayList <Integer> helper,
                                ArrayList<Course> faculty, int i1) {
        System.out.println("Enter student id you want to add : ");
        String idOrBack = scanner.next();
        int studentId = 0;
        if(idOrBack.equals("back")){
            adminReviewOrAdd(faculty, i1);
            return;
        }

        for(int i = 0 ; i < idOrBack.length() ; i++){
            studentId = (studentId * 10) + ((int)idOrBack.charAt(i) - '0');
        }
        for(int i = 0 ; i < helper.size() ; i++){
            if(studentId == helper.get(i)){
                System.out.println("This id has already registered");
                adminAddStudent(helper, faculty, i1);
                return;
            }
        }
        registeredStudentsNo.add(studentId);
        registeredStudentsCourses.add(faculty.get(i1));
        if(faculty.get(i1).capacity > 0) {
            faculty.get(i1).capacity--;
        }
        faculty.get(i1).registered ++;
        System.out.println("Ok student successfully added now what you wanna do ? :");
        System.out.println("1.back " + "2.welcome menu");
        String Sc = scanner.next();
        if(Sc.equals("1")){
            adminAddStudent(helper, faculty, i1);
            return;
        }if(Sc.equals("2")){
            welcome();
        }
    }

    public void adminRemoveStudent(ArrayList <Integer> helper,
                                   ArrayList<Course> faculty, int i1){
        if(helper.isEmpty()){
            System.out.println("No one registered yet !");
            adminReviewOrAdd(faculty, i1);
        }
        System.out.println("Enter student id you want to remove : ");
        String idOrBack = scanner.next();
        int studentId = 0, i2 = 0;
        if(idOrBack.equals("back")){
            adminReviewOrAdd(faculty, i1);
            return;
        }

        for(int i = 0 ; i < idOrBack.length() ; i++){
            studentId = (studentId * 10) + ((int)idOrBack.charAt(i) - '0');
        }
        for(int i = 0 ; i < helper.size() ; i++){
            if(studentId == helper.get(i)){
                break;
            }
            if(i == helper.size() - 1){
                System.out.println("Sorry there is no such id");
                adminRemoveStudent(helper,
                        faculty, i1);
                return;
            }
        }
        for(int i = 0 ; i < registeredStudentsNo.size() ; i++){
            if(registeredStudentsNo.get(i) == studentId
                    && registeredStudentsCourses.get(i) == faculty.get(i1)){
                i2 = i;
            }
        }

        registeredStudentsCourses.get(i2).capacity ++;
        registeredStudentsCourses.get(i2).registered --;
        registeredStudentsCourses.remove(i2);
        registeredStudentsNo.remove(i2);


        System.out.println("Ok student successfully removed now what you wanna do ? :");
        System.out.println("1.back " + "2.welcome menu");
        String Sc = scanner.next();
        if(Sc.equals("1")){
            adminRemoveStudent(helper, faculty, i1);
            return;
        }if(Sc.equals("2")){
            welcome();
        }
    }

    //student

    public void signInUp(){
        System.out.println("1.sign in 2.sign up 3.back");
        String option = scanner.next();
        if(option.equals("1")){
            signInId();
            return;
        }
        if(option.equals("2")){
            signUpId();
            return;
        }
        if(option.equals("3")){
            welcome();
            return;
        }
    }

    public void signInId(){
        if(singedInStudents.isEmpty()) {
            System.out.println("No one signed up yet");
            System.out.println("1.signup 2.back 3.welcome menu");
            String option = scanner.next();

            if (option.equals("1")) {
                signUpId();
            }

            if (option.equals("2")) {
                signInUp();
            }
            if (option.equals("3")) {
                welcome();
            }
            return;
        }
        System.out.println("Please enter your id :");
        String id = scanner.next();
        if(id.equals("back")) {
            signInUp();
        }else{
            int a = 0;
            for(int i = 0 ; i < id.length() ; i++){
                a = (a * 10) + ((int)id.charAt(i) - '0');
            }
            for(int i = 0 ; i < singedInStudents.size() ; i++){
                if(singedInStudents.get(i).get("id") == a){
                    int i1 = i;
                    signInPassword(a, i1);
                    return;
                }
                if(i == singedInStudents.size() - 1){
                    System.out.println("You haven't signed up yet");
                    System.out.println("1.back 2.signup");
                    String option = scanner.next();
                    if(option.equals("1")){
                        signInId();
                        return;
                    }
                    if(option.equals("2")){
                        signUpId();
                        return;
                    }
                }
            }
        }
    }

    public void signInPassword(int id, int i1){
        System.out.println("Please enter your password : ");
        String password1 = scanner.next();
        if(password1.equals("back")){
            signInId();
        }
        int password = 0;
        for(int i = 0 ; i < password1.length() ; i++){
            password = (password * 10) + ((int)password1.charAt(i) - '0');
        }
        if (singedInStudents.get(i1).get("password") == password){
            studentChoose(id);
        }else{
            System.out.println("Wrong password please try again");
            signInPassword(id, i1);
        }
    }

    public void signUpId(){
        System.out.println("please create an id :");
        String id = scanner.next();
        if(id.equals("back")){
            signInUp();
        }else{
            int a = 0;
            for(int i = 0 ; i < id.length() ; i++){
                a = (a * 10) + ((int)id.charAt(i) - '0');
                if((int)id.charAt(i) - '0' > 9){
                    System.out.println("Invalid id");
                    System.out.println("Please try again");
                    signUpId();
                    return;
                }
            }
            for(int i = 0 ; i < singedInStudents.size() ; i++){
                if(singedInStudents.get(i).get("id") == a){
                    System.out.println("You ve already signed up");
                    signUpId();
                    return;
                }
            }
            HashMap<String, Integer> e1 = new HashMap<>();
            e1.put("id", a);
            signUpPassword(e1);
        }
    }

    public void signUpPassword(HashMap<String, Integer> e1){
        System.out.println("Please create password :");
        String password1 = scanner.next();
        if(password1.equals("back")){
            signUpId();
        }
        int password = 0;
        for(int i = 0 ; i < password1.length() ; i++){
            password = (password * 10) + ((int)password1.charAt(i) - '0');
        }
        e1.put("password",password);
        singedInStudents.add(e1);
        System.out.println("Ok successfully signed up");
        signInUp();
    }


    public void studentChoose(int studentId){
        System.out.println("welcome " + studentId + " please choose in below options :");
        System.out.println("1.registered courses list ");
        System.out.println("2.presented courses");
        System.out.println("3.back");
        System.out.println("4.welcome menu");
        String regOrPer = scanner.next();

        if(regOrPer.equals("1")){
            registeredCoursesList(studentId);
        }

        else if(regOrPer.equals("2")){
            presentedCourses(studentId);
        }
        else if (regOrPer.equals("3")){
            signInUp();
        }
        else if(regOrPer.equals("4")){
            welcome();
        }
    }

    public void registeredCoursesList(int studentId){
        ArrayList<Course> helper1 = new ArrayList<>();
        for(int i = 0 ; i < registeredStudentsNo.size() ; i++){
            if(registeredStudentsNo.get(i) == studentId){
                helper1.add(registeredStudentsCourses.get(i));
            }
        }
        printingInfo(helper1);
        if(!helper1.isEmpty()) {
            studentErase(studentId, helper1);
        }else{
            System.out.println("You haven't registered in any course yet");
            studentChoose(studentId);
        }
    }

    public void studentErase(int studentId, ArrayList<Course> helper1){
        System.out.println("Please enter course code you want to erase :");
        String courseCodeOrBack = scanner.next();
        int i1 = 0, i2 = 0;

        if(courseCodeOrBack.equals("back")){
            studentChoose(studentId);
            return;
        }

        for(int i = 0 ; i < helper1.size() ; i++){
            if(courseCodeOrBack.equals(helper1.get(i).code)){
                i1 = i;
                break ;
            }
            if(i == helper1.size() - 1){
                System.out.println("Sorry there is no such course please try again");
                studentErase(studentId, helper1);
                return;
            }
        }

        for(int i = 0 ; i < registeredStudentsNo.size() ; i++){
            if(registeredStudentsNo.get(i) == studentId
                    && registeredStudentsCourses.get(i) == helper1.get(i1)){
                i2 = i;
            }
        }

        registeredStudentsCourses.get(i2).capacity ++;
        registeredStudentsCourses.get(i2).registered --;
        registeredStudentsCourses.remove(i2);
        registeredStudentsNo.remove(i2);
        System.out.println("Ok course successfully erased now what you wanna do ? :");
        System.out.println("1.back 2.welcome menu");
        String option = scanner.next();
        if(option.equals("1")){
            studentErase(studentId, helper1);
        }
        if(option.equals("2")){
            welcome();
        }

    }

    public void presentedCourses(int studentId){
        System.out.println("choose which faculty :");
        System.out.println("1.computerScience " + "2.Physic " + "3.languageStructure " + "4.Chemistry " + "5.back " +"6.welcome menu");
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
        }
        else if(faculty.equals("6")){
            welcome();
        }
        else {
            System.out.println("Sorry there is no such course ");
        }
    }

    public void studentRegister(ArrayList<Course> faculty, int studentId){
        int unitsNumber = 0, generalNo = 0 , i1 = 0;
        ArrayList<Course> helper1 = new ArrayList<>();
        System.out.println("Enter code of course you want to take :");
        String courseCodeOrBack = scanner.next();

        if(courseCodeOrBack.equals("back")){
            presentedCourses(studentId);
            return;
        }

        for(int i = 0 ; i < faculty.size() ; i++){
            if(courseCodeOrBack.equals(faculty.get(i).code)){
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
                if(registeredStudentsCourses.get(i) instanceof GeneralCourse){
                    generalNo += registeredStudentsCourses.get(i).unit;
                }
            }
        }

        for(int i = 0 ; i < registeredStudentsNo.size() ; i++){
            if(registeredStudentsNo.get(i) == studentId){
                if(registeredStudentsCourses.get(i) == faculty.get(i1)){
                    System.out.println("You've already picked this");
                    studentRegister(faculty, studentId);
                    return;
                }
            }
        }


        if(faculty.get(i1).capacity == 0){
            System.out.println("Sorry course completely full");
            studentRegister(faculty, studentId);
            return;
        }

        if(unitsNumber + faculty.get(i1).unit > 20){
            System.out.println("Sorry your units numbers exceed out of 20");
            studentRegister(faculty, studentId);
            return;
        }
        if(faculty.get(i1) instanceof GeneralCourse) {
            if (generalNo + faculty.get(i1).unit > 5) {
                System.out.println("Sorry your generalUnits numbers exceed out of 5");
                studentRegister(faculty, studentId);
                return;
            }
        }
        for(int i = 0 ; i < registeredStudentsNo.size() ; i++){
            for(int i2 = 0 ; i2 < faculty.get(i1).classDay.length ; i2++ ) {
                for(int i3 = 0 ; i3 < registeredStudentsCourses.get(i).classDay.length ; i3++) {
                    if (faculty.get(i1)
                            .classDay[i2].equals(registeredStudentsCourses.get(i).classDay[i3]) &&
                            checkOverlap(faculty.get(i1).classStart, faculty.get(i1).classFinish
                                    , registeredStudentsCourses.get(i).classStart,
                                    registeredStudentsCourses.get(i).classFinish)
                            && registeredStudentsNo.get(i) == studentId) {
                        System.out.println("Sorry this course has interference " +
                                "with your other courses");
                        studentRegister(faculty, studentId);
                        return;
                    }
                }

            }
            if(faculty.get(i1).examDay.equals(registeredStudentsCourses.get(i).examDay) &&
                    checkOverlap(faculty.get(i1).examStart, faculty.get(i1).examFinish
                            , registeredStudentsCourses.get(i).examStart,
                            registeredStudentsCourses.get(i).examFinish)
                    && registeredStudentsNo.get(i) == studentId){
                System.out.println("Sorry this exam has interference " +
                        "with your other courses");
                studentRegister(faculty, studentId);
                return;
            }
        }
        registeredStudentsNo.add(studentId);
        registeredStudentsCourses.add(faculty.get(i1));
        faculty.get(i1).capacity --;
        faculty.get(i1).registered ++;
        System.out.println("Ok successfully added to your courses now what you wanna do ?");
        System.out.println("1.welcome menu  " + "2.back");
        String option1 = scanner.next();
        if (option1.equals("1")) {
            welcome();
        }
        if (option1.equals("2")) {
            studentRegister(faculty, studentId);
        }

    }

    public void printingInfo(ArrayList<Course> faculty ){
        for (int i = 0; i < faculty.size(); i++) {
            System.out.print("code : " + faculty.get(i).code + " /");
            System.out.print("unit : " + faculty.get(i).unit + " /");
            System.out.print("courseName : " + faculty.get(i).courseName + " /");
            System.out.print("capacity :" + faculty.get(i).capacity + " /");
            System.out.print("registered : " + faculty.get(i).registered + " /");
            System.out.print("master : " + faculty.get(i).masterName + " /");
            System.out.print("exam : " +
                    faculty.get(i).examDay + " " +
                    convertDoubleToTime(faculty.get(i).examStart) + " to " +
                    convertDoubleToTime(faculty.get(i).examFinish )+ " /");
            System.out.print("Weekly Schedule : ");
            for(int i1 = 0 ; i1 < faculty.get(i).classDay.length ; i1++){
                System.out.print(faculty.get(i).classDay[i1] + " ");
            }
            System.out.print( convertDoubleToTime(faculty.get(i).classStart) + " to " +
                    convertDoubleToTime(faculty.get(i).classFinish) + " /");
            if(faculty.get(i) instanceof GeneralCourse) {
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

    public String convertDoubleToTime(double a){

        if(a > (int)a){
            return (int)a +":" + "30";
        }else{
            return (int)a +":" + "00";
        }
    }

}

