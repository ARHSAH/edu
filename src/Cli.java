import java.util.ArrayList;
import java.util.Scanner;

public class Cli {
    ArrayList<course> computerScience = new ArrayList<course>();
    ArrayList<course> Physic = new ArrayList<course>();
    ArrayList<course> languageStructure = new ArrayList<course>();
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


    }

    public void welcome() {
        System.out.println("student or admin?");
        String welcome1 = scanner.next();
        if (welcome1.equals("admin")) {
            admin();
        }
    }

    public void admin() {
        System.out.println("choose which faculty :");
        System.out.println("computerScience " + "Physic " + "languageStructure");
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
        }
        if (faculty.equals("Physic")) {
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
        }
    }
}
