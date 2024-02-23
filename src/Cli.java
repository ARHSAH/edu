import java.util.ArrayList;
import java.util.Scanner;

public class Cli {
    ArrayList<course> computerScience = new ArrayList<course>();
    ArrayList<course> Physic = new ArrayList<course>();
    ArrayList<course> languageStructure = new ArrayList<course>();
    ArrayList<course> Chemistry = new ArrayList<course>();

    int registerd;
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
        System.out.println("student or admin?");
        String welcome1 = scanner.next();
        if (welcome1.equals("admin")) {
            adminChoose();
        }
    }

    public void adminChoose() {
        System.out.println("choose which faculty :");
        System.out.println("computerScience " + "Physic " + "languageStructure " + "Chemistry");
        String faculty = scanner.next();
        if (faculty.equals("computerScience")) {
            for (int i = 0; i < computerScience.size(); i++) {
                System.out.print("code : " + computerScience.get(i).code + " /");
                System.out.print("unit : " + computerScience.get(i).unit + " /");
                System.out.print("courseName : " + computerScience.get(i).courseName + " /");
                System.out.print("capacity :" + computerScience.get(i).capacity + " /");
                System.out.print("registerd : " + registerd + " /");
                System.out.print("master : " + computerScience.get(i).masterName + " /");
                System.out.print("exam : " +
                        computerScience.get(i).examDay + " " +
                        computerScience.get(i).examStart + " to " +
                        computerScience.get(i).examFinish + " /");
                System.out.print("Weekly Schedule : " +
                        computerScience.get(i).classDay + " " +
                        computerScience.get(i).classStart + " to " +
                        computerScience.get(i).classFinish + " ");
                System.out.println();


            }

            adminAddOrDetails("computerScience");
        } else if (faculty.equals("Physic")) {
            for (int i = 0; i < Physic.size(); i++) {
                System.out.print("code : " + Physic.get(i).code + " /");
                System.out.print("unit : " + Physic.get(i).unit + " /");
                System.out.print("courseName : " + Physic.get(i).courseName + " /");
                System.out.print("capacity :" + Physic.get(i).capacity + " /");
                System.out.print("registerd : " + registerd + " /");
                System.out.print("master : " + Physic.get(i).masterName + " /");
                System.out.print("exam : " +
                        Physic.get(i).examDay + " " +
                        Physic.get(i).examStart + " to " +
                        Physic.get(i).examFinish + " /");
                System.out.print("Weekly Schedule : " +
                        Physic.get(i).classDay + " " +
                        Physic.get(i).classStart + " to " +
                        Physic.get(i).classFinish + " ");
                System.out.println();
            }

            adminAddOrDetails("Physic");
        } else if (faculty.equals("languageStructure")) {
            for (int i = 0; i < languageStructure.size(); i++) {
                System.out.print("code : " + languageStructure.get(i).code + " /");
                System.out.print("unit : " + languageStructure.get(i).unit + " /");
                System.out.print("courseName : " + languageStructure.get(i).courseName + " /");
                System.out.print("capacity :" + languageStructure.get(i).capacity + " /");
                System.out.print("registerd : " + registerd + " /");
                System.out.print("master : " + languageStructure.get(i).masterName + " /");
                System.out.print("exam : " +
                        languageStructure.get(i).examDay + " " +
                        languageStructure.get(i).examStart + " to " +
                        languageStructure.get(i).examFinish + " /");
                System.out.print("Weekly Schedule : " +
                        languageStructure.get(i).classDay + " " +
                        languageStructure.get(i).classStart + " to " +
                        languageStructure.get(i).classFinish + " ");
                System.out.println();


            }

            adminAddOrDetails("languageStructure");
        } else if (faculty.equals("Chemistry")) {
            for (int i = 0; i < Chemistry.size(); i++) {
                System.out.print("code : " + Chemistry.get(i).code + " /");
                System.out.print("unit : " + Chemistry.get(i).unit + " /");
                System.out.print("courseName : " + Chemistry.get(i).courseName + " /");
                System.out.print("capacity :" + Chemistry.get(i).capacity + " /");
                System.out.print("registerd : " + registerd + " /");
                System.out.print("master : " + Chemistry.get(i).masterName + " /");
                System.out.print("exam : " +
                        Chemistry.get(i).examDay + " " +
                        Chemistry.get(i).examStart + " to " +
                        Chemistry.get(i).examFinish + " /");
                System.out.print("Weekly Schedule : " +
                        Chemistry.get(i).classDay + " " +
                        Chemistry.get(i).classStart + " to " +
                        Chemistry.get(i).classFinish + " ");
                System.out.println();


            }

            adminAddOrDetails("Chemistry");

        } else if (faculty.equals("back")) {
            welcome();
        } else {
            System.out.println("Sorry there is no such course ");
            adminChoose();
        }
    }

    public void adminAddOrDetails(String course1) {
        System.out.println("Add course or select course to review details :");
        String addOrReview = scanner.next();

        if (addOrReview.equals("add")) {
            if (course1.equals("computerScience")) {
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
                    computerScience.add(course);
                } else {
                    specializedCourse course = new specializedCourse(
                            courseName
                            , masterName,
                            code, capacity, unit, classDay,
                            classStart, classFinish, examDay,
                            examStart, examFinish);
                    computerScience.add(course);
                }
                System.out.println("Ok successfully added now what you wanna do ?");
                System.out.print("back  " + "start");
                String option1 = scanner.next();
                if (option1.equals("back")) {
                    adminChoose();
                }
                if (option1.equals("start")) {
                    welcome();
                }
            }
            if (course1.equals("Physic")) {
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
                    Physic.add(course);
                } else {
                    specializedCourse course = new specializedCourse(
                            courseName
                            , masterName,
                            code, capacity, unit, classDay,
                            classStart, classFinish, examDay,
                            examStart, examFinish);
                    Physic.add(course);
                }
                System.out.println("Ok successfully added now what you wanna do ?");
                System.out.print("back  " + "start");
                String option1 = scanner.next();
                if (option1.equals("back")) {
                    adminChoose();
                }
                if (option1.equals("start")) {
                    welcome();
                }
            }
            if (course1.equals("languageStructure")) {
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
                    languageStructure.add(course);
                } else {
                    specializedCourse course = new specializedCourse(
                            courseName
                            , masterName,
                            code, capacity, unit, classDay,
                            classStart, classFinish, examDay,
                            examStart, examFinish);
                    languageStructure.add(course);
                }
                System.out.println("Ok successfully added now what you wanna do ?");
                System.out.print("back  " + "start");
                String option1 = scanner.next();
                if (option1.equals("back")) {
                    adminChoose();
                }
                if (option1.equals("start")) {
                    welcome();
                }
            }

            if (course1.equals("Chemistry")) {
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
                    Chemistry.add(course);
                } else {
                    specializedCourse course = new specializedCourse(
                            courseName
                            , masterName,
                            code, capacity, unit, classDay,
                            classStart, classFinish, examDay,
                            examStart, examFinish);
                    Chemistry.add(course);
                }
                System.out.println("Ok successfully added now what you wanna do ?");
                System.out.println("back " + "finish");
                String option1 = scanner.next();
                if (option1.equals("back")) {
                    adminChoose();
                }
                if (option1.equals("finish")) {
                }
            }
        } else if (addOrReview.equals("details")) {
            adminReviewDetails(course1);

        } else if (addOrReview.equals("back")) {
            adminChoose();
        } else {
            System.out.println("Sorry thats not a command");
            adminAddOrDetails(course1);
        }
    }

    public void adminReviewDetails(String course1) {
        System.out.println("which course do you want to change : ");
        if (course1.equals("computerScience")) {
            for (int i = 0; i < computerScience.size(); i++) {
                System.out.print(computerScience.get(i).courseName + " ");
            }
        }
        else if (course1.equals("Physic")) {
            for (int i = 0; i < Physic.size(); i++) {
                System.out.print(Physic.get(i).courseName + " ");
            }
        }
        else if (course1.equals("languageStructure")) {
            for (int i = 0; i < languageStructure.size(); i++) {
                System.out.print(languageStructure.get(i).courseName + " ");
            }
        }
        else if (course1.equals("Chemistry")) {
            for (int i = 0; i < Chemistry.size(); i++) {
                System.out.print(Chemistry.get(i).courseName + " ");
            }
        }
        String course = scanner.next();
    }
}

