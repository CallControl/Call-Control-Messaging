package dev.octoshrimpy.quik.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00150BH\u0016J\u000e\u0010C\u001a\b\u0012\u0004\u0012\u00020\u001b0BH\u0016J\b\u0010D\u001a\u00020EH\u0016J\u000e\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001f0BH\u0016R$\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00148\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R$\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00148\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019R\u001e\u0010\"\u001a\u00020#8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001e\u0010(\u001a\u00020)8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u0010.\u001a\u00020/8\u0006@\u0006X\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b0\u0010\u0005\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001e\u00105\u001a\u0002068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001e\u0010;\u001a\u00020<8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@\u00a8\u0006G"}, d2 = {"Ldev/octoshrimpy/quik/common/QKApplication;", "Landroid/app/Application;", "Ldagger/android/HasActivityInjector;", "Ldagger/android/HasBroadcastReceiverInjector;", "Ldagger/android/HasServiceInjector;", "()V", "analyticsManager", "Ldev/octoshrimpy/quik/manager/AnalyticsManager;", "getAnalyticsManager$annotations", "getAnalyticsManager", "()Ldev/octoshrimpy/quik/manager/AnalyticsManager;", "setAnalyticsManager", "(Ldev/octoshrimpy/quik/manager/AnalyticsManager;)V", "billingManager", "Ldev/octoshrimpy/quik/manager/BillingManager;", "getBillingManager", "()Ldev/octoshrimpy/quik/manager/BillingManager;", "setBillingManager", "(Ldev/octoshrimpy/quik/manager/BillingManager;)V", "dispatchingActivityInjector", "Ldagger/android/DispatchingAndroidInjector;", "Landroid/app/Activity;", "getDispatchingActivityInjector", "()Ldagger/android/DispatchingAndroidInjector;", "setDispatchingActivityInjector", "(Ldagger/android/DispatchingAndroidInjector;)V", "dispatchingBroadcastReceiverInjector", "Landroid/content/BroadcastReceiver;", "getDispatchingBroadcastReceiverInjector", "setDispatchingBroadcastReceiverInjector", "dispatchingServiceInjector", "Landroid/app/Service;", "getDispatchingServiceInjector", "setDispatchingServiceInjector", "fileLoggingTree", "Ldev/octoshrimpy/quik/common/util/FileLoggingTree;", "getFileLoggingTree", "()Ldev/octoshrimpy/quik/common/util/FileLoggingTree;", "setFileLoggingTree", "(Ldev/octoshrimpy/quik/common/util/FileLoggingTree;)V", "nightModeManager", "Ldev/octoshrimpy/quik/util/NightModeManager;", "getNightModeManager", "()Ldev/octoshrimpy/quik/util/NightModeManager;", "setNightModeManager", "(Ldev/octoshrimpy/quik/util/NightModeManager;)V", "qkMigration", "Ldev/octoshrimpy/quik/migration/QkMigration;", "getQkMigration$annotations", "getQkMigration", "()Ldev/octoshrimpy/quik/migration/QkMigration;", "setQkMigration", "(Ldev/octoshrimpy/quik/migration/QkMigration;)V", "realmMigration", "Ldev/octoshrimpy/quik/migration/QkRealmMigration;", "getRealmMigration", "()Ldev/octoshrimpy/quik/migration/QkRealmMigration;", "setRealmMigration", "(Ldev/octoshrimpy/quik/migration/QkRealmMigration;)V", "referralManager", "Ldev/octoshrimpy/quik/manager/ReferralManager;", "getReferralManager", "()Ldev/octoshrimpy/quik/manager/ReferralManager;", "setReferralManager", "(Ldev/octoshrimpy/quik/manager/ReferralManager;)V", "activityInjector", "Ldagger/android/AndroidInjector;", "broadcastReceiverInjector", "onCreate", "", "serviceInjector", "presentation_noAnalyticsRelease"})
public final class QKApplication extends android.app.Application implements dagger.android.HasActivityInjector, dagger.android.HasBroadcastReceiverInjector, dagger.android.HasServiceInjector {
    
    /**
     * Inject these so that they are forced to initialize
     */
    @javax.inject.Inject
    public dev.octoshrimpy.quik.manager.AnalyticsManager analyticsManager;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.migration.QkMigration qkMigration;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.manager.BillingManager billingManager;
    @javax.inject.Inject
    public dagger.android.DispatchingAndroidInjector<android.app.Activity> dispatchingActivityInjector;
    @javax.inject.Inject
    public dagger.android.DispatchingAndroidInjector<android.content.BroadcastReceiver> dispatchingBroadcastReceiverInjector;
    @javax.inject.Inject
    public dagger.android.DispatchingAndroidInjector<android.app.Service> dispatchingServiceInjector;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.common.util.FileLoggingTree fileLoggingTree;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.util.NightModeManager nightModeManager;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.migration.QkRealmMigration realmMigration;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.manager.ReferralManager referralManager;
    
    public QKApplication() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.manager.AnalyticsManager getAnalyticsManager() {
        return null;
    }
    
    /**
     * Inject these so that they are forced to initialize
     */
    @kotlin.Suppress(names = {"unused"})
    @java.lang.Deprecated
    public static void getAnalyticsManager$annotations() {
    }
    
    public final void setAnalyticsManager(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.manager.AnalyticsManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.migration.QkMigration getQkMigration() {
        return null;
    }
    
    @kotlin.Suppress(names = {"unused"})
    @java.lang.Deprecated
    public static void getQkMigration$annotations() {
    }
    
    public final void setQkMigration(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.migration.QkMigration p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.manager.BillingManager getBillingManager() {
        return null;
    }
    
    public final void setBillingManager(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.manager.BillingManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dagger.android.DispatchingAndroidInjector<android.app.Activity> getDispatchingActivityInjector() {
        return null;
    }
    
    public final void setDispatchingActivityInjector(@org.jetbrains.annotations.NotNull
    dagger.android.DispatchingAndroidInjector<android.app.Activity> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dagger.android.DispatchingAndroidInjector<android.content.BroadcastReceiver> getDispatchingBroadcastReceiverInjector() {
        return null;
    }
    
    public final void setDispatchingBroadcastReceiverInjector(@org.jetbrains.annotations.NotNull
    dagger.android.DispatchingAndroidInjector<android.content.BroadcastReceiver> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dagger.android.DispatchingAndroidInjector<android.app.Service> getDispatchingServiceInjector() {
        return null;
    }
    
    public final void setDispatchingServiceInjector(@org.jetbrains.annotations.NotNull
    dagger.android.DispatchingAndroidInjector<android.app.Service> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.common.util.FileLoggingTree getFileLoggingTree() {
        return null;
    }
    
    public final void setFileLoggingTree(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.util.FileLoggingTree p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.util.NightModeManager getNightModeManager() {
        return null;
    }
    
    public final void setNightModeManager(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.util.NightModeManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.migration.QkRealmMigration getRealmMigration() {
        return null;
    }
    
    public final void setRealmMigration(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.migration.QkRealmMigration p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.manager.ReferralManager getReferralManager() {
        return null;
    }
    
    public final void setReferralManager(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.manager.ReferralManager p0) {
    }
    
    @java.lang.Override
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dagger.android.AndroidInjector<android.app.Activity> activityInjector() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dagger.android.AndroidInjector<android.content.BroadcastReceiver> broadcastReceiverInjector() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dagger.android.AndroidInjector<android.app.Service> serviceInjector() {
        return null;
    }
}