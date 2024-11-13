package dev.octoshrimpy.quik.receiver;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0015"}, d2 = {"Ldev/octoshrimpy/quik/receiver/SendSmsReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "messageRepo", "Ldev/octoshrimpy/quik/repository/MessageRepository;", "getMessageRepo", "()Ldev/octoshrimpy/quik/repository/MessageRepository;", "setMessageRepo", "(Ldev/octoshrimpy/quik/repository/MessageRepository;)V", "retrySending", "Ldev/octoshrimpy/quik/interactor/RetrySending;", "getRetrySending", "()Ldev/octoshrimpy/quik/interactor/RetrySending;", "setRetrySending", "(Ldev/octoshrimpy/quik/interactor/RetrySending;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "data_noAnalyticsRelease"})
public final class SendSmsReceiver extends android.content.BroadcastReceiver {
    @javax.inject.Inject
    public dev.octoshrimpy.quik.repository.MessageRepository messageRepo;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.interactor.RetrySending retrySending;
    
    public SendSmsReceiver() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.repository.MessageRepository getMessageRepo() {
        return null;
    }
    
    public final void setMessageRepo(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.MessageRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.interactor.RetrySending getRetrySending() {
        return null;
    }
    
    public final void setRetrySending(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.interactor.RetrySending p0) {
    }
    
    @java.lang.Override
    public void onReceive(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.content.Intent intent) {
    }
}