package dev.octoshrimpy.quik.receiver;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u0006\'"}, d2 = {"Ldev/octoshrimpy/quik/receiver/RemoteMessagingReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "conversationRepo", "Ldev/octoshrimpy/quik/repository/ConversationRepository;", "getConversationRepo", "()Ldev/octoshrimpy/quik/repository/ConversationRepository;", "setConversationRepo", "(Ldev/octoshrimpy/quik/repository/ConversationRepository;)V", "markRead", "Ldev/octoshrimpy/quik/interactor/MarkRead;", "getMarkRead", "()Ldev/octoshrimpy/quik/interactor/MarkRead;", "setMarkRead", "(Ldev/octoshrimpy/quik/interactor/MarkRead;)V", "messageRepo", "Ldev/octoshrimpy/quik/repository/MessageRepository;", "getMessageRepo", "()Ldev/octoshrimpy/quik/repository/MessageRepository;", "setMessageRepo", "(Ldev/octoshrimpy/quik/repository/MessageRepository;)V", "sendMessage", "Ldev/octoshrimpy/quik/interactor/SendMessage;", "getSendMessage", "()Ldev/octoshrimpy/quik/interactor/SendMessage;", "setSendMessage", "(Ldev/octoshrimpy/quik/interactor/SendMessage;)V", "subscriptionManager", "Ldev/octoshrimpy/quik/compat/SubscriptionManagerCompat;", "getSubscriptionManager", "()Ldev/octoshrimpy/quik/compat/SubscriptionManagerCompat;", "setSubscriptionManager", "(Ldev/octoshrimpy/quik/compat/SubscriptionManagerCompat;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "data_noAnalyticsRelease"})
public final class RemoteMessagingReceiver extends android.content.BroadcastReceiver {
    @javax.inject.Inject
    public dev.octoshrimpy.quik.repository.ConversationRepository conversationRepo;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.interactor.MarkRead markRead;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.repository.MessageRepository messageRepo;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.interactor.SendMessage sendMessage;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.compat.SubscriptionManagerCompat subscriptionManager;
    
    public RemoteMessagingReceiver() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.repository.ConversationRepository getConversationRepo() {
        return null;
    }
    
    public final void setConversationRepo(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.ConversationRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.interactor.MarkRead getMarkRead() {
        return null;
    }
    
    public final void setMarkRead(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.interactor.MarkRead p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.repository.MessageRepository getMessageRepo() {
        return null;
    }
    
    public final void setMessageRepo(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.MessageRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.interactor.SendMessage getSendMessage() {
        return null;
    }
    
    public final void setSendMessage(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.interactor.SendMessage p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.compat.SubscriptionManagerCompat getSubscriptionManager() {
        return null;
    }
    
    public final void setSubscriptionManager(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.compat.SubscriptionManagerCompat p0) {
    }
    
    @java.lang.Override
    public void onReceive(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.content.Intent intent) {
    }
}