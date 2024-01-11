

import java.util.Iterator;
import java.util.List;

public class StudentIterator<T extends Comparable<T>,V> implements Iterator<Student<T,V>> {
    private int count;

    private final List<Student<T,V>> list;

    public StudentIterator(List<Student<T,V>> list) {
        this.list = list;
        this.count = 0;
    }


    @Override
    public boolean hasNext() {
        return count < list.size();
    }

    @Override
    public Student<T,V> next() {
        return this.list.get(count++);
    }
}
