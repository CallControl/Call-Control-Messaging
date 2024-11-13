package dev.octoshrimpy.quik.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0017"}, d2 = {"Ldev/octoshrimpy/quik/service/HeadlessSmsSendService;", "Landroid/app/IntentService;", "()V", "conversationRepo", "Ldev/octoshrimpy/quik/repository/ConversationRepository;", "getConversationRepo", "()Ldev/octoshrimpy/quik/repository/ConversationRepository;", "setConversationRepo", "(Ldev/octoshrimpy/quik/repository/ConversationRepository;)V", "sendMessage", "Ldev/octoshrimpy/quik/interactor/SendMessage;", "getSendMessage", "()Ldev/octoshrimpy/quik/interactor/SendMessage;", "setSendMessage", "(Ldev/octoshrimpy/quik/interactor/SendMessage;)V", "getRecipients", "", "uri", "Landroid/net/Uri;", "onHandleIntent", "", "intent", "Landroid/content/Intent;", "data_noAnalyticsRelease"})
public final class HeadlessSmsSendService extends android.app.IntentService {
    @javax.inject.Inject
    public dev.octoshrimpy.quik.repository.ConversationRepository conversationRepo;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.interactor.SendMessage sendMessage;
    
    public HeadlessSmsSendService() {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.repository.ConversationRepository getConversationRepo() {
        return null;
    }
    
    public final void setConversationRepo(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.ConversationRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.interactor.SendMessage getSendMessage() {
        return null;
    }
    
    public final void setSendMessage(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.interactor.SendMessage p0) {
    }
    
    @java.lang.Override
    protected void onHandleIntent(@org.jetbrains.annotations.Nullable
    android.content.Intent intent) {
    }
    
    private final java.lang.String getRecipients(android.net.Uri uri) {
        return null;
    }
}