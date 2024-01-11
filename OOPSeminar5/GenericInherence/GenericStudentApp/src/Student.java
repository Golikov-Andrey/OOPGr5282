

public class Student<T extends Comparable<T>,V> extends Person<T,V> implements Comparable<Student<T,V>>{

    private V id;

   // private static int generalId;


    public Student(T name, V age) {
        super(name, age);
        //this.id = generalId;
       // generalId++;
    }

    public V getId() {
        return id;
    }

    public void setId(V id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return super.toString() + ", id: " + this.id;
    }

    @Override
    public int compareTo(Student<T,V> o) {

        return super.getName().compareTo(o.getName());
        // System.out.println(super.getName() + "-" + o.getName());
        // if(super.getAge() > o.getAge()) return 1;
        // if(super.getAge() < o.getAge()) return -1;
        // if(this.id > o.id) return 1;
        // if(this.id < o.id) return -1;
        // return 0;
    }
}
