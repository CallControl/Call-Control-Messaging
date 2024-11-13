package dev.octoshrimpy.quik.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\u0007\u001a\u00020\b2\u0014\u0010\t\u001a\u0010\u0012\f\b\u0000\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\nH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Ldev/octoshrimpy/quik/util/ActiveSubscriptionObservable;", "Lio/reactivex/Observable;", "", "Ldev/octoshrimpy/quik/compat/SubscriptionInfoCompat;", "subscriptionManager", "Ldev/octoshrimpy/quik/compat/SubscriptionManagerCompat;", "(Ldev/octoshrimpy/quik/compat/SubscriptionManagerCompat;)V", "subscribeActual", "", "observer", "Lio/reactivex/Observer;", "Listener", "data_noAnalyticsRelease"})
public final class ActiveSubscriptionObservable extends io.reactivex.Observable<java.util.List<? extends dev.octoshrimpy.quik.compat.SubscriptionInfoCompat>> {
    private final dev.octoshrimpy.quik.compat.SubscriptionManagerCompat subscriptionManager = null;
    
    public ActiveSubscriptionObservable(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.compat.SubscriptionManagerCompat subscriptionManager) {
        super();
    }
    
    @java.lang.Override
    protected void subscribeActual(@org.jetbrains.annotations.NotNull
    io.reactivex.Observer<? super java.util.List<dev.octoshrimpy.quik.compat.SubscriptionInfoCompat>> observer) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0014\u0010\u0005\u001a\u0010\u0012\f\b\u0000\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\b\u0010\u000f\u001a\u00020\rH\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0010\u0012\f\b\u0000\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Ldev/octoshrimpy/quik/util/ActiveSubscriptionObservable$Listener;", "Lio/reactivex/disposables/Disposable;", "Ldev/octoshrimpy/quik/compat/SubscriptionManagerCompat$OnSubscriptionsChangedListener;", "subscriptionManager", "Ldev/octoshrimpy/quik/compat/SubscriptionManagerCompat;", "observer", "Lio/reactivex/Observer;", "", "Ldev/octoshrimpy/quik/compat/SubscriptionInfoCompat;", "(Ldev/octoshrimpy/quik/compat/SubscriptionManagerCompat;Lio/reactivex/Observer;)V", "disposed", "", "dispose", "", "isDisposed", "onSubscriptionsChanged", "data_noAnalyticsRelease"})
    public static final class Listener extends dev.octoshrimpy.quik.compat.SubscriptionManagerCompat.OnSubscriptionsChangedListener implements io.reactivex.disposables.Disposable {
        private final dev.octoshrimpy.quik.compat.SubscriptionManagerCompat subscriptionManager = null;
        private final io.reactivex.Observer<? super java.util.List<dev.octoshrimpy.quik.compat.SubscriptionInfoCompat>> observer = null;
        private boolean disposed = false;
        
        public Listener(@org.jetbrains.annotations.NotNull
        dev.octoshrimpy.quik.compat.SubscriptionManagerCompat subscriptionManager, @org.jetbrains.annotations.NotNull
        io.reactivex.Observer<? super java.util.List<dev.octoshrimpy.quik.compat.SubscriptionInfoCompat>> observer) {
            super();
        }
        
        @java.lang.Override
        public void onSubscriptionsChanged() {
        }
        
        @java.lang.Override
        public boolean isDisposed() {
            return false;
        }
        
        @java.lang.Override
        public void dispose() {
        }
    }
}