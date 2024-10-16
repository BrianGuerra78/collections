package collecciones;

public class Estudiantes {
    private String name;
    private String surname;
    private String city;
    private double avgGrade;
    private int age;

    public Estudiantes(String name, String surname, String city, double avgGrade, int age) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.avgGrade = avgGrade;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{ " + "name = " + name + '}';
    }

    public boolean calificacionExcelente(){
        if (this.avgGrade >= 8.0){
            return true;
        }else {
            return false;
        }
    }
}
