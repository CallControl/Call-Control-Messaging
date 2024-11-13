package dev.octoshrimpy.quik.blocking;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0002\u0013\u0014J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u0006H&J\b\u0010\u000f\u001a\u00020\u0010H&J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u0006H&J\u0016\u0010\u0012\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&\u00a8\u0006\u0015"}, d2 = {"Ldev/octoshrimpy/quik/blocking/BlockingClient;", "", "block", "Lio/reactivex/Completable;", "addresses", "", "", "getClientCapability", "Ldev/octoshrimpy/quik/blocking/BlockingClient$Capability;", "isAvailable", "", "isBlacklisted", "Lio/reactivex/Single;", "Ldev/octoshrimpy/quik/blocking/BlockingClient$Action;", "address", "openSettings", "", "shouldBlock", "unblock", "Action", "Capability", "domain_release"})
public abstract interface BlockingClient {
    
    /**
     * Returns true if the target blocking client is available for use, ie. it is installed
     */
    public abstract boolean isAvailable();
    
    /**
     * Returns the level of access that the given blocking client provides to QKSMS
     */
    @org.jetbrains.annotations.NotNull
    public abstract dev.octoshrimpy.quik.blocking.BlockingClient.Capability getClientCapability();
    
    /**
     * Returns the recommendation action to perform given a message from the [address]
     */
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<dev.octoshrimpy.quik.blocking.BlockingClient.Action> shouldBlock(@org.jetbrains.annotations.NotNull
    java.lang.String address);
    
    /**
     * Returns whether or not the [address] is in the blocking manager's blacklist
     * In most cases this will return the same result as [shouldBlock], but it's possible for an app's blacklist
     * to be temporarily deactivated, in which case the results will differ
     */
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<dev.octoshrimpy.quik.blocking.BlockingClient.Action> isBlacklisted(@org.jetbrains.annotations.NotNull
    java.lang.String address);
    
    /**
     * Blocks the numbers or opens the manager
     */
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Completable block(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> addresses);
    
    /**
     * Unblocks the numbers or opens the manager
     */
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Completable unblock(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> addresses);
    
    /**
     * Opens the settings page for the blocking manager
     */
    public abstract void openSettings();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Ldev/octoshrimpy/quik/blocking/BlockingClient$Capability;", "", "(Ljava/lang/String;I)V", "BLOCK_WITHOUT_PERMISSION", "BLOCK_WITH_PERMISSION", "CANT_BLOCK", "domain_release"})
    public static enum Capability {
        /*public static final*/ BLOCK_WITHOUT_PERMISSION /* = new BLOCK_WITHOUT_PERMISSION() */,
        /*public static final*/ BLOCK_WITH_PERMISSION /* = new BLOCK_WITH_PERMISSION() */,
        /*public static final*/ CANT_BLOCK /* = new CANT_BLOCK() */;
        
        Capability() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0005\u0006\u0007B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u0082\u0001\u0003\b\t\n\u00a8\u0006\u000b"}, d2 = {"Ldev/octoshrimpy/quik/blocking/BlockingClient$Action;", "", "()V", "toString", "", "Block", "DoNothing", "Unblock", "Ldev/octoshrimpy/quik/blocking/BlockingClient$Action$Block;", "Ldev/octoshrimpy/quik/blocking/BlockingClient$Action$DoNothing;", "Ldev/octoshrimpy/quik/blocking/BlockingClient$Action$Unblock;", "domain_release"})
    public static abstract class Action {
        
        private Action() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Ldev/octoshrimpy/quik/blocking/BlockingClient$Action$Block;", "Ldev/octoshrimpy/quik/blocking/BlockingClient$Action;", "reason", "", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "domain_release"})
        public static final class Block extends dev.octoshrimpy.quik.blocking.BlockingClient.Action {
            @org.jetbrains.annotations.Nullable
            private final java.lang.String reason = null;
            
            public Block() {
                super();
            }
            
            public Block(@org.jetbrains.annotations.Nullable
            java.lang.String reason) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.String getReason() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldev/octoshrimpy/quik/blocking/BlockingClient$Action$Unblock;", "Ldev/octoshrimpy/quik/blocking/BlockingClient$Action;", "()V", "domain_release"})
        public static final class Unblock extends dev.octoshrimpy.quik.blocking.BlockingClient.Action {
            @org.jetbrains.annotations.NotNull
            public static final dev.octoshrimpy.quik.blocking.BlockingClient.Action.Unblock INSTANCE = null;
            
            private Unblock() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldev/octoshrimpy/quik/blocking/BlockingClient$Action$DoNothing;", "Ldev/octoshrimpy/quik/blocking/BlockingClient$Action;", "()V", "domain_release"})
        public static final class DoNothing extends dev.octoshrimpy.quik.blocking.BlockingClient.Action {
            @org.jetbrains.annotations.NotNull
            public static final dev.octoshrimpy.quik.blocking.BlockingClient.Action.DoNothing INSTANCE = null;
            
            private DoNothing() {
                super();
            }
        }
    }
}