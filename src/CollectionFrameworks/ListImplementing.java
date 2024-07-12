/**
 * Implementation of AbstractList
 * By doing this we can implement AbstractList
 * Must implement : get(int index), size()
 * Optional Implement : add(int index, E element), remove(int index), set(int index, E element)
 */
package CollectionFrameworks;

import java.util.*;

/**
 * This is Unmodifible implementation of AbstractList
 *
 * @param <E>
 */
public class ListImplementing<E> extends AbstractList<E> {
    private final List<E> data;

    public ListImplementing(List<E> data) {
        this.data = new ArrayList<>(data);
    }

    @Override
    public E get(int index) {
        return data.get(index);
    }

    @Override
    public int size() {
        return data.size();
    }

    /**
     * This will show error
     *
     * @param index   index at which the specified element is to be inserted
     * @param element element to be inserted
     */
    @Override
    public void add(int index, E element) {
        throw new UnsupportedOperationException("Add Operation is not allowed");
    }

    public static void main(String[] arg) {
        List<String> list = new ArrayList<>(5);
        list.add("Ayush");
        list.add("Sharma");

        System.out.println(list);

        ListImplementing<String> obj = new ListImplementing<>(list);

/**
 * This will show error coz we are throwing errors
 */
        try {
            obj.add("This is going to show error");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
