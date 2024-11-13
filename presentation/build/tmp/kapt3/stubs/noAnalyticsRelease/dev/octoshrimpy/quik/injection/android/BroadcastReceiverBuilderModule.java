package dev.octoshrimpy.quik.injection.android;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'J\b\u0010\t\u001a\u00020\nH\'J\b\u0010\u000b\u001a\u00020\fH\'J\b\u0010\r\u001a\u00020\u000eH\'J\b\u0010\u000f\u001a\u00020\u0010H\'J\b\u0010\u0011\u001a\u00020\u0012H\'J\b\u0010\u0013\u001a\u00020\u0014H\'J\b\u0010\u0015\u001a\u00020\u0016H\'J\b\u0010\u0017\u001a\u00020\u0018H\'J\b\u0010\u0019\u001a\u00020\u001aH\'J\b\u0010\u001b\u001a\u00020\u001cH\'J\b\u0010\u001d\u001a\u00020\u001eH\'J\b\u0010\u001f\u001a\u00020 H\'J\b\u0010!\u001a\u00020\"H\'J\b\u0010#\u001a\u00020$H\'J\b\u0010%\u001a\u00020&H\'J\b\u0010\'\u001a\u00020(H\'\u00a8\u0006)"}, d2 = {"Ldev/octoshrimpy/quik/injection/android/BroadcastReceiverBuilderModule;", "", "()V", "bindBlockThreadReceiver", "Ldev/octoshrimpy/quik/receiver/BlockThreadReceiver;", "bindBootReceiver", "Ldev/octoshrimpy/quik/receiver/BootReceiver;", "bindDefaultSmsChangedReceiver", "Ldev/octoshrimpy/quik/receiver/DefaultSmsChangedReceiver;", "bindDeleteMessagesReceiver", "Ldev/octoshrimpy/quik/receiver/DeleteMessagesReceiver;", "bindMarkArchivedReceiver", "Ldev/octoshrimpy/quik/receiver/MarkArchivedReceiver;", "bindMarkReadReceiver", "Ldev/octoshrimpy/quik/receiver/MarkReadReceiver;", "bindMarkSeenReceiver", "Ldev/octoshrimpy/quik/receiver/MarkSeenReceiver;", "bindMmsReceivedReceiver", "Ldev/octoshrimpy/quik/receiver/MmsReceivedReceiver;", "bindMmsReceiver", "Ldev/octoshrimpy/quik/receiver/MmsReceiver;", "bindMmsSentReceiver", "Ldev/octoshrimpy/quik/receiver/MmsSentReceiver;", "bindMmsUpdatedReceiver", "Ldev/octoshrimpy/quik/receiver/MmsUpdatedReceiver;", "bindNightModeReceiver", "Ldev/octoshrimpy/quik/receiver/NightModeReceiver;", "bindRemoteMessagingReceiver", "Ldev/octoshrimpy/quik/receiver/RemoteMessagingReceiver;", "bindSendScheduledMessageReceiver", "Ldev/octoshrimpy/quik/receiver/SendScheduledMessageReceiver;", "bindSmsDeliveredReceiver", "Ldev/octoshrimpy/quik/receiver/SmsDeliveredReceiver;", "bindSmsProviderChangedReceiver", "Ldev/octoshrimpy/quik/receiver/SmsProviderChangedReceiver;", "bindSmsReceiver", "Ldev/octoshrimpy/quik/receiver/SmsReceiver;", "bindSmsSentReceiver", "Ldev/octoshrimpy/quik/receiver/SmsSentReceiver;", "bindWidgetProvider", "Ldev/octoshrimpy/quik/feature/widget/WidgetProvider;", "presentation_noAnalyticsRelease"})
@dagger.Module
public abstract class BroadcastReceiverBuilderModule {
    
    public BroadcastReceiverBuilderModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.android.ContributesAndroidInjector
    @dev.octoshrimpy.quik.injection.scope.ActivityScope
    public abstract dev.octoshrimpy.quik.receiver.BlockThreadReceiver bindBlockThreadReceiver();
    
    @org.jetbrains.annotations.NotNull
    @dagger.android.ContributesAndroidInjector
    @dev.octoshrimpy.quik.injection.scope.ActivityScope
    public abstract dev.octoshrimpy.quik.receiver.BootReceiver bindBootReceiver();
    
    @org.jetbrains.annotations.NotNull
    @dagger.android.ContributesAndroidInjector
    @dev.octoshrimpy.quik.injection.scope.ActivityScope
    public abstract dev.octoshrimpy.quik.receiver.DefaultSmsChangedReceiver bindDefaultSmsChangedReceiver();
    
    @org.jetbrains.annotations.NotNull
    @dagger.android.ContributesAndroidInjector
    @dev.octoshrimpy.quik.injection.scope.ActivityScope
    public abstract dev.octoshrimpy.quik.receiver.DeleteMessagesReceiver bindDeleteMessagesReceiver();
    
    @org.jetbrains.annotations.NotNull
    @dagger.android.ContributesAndroidInjector
    @dev.octoshrimpy.quik.injection.scope.ActivityScope
    public abstract dev.octoshrimpy.quik.receiver.MarkArchivedReceiver bindMarkArchivedReceiver();
    
    @org.jetbrains.annotations.NotNull
    @dagger.android.ContributesAndroidInjector
    @dev.octoshrimpy.quik.injection.scope.ActivityScope
    public abstract dev.octoshrimpy.quik.receiver.MarkReadReceiver bindMarkReadReceiver();
    
    @org.jetbrains.annotations.NotNull
    @dagger.android.ContributesAndroidInjector
    @dev.octoshrimpy.quik.injection.scope.ActivityScope
    public abstract dev.octoshrimpy.quik.receiver.MarkSeenReceiver bindMarkSeenReceiver();
    
    @org.jetbrains.annotations.NotNull
    @dagger.android.ContributesAndroidInjector
    @dev.octoshrimpy.quik.injection.scope.ActivityScope
    public abstract dev.octoshrimpy.quik.receiver.MmsReceivedReceiver bindMmsReceivedReceiver();
    
    @org.jetbrains.annotations.NotNull
    @dagger.android.ContributesAndroidInjector
    @dev.octoshrimpy.quik.injection.scope.ActivityScope
    public abstract dev.octoshrimpy.quik.receiver.MmsReceiver bindMmsReceiver();
    
    @org.jetbrains.annotations.NotNull
    @dagger.android.ContributesAndroidInjector
    @dev.octoshrimpy.quik.injection.scope.ActivityScope
    public abstract dev.octoshrimpy.quik.receiver.MmsSentReceiver bindMmsSentReceiver();
    
    @org.jetbrains.annotations.NotNull
    @dagger.android.ContributesAndroidInjector
    @dev.octoshrimpy.quik.injection.scope.ActivityScope
    public abstract dev.octoshrimpy.quik.receiver.MmsUpdatedReceiver bindMmsUpdatedReceiver();
    
    @org.jetbrains.annotations.NotNull
    @dagger.android.ContributesAndroidInjector
    @dev.octoshrimpy.quik.injection.scope.ActivityScope
    public abstract dev.octoshrimpy.quik.receiver.NightModeReceiver bindNightModeReceiver();
    
    @org.jetbrains.annotations.NotNull
    @dagger.android.ContributesAndroidInjector
    @dev.octoshrimpy.quik.injection.scope.ActivityScope
    public abstract dev.octoshrimpy.quik.receiver.RemoteMessagingReceiver bindRemoteMessagingReceiver();
    
    @org.jetbrains.annotations.NotNull
    @dagger.android.ContributesAndroidInjector
    @dev.octoshrimpy.quik.injection.scope.ActivityScope
    public abstract dev.octoshrimpy.quik.receiver.SendScheduledMessageReceiver bindSendScheduledMessageReceiver();
    
    @org.jetbrains.annotations.NotNull
    @dagger.android.ContributesAndroidInjector
    @dev.octoshrimpy.quik.injection.scope.ActivityScope
    public abstract dev.octoshrimpy.quik.receiver.SmsDeliveredReceiver bindSmsDeliveredReceiver();
    
    @org.jetbrains.annotations.NotNull
    @dagger.android.ContributesAndroidInjector
    @dev.octoshrimpy.quik.injection.scope.ActivityScope
    public abstract dev.octoshrimpy.quik.receiver.SmsProviderChangedReceiver bindSmsProviderChangedReceiver();
    
    @org.jetbrains.annotations.NotNull
    @dagger.android.ContributesAndroidInjector
    @dev.octoshrimpy.quik.injection.scope.ActivityScope
    public abstract dev.octoshrimpy.quik.receiver.SmsReceiver bindSmsReceiver();
    
    @org.jetbrains.annotations.NotNull
    @dagger.android.ContributesAndroidInjector
    @dev.octoshrimpy.quik.injection.scope.ActivityScope
    public abstract dev.octoshrimpy.quik.receiver.SmsSentReceiver bindSmsSentReceiver();
    
    @org.jetbrains.annotations.NotNull
    @dagger.android.ContributesAndroidInjector
    @dev.octoshrimpy.quik.injection.scope.ActivityScope
    public abstract dev.octoshrimpy.quik.feature.widget.WidgetProvider bindWidgetProvider();
}