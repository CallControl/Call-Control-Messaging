package dev.octoshrimpy.quik.listener;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\f\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H&\u00a8\u0006\u0004"}, d2 = {"Ldev/octoshrimpy/quik/listener/ContactAddedListener;", "", "listen", "Lio/reactivex/Observable;", "domain_release"})
public abstract interface ContactAddedListener {
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> listen();
}