package dev.octoshrimpy.quik.blocking;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\tH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u0016\u0010\u0015\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Ldev/octoshrimpy/quik/blocking/QksmsBlockingClient;", "Ldev/octoshrimpy/quik/blocking/BlockingClient;", "blockingRepo", "Ldev/octoshrimpy/quik/repository/BlockingRepository;", "(Ldev/octoshrimpy/quik/repository/BlockingRepository;)V", "block", "Lio/reactivex/Completable;", "addresses", "", "", "getClientCapability", "Ldev/octoshrimpy/quik/blocking/BlockingClient$Capability;", "isAvailable", "", "isBlacklisted", "Lio/reactivex/Single;", "Ldev/octoshrimpy/quik/blocking/BlockingClient$Action;", "address", "openSettings", "", "shouldBlock", "unblock", "data_noAnalyticsRelease"})
public final class QksmsBlockingClient implements dev.octoshrimpy.quik.blocking.BlockingClient {
    private final dev.octoshrimpy.quik.repository.BlockingRepository blockingRepo = null;
    
    @javax.inject.Inject
    public QksmsBlockingClient(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.BlockingRepository blockingRepo) {
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