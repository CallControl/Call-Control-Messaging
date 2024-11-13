package dev.octoshrimpy.quik.blocking;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0018B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u0016\u0010\u0017\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Ldev/octoshrimpy/quik/blocking/CallBlockerBlockingClient;", "Ldev/octoshrimpy/quik/blocking/BlockingClient;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "block", "Lio/reactivex/Completable;", "addresses", "", "", "getClientCapability", "Ldev/octoshrimpy/quik/blocking/BlockingClient$Capability;", "isAvailable", "", "isBlacklisted", "Lio/reactivex/Single;", "Ldev/octoshrimpy/quik/blocking/BlockingClient$Action;", "address", "lookup", "reason", "openSettings", "", "shouldBlock", "unblock", "LookupResult", "data_noAnalyticsRelease"})
public final class CallBlockerBlockingClient implements dev.octoshrimpy.quik.blocking.BlockingClient {
    private final android.content.Context context = null;
    
    @javax.inject.Inject
    public CallBlockerBlockingClient(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
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
    
    private final io.reactivex.Single<dev.octoshrimpy.quik.blocking.BlockingClient.Action> lookup(java.lang.String address, java.lang.String reason) {
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
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Ldev/octoshrimpy/quik/blocking/CallBlockerBlockingClient$LookupResult;", "", "cursor", "Landroid/database/Cursor;", "(Landroid/database/Cursor;)V", "blockReason", "", "getBlockReason", "()Ljava/lang/String;", "data_noAnalyticsRelease"})
    public static final class LookupResult {
        @org.jetbrains.annotations.Nullable
        private final java.lang.String blockReason = null;
        
        public LookupResult(@org.jetbrains.annotations.NotNull
        android.database.Cursor cursor) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getBlockReason() {
            return null;
        }
    }
}