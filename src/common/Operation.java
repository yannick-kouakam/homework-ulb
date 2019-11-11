package common;

public interface Operation<T> {
    boolean search(T elmt);

    boolean ins(T elmt);

    boolean del(T elmt);
}
