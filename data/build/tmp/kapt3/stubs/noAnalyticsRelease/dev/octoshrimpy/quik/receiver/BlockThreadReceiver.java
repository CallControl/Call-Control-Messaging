package dev.octoshrimpy.quik.receiver;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006!"}, d2 = {"Ldev/octoshrimpy/quik/receiver/BlockThreadReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "blockingClient", "Ldev/octoshrimpy/quik/blocking/BlockingClient;", "getBlockingClient", "()Ldev/octoshrimpy/quik/blocking/BlockingClient;", "setBlockingClient", "(Ldev/octoshrimpy/quik/blocking/BlockingClient;)V", "conversationRepo", "Ldev/octoshrimpy/quik/repository/ConversationRepository;", "getConversationRepo", "()Ldev/octoshrimpy/quik/repository/ConversationRepository;", "setConversationRepo", "(Ldev/octoshrimpy/quik/repository/ConversationRepository;)V", "markBlocked", "Ldev/octoshrimpy/quik/interactor/MarkBlocked;", "getMarkBlocked", "()Ldev/octoshrimpy/quik/interactor/MarkBlocked;", "setMarkBlocked", "(Ldev/octoshrimpy/quik/interactor/MarkBlocked;)V", "prefs", "Ldev/octoshrimpy/quik/util/Preferences;", "getPrefs", "()Ldev/octoshrimpy/quik/util/Preferences;", "setPrefs", "(Ldev/octoshrimpy/quik/util/Preferences;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "data_noAnalyticsRelease"})
public final class BlockThreadReceiver extends android.content.BroadcastReceiver {
    @javax.inject.Inject
    public dev.octoshrimpy.quik.blocking.BlockingClient blockingClient;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.repository.ConversationRepository conversationRepo;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.interactor.MarkBlocked markBlocked;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.util.Preferences prefs;
    
    public BlockThreadReceiver() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.blocking.BlockingClient getBlockingClient() {
        return null;
    }
    
    public final void setBlockingClient(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.blocking.BlockingClient p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.repository.ConversationRepository getConversationRepo() {
        return null;
    }
    
    public final void setConversationRepo(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.ConversationRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.interactor.MarkBlocked getMarkBlocked() {
        return null;
    }
    
    public final void setMarkBlocked(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.interactor.MarkBlocked p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.util.Preferences getPrefs() {
        return null;
    }
    
    public final void setPrefs(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.util.Preferences p0) {
    }
    
    @java.lang.Override
    public void onReceive(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.content.Intent intent) {
    }
}