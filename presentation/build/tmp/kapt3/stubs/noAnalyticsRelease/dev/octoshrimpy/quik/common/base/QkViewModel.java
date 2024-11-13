package dev.octoshrimpy.quik.common.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0010\b\u0000\u0010\u0001 \u0000*\b\u0012\u0004\u0012\u0002H\u00030\u0002*\u0004\b\u0001\u0010\u00032\u00020\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0006J\u0015\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00028\u0000H\u0017\u00a2\u0006\u0002\u0010\u0015J!\u0010\u0016\u001a\u00020\u00132\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u0010\u00a2\u0006\u0002\b\u0011H\u0004J\b\u0010\u0018\u001a\u00020\u0013H\u0014R\u0014\u0010\u0007\u001a\u00020\bX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\fX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR%\u0010\u000f\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u0010\u00a2\u0006\u0002\b\u00110\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Ldev/octoshrimpy/quik/common/base/QkViewModel;", "View", "Ldev/octoshrimpy/quik/common/base/QkView;", "State", "Landroidx/lifecycle/ViewModel;", "initialState", "(Ljava/lang/Object;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "getDisposables", "()Lio/reactivex/disposables/CompositeDisposable;", "state", "Lio/reactivex/subjects/Subject;", "getState", "()Lio/reactivex/subjects/Subject;", "stateReducer", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "bindView", "", "view", "(Ldev/octoshrimpy/quik/common/base/QkView;)V", "newState", "reducer", "onCleared", "presentation_noAnalyticsRelease"})
public abstract class QkViewModel<View extends dev.octoshrimpy.quik.common.base.QkView<? super State>, State extends java.lang.Object> extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.subjects.Subject<State> state = null;
    private final io.reactivex.subjects.Subject<kotlin.jvm.functions.Function1<State, State>> stateReducer = null;
    
    public QkViewModel(State initialState) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    protected final io.reactivex.disposables.CompositeDisposable getDisposables() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final io.reactivex.subjects.Subject<State> getState() {
        return null;
    }
    
    @androidx.annotation.CallSuper
    public void bindView(@org.jetbrains.annotations.NotNull
    View view) {
    }
    
    protected final void newState(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super State, ? extends State> reducer) {
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
}