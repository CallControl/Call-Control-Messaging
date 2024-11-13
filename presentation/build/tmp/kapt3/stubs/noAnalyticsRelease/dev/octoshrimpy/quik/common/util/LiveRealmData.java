package dev.octoshrimpy.quik.common.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u0003B\u0013\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\nH\u0014R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Ldev/octoshrimpy/quik/common/util/LiveRealmData;", "T", "Lio/realm/RealmModel;", "Landroidx/lifecycle/LiveData;", "Lio/realm/RealmResults;", "results", "(Lio/realm/RealmResults;)V", "listener", "Lio/realm/RealmChangeListener;", "onActive", "", "onInactive", "presentation_noAnalyticsRelease"})
public final class LiveRealmData<T extends io.realm.RealmModel> extends androidx.lifecycle.LiveData<io.realm.RealmResults<T>> {
    private final io.realm.RealmResults<T> results = null;
    private final io.realm.RealmChangeListener<io.realm.RealmResults<T>> listener = null;
    
    public LiveRealmData(@org.jetbrains.annotations.NotNull
    io.realm.RealmResults<T> results) {
        super(null);
    }
    
    @java.lang.Override
    protected void onActive() {
    }
    
    @java.lang.Override
    protected void onInactive() {
    }
}