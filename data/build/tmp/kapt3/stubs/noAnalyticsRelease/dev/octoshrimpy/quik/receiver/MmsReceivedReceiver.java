package dev.octoshrimpy.quik.receiver;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u001c\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0012"}, d2 = {"Ldev/octoshrimpy/quik/receiver/MmsReceivedReceiver;", "Lcom/klinker/android/send_message/MmsReceivedReceiver;", "()V", "receiveMms", "Ldev/octoshrimpy/quik/interactor/ReceiveMms;", "getReceiveMms", "()Ldev/octoshrimpy/quik/interactor/ReceiveMms;", "setReceiveMms", "(Ldev/octoshrimpy/quik/interactor/ReceiveMms;)V", "onMessageReceived", "", "messageUri", "Landroid/net/Uri;", "onReceive", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "data_noAnalyticsRelease"})
public final class MmsReceivedReceiver extends com.klinker.android.send_message.MmsReceivedReceiver {
    @javax.inject.Inject
    public dev.octoshrimpy.quik.interactor.ReceiveMms receiveMms;
    
    public MmsReceivedReceiver() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.interactor.ReceiveMms getReceiveMms() {
        return null;
    }
    
    public final void setReceiveMms(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.interactor.ReceiveMms p0) {
    }
    
    @java.lang.Override
    public void onReceive(@org.jetbrains.annotations.Nullable
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.content.Intent intent) {
    }
    
    @java.lang.Override
    protected void onMessageReceived(@org.jetbrains.annotations.Nullable
    android.net.Uri messageUri) {
    }
}