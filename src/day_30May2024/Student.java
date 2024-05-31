package day_30May2024;

/**
 * in case of this kind of sorting we need to use comparable interface
 * with help of this interface we can sort student objects with respect to either id or name
 * here we are overriding compareTo method from comparable interface and put the sorting logic
 */

public class Student implements Comparable<Student>{
    Integer id;
    String name;

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Student: "+this.name+" id: "+this.id;
    }

    @Override
    public int compareTo(Student o) {

        // comparing based on id
//        return Integer.compare(this.id, o.id);

        // comparing based on name
        return CharSequence.compare(this.name,o.name);
    }

}
