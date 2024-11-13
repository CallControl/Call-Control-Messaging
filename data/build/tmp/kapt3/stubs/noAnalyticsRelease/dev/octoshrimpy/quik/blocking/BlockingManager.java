package dev.octoshrimpy.quik.blocking;

import java.lang.System;

/**
 * Delegates requests to the active blocking client
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0016\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001c\u001a\u00020\u0014H\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001c\u001a\u00020\u0014H\u0016J\u0016\u0010 \u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u00018BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Ldev/octoshrimpy/quik/blocking/BlockingManager;", "Ldev/octoshrimpy/quik/blocking/BlockingClient;", "prefs", "Ldev/octoshrimpy/quik/util/Preferences;", "callBlockerBlockingClient", "Ldev/octoshrimpy/quik/blocking/CallBlockerBlockingClient;", "callControlBlockingClient", "Ldev/octoshrimpy/quik/blocking/CallControlBlockingClient;", "qksmsBlockingClient", "Ldev/octoshrimpy/quik/blocking/QksmsBlockingClient;", "shouldIAnswerBlockingClient", "Ldev/octoshrimpy/quik/blocking/ShouldIAnswerBlockingClient;", "(Ldev/octoshrimpy/quik/util/Preferences;Ldev/octoshrimpy/quik/blocking/CallBlockerBlockingClient;Ldev/octoshrimpy/quik/blocking/CallControlBlockingClient;Ldev/octoshrimpy/quik/blocking/QksmsBlockingClient;Ldev/octoshrimpy/quik/blocking/ShouldIAnswerBlockingClient;)V", "client", "getClient", "()Ldev/octoshrimpy/quik/blocking/BlockingClient;", "block", "Lio/reactivex/Completable;", "addresses", "", "", "getClientCapability", "Ldev/octoshrimpy/quik/blocking/BlockingClient$Capability;", "isAvailable", "", "isBlacklisted", "Lio/reactivex/Single;", "Ldev/octoshrimpy/quik/blocking/BlockingClient$Action;", "address", "openSettings", "", "shouldBlock", "unblock", "data_noAnalyticsRelease"})
@javax.inject.Singleton
public final class BlockingManager implements dev.octoshrimpy.quik.blocking.BlockingClient {
    private final dev.octoshrimpy.quik.util.Preferences prefs = null;
    private final dev.octoshrimpy.quik.blocking.CallBlockerBlockingClient callBlockerBlockingClient = null;
    private final dev.octoshrimpy.quik.blocking.CallControlBlockingClient callControlBlockingClient = null;
    private final dev.octoshrimpy.quik.blocking.QksmsBlockingClient qksmsBlockingClient = null;
    private final dev.octoshrimpy.quik.blocking.ShouldIAnswerBlockingClient shouldIAnswerBlockingClient = null;
    
    @javax.inject.Inject
    public BlockingManager(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.util.Preferences prefs, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.blocking.CallBlockerBlockingClient callBlockerBlockingClient, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.blocking.CallControlBlockingClient callControlBlockingClient, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.blocking.QksmsBlockingClient qksmsBlockingClient, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.blocking.ShouldIAnswerBlockingClient shouldIAnswerBlockingClient) {
        super();
    }
    
    private final dev.octoshrimpy.quik.blocking.BlockingClient getClient() {
        return null;
    }
    
    @java.lang.Override
    public boolean isAvailable() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dev.octoshrimpy.quik.blocking.BlockingClient.Capability getClientCapability() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Single<dev.octoshrimpy.quik.blocking.BlockingClient.Action> shouldBlock(@org.jetbrains.annotations.NotNull
    java.lang.String address) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Single<dev.octoshrimpy.quik.blocking.BlockingClient.Action> isBlacklisted(@org.jetbrains.annotations.NotNull
    java.lang.String address) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Completable block(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> addresses) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.Completable unblock(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> addresses) {
        return null;
    }
    
    @java.lang.Override
    public void openSettings() {
    }
}