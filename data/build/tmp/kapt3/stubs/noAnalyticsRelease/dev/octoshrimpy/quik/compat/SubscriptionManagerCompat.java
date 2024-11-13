package dev.octoshrimpy.quik.compat;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0015B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0082\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0016"}, d2 = {"Ldev/octoshrimpy/quik/compat/SubscriptionManagerCompat;", "", "context", "Landroid/content/Context;", "permissions", "Ldev/octoshrimpy/quik/manager/PermissionManager;", "(Landroid/content/Context;Ldev/octoshrimpy/quik/manager/PermissionManager;)V", "activeSubscriptionInfoList", "", "Ldev/octoshrimpy/quik/compat/SubscriptionInfoCompat;", "getActiveSubscriptionInfoList", "()Ljava/util/List;", "subscriptionManager", "Landroid/telephony/SubscriptionManager;", "getSubscriptionManager", "()Landroid/telephony/SubscriptionManager;", "addOnSubscriptionsChangedListener", "", "listener", "Ldev/octoshrimpy/quik/compat/SubscriptionManagerCompat$OnSubscriptionsChangedListener;", "removeOnSubscriptionsChangedListener", "OnSubscriptionsChangedListener", "data_noAnalyticsRelease"})
public final class SubscriptionManagerCompat {
    private final dev.octoshrimpy.quik.manager.PermissionManager permissions = null;
    private final android.telephony.SubscriptionManager subscriptionManager = null;
    
    @javax.inject.Inject
    public SubscriptionManagerCompat(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.manager.PermissionManager permissions) {
        super();
    }
    
    private final android.telephony.SubscriptionManager getSubscriptionManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<dev.octoshrimpy.quik.compat.SubscriptionInfoCompat> getActiveSubscriptionInfoList() {
        return null;
    }
    
    public final void addOnSubscriptionsChangedListener(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.compat.SubscriptionManagerCompat.OnSubscriptionsChangedListener listener) {
    }
    
    public final void removeOnSubscriptionsChangedListener(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.compat.SubscriptionManagerCompat.OnSubscriptionsChangedListener listener) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH&R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Ldev/octoshrimpy/quik/compat/SubscriptionManagerCompat$OnSubscriptionsChangedListener;", "", "()V", "listener", "Landroid/telephony/SubscriptionManager$OnSubscriptionsChangedListener;", "getListener", "()Landroid/telephony/SubscriptionManager$OnSubscriptionsChangedListener;", "onSubscriptionsChanged", "", "data_noAnalyticsRelease"})
    public static abstract class OnSubscriptionsChangedListener {
        @org.jetbrains.annotations.Nullable
        private final android.telephony.SubscriptionManager.OnSubscriptionsChangedListener listener = null;
        
        public OnSubscriptionsChangedListener() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final android.telephony.SubscriptionManager.OnSubscriptionsChangedListener getListener() {
            return null;
        }
        
        public abstract void onSubscriptionsChanged();
    }
}