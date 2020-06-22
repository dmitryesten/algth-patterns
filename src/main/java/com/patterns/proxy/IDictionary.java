package com.patterns.proxy;

import java.util.Collection;

public interface IDictionary<T> {

    Collection<T> getPersonCollection();

    T getById(long id);

}
