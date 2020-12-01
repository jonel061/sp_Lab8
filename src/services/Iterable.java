/*
package services;

import java.util.Objects;
import java.util.Spliterator;
import java.util.function.Consumer;

public interface Iterable<T> {
    Iterator<T> iterator();

    Spliterator<T> spliterator();

    default void forEach(Consumer<? super T> action) {
        Objects.requireNonNull(action);
        for (T t : this) {
            action.accept(t);

        }
    }
}
*/
