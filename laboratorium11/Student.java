package pl.edu.uwm.wmii.marcelmrozowski.laboratorium11;

public class Student implements Comparable<Student>{
    private static int id = 0;
    private int student_id;
    private String imie;
    private String nazwisko;

    public Student(String imie, String nazwisko){
        this.student_id = this.id;
        id++;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public int getStudent_id(){
        return student_id;
    }

    public String getImie(){
        return imie;
    }

    public String getNazwisko(){
        return nazwisko;
    }

    @Override
    public int compareTo(Student test)
    {
        if(nazwisko.compareTo(test.nazwisko) != 0)
        {
            return nazwisko.compareTo(test.nazwisko);
        }
        else if(imie.compareTo(test.imie) != 0)
        {
            return imie.compareTo(test.imie);
        }
        else if(student_id > test.student_id)
        {
            return 1;
        }
        else if(student_id < test.student_id)
        {
            return -1;
        }
        return 0;
    }
}
