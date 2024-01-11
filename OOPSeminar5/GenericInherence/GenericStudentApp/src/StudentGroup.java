

import java.util.Iterator;
import java.util.List;



public class StudentGroup<T extends Comparable<T>,V> implements Iterable<Student<T,V>>{//, Comparable<StudentGroup<T,V>> {
    private List<Student<T,V>> group;
    private V idGroup;

    public StudentGroup(List<Student<T,V>> group, V idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }

    public List<Student<T,V>> getGroup() {
        return group;
    }

    public void setGroup(List<Student<T,V>> group) {
        this.group = group;
    }

    public V getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(V idGroup) {
        this.idGroup = idGroup;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "idGroup=" + idGroup +
                ", studentCount=" + group.size() +
                ", students=" + group +
                '}';
    }
    @Override
    public Iterator<Student<T,V>> iterator() {
        return new StudentIterator<T,V>(group);

    }


    // @Override
    // public int compareTo(StudentGroup o) {
    //     int result = Integer.compare(this.getGroup().size(), o.getGroup().size());
    //     if(result == 0) result = Integer.compare(this.getIdGroup(), o.getIdGroup());
    //     return result;
    // }
}