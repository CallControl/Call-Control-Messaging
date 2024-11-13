package dev.octoshrimpy.quik.common.base;

import java.lang.System;

/**
 * Base RecyclerView.Adapter that provides some convenience when creating a new Adapter, such as
 * data list handing and item animations
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0010H\u0017J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0010H\u0017J\b\u0010\u0016\u001a\u00020\u0012H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R@\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0018\u00010\u00072\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0018\u00010\u0007@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Ldev/octoshrimpy/quik/common/base/FlowableAdapter;", "T", "Ldev/octoshrimpy/quik/common/base/QkAdapter;", "()V", "disposable", "Lio/reactivex/disposables/Disposable;", "value", "Lio/reactivex/Flowable;", "", "flowable", "getFlowable", "()Lio/reactivex/Flowable;", "setFlowable", "(Lio/reactivex/Flowable;)V", "recyclerViews", "Ljava/util/ArrayList;", "Landroidx/recyclerview/widget/RecyclerView;", "dispose", "", "onAttachedToRecyclerView", "recyclerView", "onDetachedFromRecyclerView", "subscribe", "presentation_noAnalyticsRelease"})
public abstract class FlowableAdapter<T extends java.lang.Object> extends dev.octoshrimpy.quik.common.base.QkAdapter<T> {
    @org.jetbrains.annotations.Nullable
    private io.reactivex.Flowable<java.util.List<T>> flowable;
    private final java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> recyclerViews = null;
    private io.reactivex.disposables.Disposable disposable;
    
    public FlowableAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final io.reactivex.Flowable<java.util.List<T>> getFlowable() {
        return null;
    }
    
    public final void setFlowable(@org.jetbrains.annotations.Nullable
    io.reactivex.Flowable<java.util.List<T>> value) {
    }
    
    @androidx.annotation.CallSuper
    @java.lang.Override
    public void onAttachedToRecyclerView(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
    
    @androidx.annotation.CallSuper
    @java.lang.Override
    public void onDetachedFromRecyclerView(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
    
    private final void subscribe() {
    }
    
    private final void dispose() {
    }
}