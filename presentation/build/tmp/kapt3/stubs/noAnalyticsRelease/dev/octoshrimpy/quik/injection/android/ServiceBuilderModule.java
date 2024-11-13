package dev.octoshrimpy.quik.injection.android;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'J\b\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Ldev/octoshrimpy/quik/injection/android/ServiceBuilderModule;", "", "()V", "bindAutoDeleteService", "Ldev/octoshrimpy/quik/service/AutoDeleteService;", "bindHeadlessSmsSendService", "Ldev/octoshrimpy/quik/service/HeadlessSmsSendService;", "bindRestoreBackupService", "Ldev/octoshrimpy/quik/feature/backup/RestoreBackupService;", "bindSendSmsReceiver", "Ldev/octoshrimpy/quik/receiver/SendSmsReceiver;", "presentation_noAnalyticsRelease"})
@dagger.Module
public abstract class ServiceBuilderModule {
    
    public ServiceBuilderModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.android.ContributesAndroidInjector
    @dev.octoshrimpy.quik.injection.scope.ActivityScope
    public abstract dev.octoshrimpy.quik.service.AutoDeleteService bindAutoDeleteService();
    
    @org.jetbrains.annotations.NotNull
    @dagger.android.ContributesAndroidInjector
    @dev.octoshrimpy.quik.injection.scope.ActivityScope
    public abstract dev.octoshrimpy.quik.service.HeadlessSmsSendService bindHeadlessSmsSendService();
    
    @org.jetbrains.annotations.NotNull
    @dagger.android.ContributesAndroidInjector
    @dev.octoshrimpy.quik.injection.scope.ActivityScope
    public abstract dev.octoshrimpy.quik.feature.backup.RestoreBackupService bindRestoreBackupService();
    
    @org.jetbrains.annotations.NotNull
    @dagger.android.ContributesAndroidInjector
    @dev.octoshrimpy.quik.injection.scope.ActivityScope
    public abstract dev.octoshrimpy.quik.receiver.SendSmsReceiver bindSendSmsReceiver();
}