import java.util.*;

public class Main {

    public static void main(String[] args) {

        int option;
        boolean run = true;
        ArrayList<Student> Stu = new ArrayList<>();
        Stu.add(new Student("Thomas"));
        Stu.add(new Student("Anders"));
        Stu.add(new Student("Jonathan"));
        Stu.add(new Student("Elisha"));

        ArrayList<Student> StuC = new ArrayList<>();
        StuC.add(new Student("Thomas"));
        StuC.add(new Student("Anders"));

        ArrayList<Student> StuD = new ArrayList<>();
        StuD.add(new Student("Jonathan"));
        StuD.add(new Student("Elisha"));

        ArrayList<Kurser> fag = new ArrayList<>();
        Kurser kurser1 = new Kurser("Konstruktion","Dat18v2",057,StuC,"Jon");
        Kurser kurser2 = new Kurser("Design","Dat18v2",057,StuD,"Jon");
        fag.add(kurser1);
        fag.add(kurser2);



        ArrayList<Lokale> lok = new ArrayList<>();
        lok.add(new Lokale(057));
        lok.add(new Lokale(056));

        ArrayList<Underviser> und = new ArrayList<>();
        und.add(new Underviser("Jon",1));
        und.add(new Underviser("Oskar",2));


        display_menu();



        while (run) {
            option = antiJarl();
            switch (option) {
                case 1:
                    for (int i = 0; i < fag.size(); i++) {
                        System.out.println(i + ") " + fag.get(i));
                    }
                    System.out.println("1 - Delete a student from Konstruktion");
                    System.out.println("2 - Delete a student from Design");
                    System.out.println("3 - Add Student to Konstruktion");
                    System.out.println("4 - Add Student to Design");
                    option = antiJarl();
                    if(option == 1){
                        System.out.println("Something");
                        for (int i = 0; i < StuC.size(); i++) {
                            System.out.println(i + ") " + StuC.get(i));
                        }
                        System.out.println();
                        Scanner sca2 = new Scanner(System.in);
                        System.out.println("Number?");
                        int remove2 = sca2.nextInt();
                        StuC.remove(remove2);
                        System.out.println(remove2 + " Has been removed!");
                        display_menu();
                    }

                    if(option == 2) {
                        for (int i = 0; i < StuD.size(); i++) {
                            System.out.println(i + ") " + StuD.get(i));
                        }
                        Scanner sca = new Scanner(System.in);
                        System.out.println("Number?");
                        int remove = sca.nextInt();
                        StuD.remove(remove);
                        System.out.println(remove + " Has been removed!");
                        display_menu();
                    }

                    if(option == 3) {
                        System.out.println("Who to add");
                        Scanner sca4 = new Scanner(System.in);
                        for (int i = 0; i < Stu.size(); i++) {
                            System.out.println(i + ") " + Stu.get(i));
                        }
                        int tempStu = sca4.nextInt();
                        StuC.add(new Student(Stu.get(tempStu).toString()));
                        System.out.println(Stu.get(tempStu).toString() + " Has been added to Konstruktion Timerne!");
                        display_menu();
                    }


                      if(option == 4) {
                          System.out.println("Who to add");
                          Scanner sca5 = new Scanner(System.in);
                          for (int i = 0; i < Stu.size(); i++) {
                              System.out.println(i + ") " + Stu.get(i));
                          }
                          int tempStuD = sca5.nextInt();
                          StuD.add(new Student(Stu.get(tempStuD).toString()));
                          System.out.println(Stu.get(tempStuD).toString() + " Has been added to Design Timerne!");
                          display_menu();
                      }



                    break;

                case 2:
                    System.out.println("All Lokale");
                    for (int i = 0; i < lok.size(); i++) {
                    System.out.println(i + ") " + lok.get(i));
                }
                    System.out.println("1 - Delete");
                    System.out.println("2 - Add");
                    option = antiJarl();
                    if(option == 1 ){
                        Scanner sca = new Scanner(System.in);
                        System.out.println("Number?");
                        int remove = sca.nextInt();
                        lok.remove(remove);
                        System.out.println(remove + " Has been removed!");
                        display_menu();
                    }

                    if(option == 2){
                        System.out.println("What number does the new room have?");
                        Scanner sca3 = new Scanner(System.in);
                        int tempLok = sca3.nextInt();
                        lok.add(new Lokale(tempLok));
                        System.out.println("Room " +tempLok+ " Has been added");
                        display_menu();
                    }
                    break;

                case 3:
                    System.out.println("All Lokale");
                    for (int i = 0; i < Stu.size(); i++) {
                        System.out.println(i + ") " + Stu.get(i));
                    }
                    System.out.println("1 - Delete");
                    System.out.println("2 - Add");
                    option = antiJarl();
                    if(option == 1 ){
                        Scanner sca = new Scanner(System.in);
                        System.out.println("Number?");
                        int remove = sca.nextInt();
                        Stu.remove(remove);
                        System.out.println(remove + " Has been removed!");
                        display_menu();
                    }
                    if(option == 2){
                        System.out.println("Name?");
                        Scanner sca = new Scanner(System.in);
                        String tempStu2 = sca.next();
                        Stu.add(new Student(tempStu2));
                        System.out.println("New Student: " +tempStu2);
                        display_menu();
                    }
                    break;

                case 4:
                    for (int i = 0; i<und.size(); i++) {
                        System.out.println(i + ") " + und.get(i));
                    }
                    break;
                case 0:
                    System.exit(0);

                default:
                    System.out.println("Please Type a number.");
            }


        }
    }

        public static void display_menu(){
            System.out.println("1) Kurser");
            System.out.println("2) Lokale");
            System.out.println("3) Student");
            System.out.println("4) Undervisning");
            System.out.println("0) Exit system");
            System.out.print("Selection: ");

        }

        public static int antiJarl(){
            Scanner input = new Scanner(System.in);
            while (!input.hasNextInt()) {
                input.next();
                System.out.println("Not an integer, try again Jarl..");
            }
            return input.nextInt();
        }
    }