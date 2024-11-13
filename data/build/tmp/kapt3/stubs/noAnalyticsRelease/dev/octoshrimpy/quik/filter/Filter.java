package dev.octoshrimpy.quik.filter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\bH&\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Ldev/octoshrimpy/quik/filter/Filter;", "T", "", "()V", "filter", "", "item", "query", "", "(Ljava/lang/Object;Ljava/lang/CharSequence;)Z", "data_noAnalyticsRelease"})
public abstract class Filter<T extends java.lang.Object> {
    
    public Filter() {
        super();
    }
    
    public abstract boolean filter(T item, @org.jetbrains.annotations.NotNull
    java.lang.CharSequence query);
}