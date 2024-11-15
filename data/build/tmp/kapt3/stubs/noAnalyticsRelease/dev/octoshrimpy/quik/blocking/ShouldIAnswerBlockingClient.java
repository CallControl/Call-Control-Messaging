package dev.octoshrimpy.quik.blocking;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u00172\u00020\u0001:\u0003\u0016\u0017\u0018B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\tH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u0016\u0010\u0015\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Ldev/octoshrimpy/quik/blocking/ShouldIAnswerBlockingClient;", "Ldev/octoshrimpy/quik/blocking/BlockingClient;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "block", "Lio/reactivex/Completable;", "addresses", "", "", "getClientCapability", "Ldev/octoshrimpy/quik/blocking/BlockingClient$Capability;", "isAvailable", "", "isBlacklisted", "Lio/reactivex/Single;", "Ldev/octoshrimpy/quik/blocking/BlockingClient$Action;", "address", "openSettings", "", "shouldBlock", "unblock", "Binder", "Companion", "IncomingHandler", "data_noAnalyticsRelease"})
public final class ShouldIAnswerBlockingClient implements dev.octoshrimpy.quik.blocking.BlockingClient {
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    public static final dev.octoshrimpy.quik.blocking.ShouldIAnswerBlockingClient.Companion Companion = null;
    public static final int RATING_UNKNOWN = 0;
    public static final int RATING_POSITIVE = 1;
    public static final int RATING_NEGATIVE = 2;
    public static final int RATING_NEUTRAL = 3;
    public static final int GET_NUMBER_RATING = 1;
    
    @javax.inject.Inject
    public ShouldIAnswerBlockingClient(@org.jetbrains.annotations.NotNull
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
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000eJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Ldev/octoshrimpy/quik/blocking/ShouldIAnswerBlockingClient$Binder;", "Landroid/content/ServiceConnection;", "context", "Landroid/content/Context;", "address", "", "(Landroid/content/Context;Ljava/lang/String;)V", "isBound", "", "serviceMessenger", "Landroid/os/Messenger;", "subject", "Lio/reactivex/subjects/SingleSubject;", "isBlocked", "Lio/reactivex/Single;", "onServiceConnected", "", "className", "Landroid/content/ComponentName;", "service", "Landroid/os/IBinder;", "onServiceDisconnected", "data_noAnalyticsRelease"})
    static final class Binder implements android.content.ServiceConnection {
        private final android.content.Context context = null;
        private final java.lang.String address = null;
        private final io.reactivex.subjects.SingleSubject<java.lang.Boolean> subject = null;
        private android.os.Messenger serviceMessenger;
        private boolean isBound = false;
        
        public Binder(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        java.lang.String address) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final io.reactivex.Single<java.lang.Boolean> isBlocked() {
            return null;
        }
        
        @java.lang.Override
        public void onServiceConnected(@org.jetbrains.annotations.NotNull
        android.content.ComponentName className, @org.jetbrains.annotations.NotNull
        android.os.IBinder service) {
        }
        
        @java.lang.Override
        public void onServiceDisconnected(@org.jetbrains.annotations.NotNull
        android.content.ComponentName className) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\rB(\u0012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016R)\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Ldev/octoshrimpy/quik/blocking/ShouldIAnswerBlockingClient$IncomingHandler;", "Landroid/os/Handler;", "callback", "Lkotlin/Function1;", "Ldev/octoshrimpy/quik/blocking/ShouldIAnswerBlockingClient$IncomingHandler$Response;", "Lkotlin/ParameterName;", "name", "response", "", "(Lkotlin/jvm/functions/Function1;)V", "handleMessage", "msg", "Landroid/os/Message;", "Response", "data_noAnalyticsRelease"})
    static final class IncomingHandler extends android.os.Handler {
        private final kotlin.jvm.functions.Function1<dev.octoshrimpy.quik.blocking.ShouldIAnswerBlockingClient.IncomingHandler.Response, kotlin.Unit> callback = null;
        
        public IncomingHandler(@org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function1<? super dev.octoshrimpy.quik.blocking.ShouldIAnswerBlockingClient.IncomingHandler.Response, kotlin.Unit> callback) {
            super();
        }
        
        @java.lang.Override
        public void handleMessage(@org.jetbrains.annotations.NotNull
        android.os.Message msg) {
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Ldev/octoshrimpy/quik/blocking/ShouldIAnswerBlockingClient$IncomingHandler$Response;", "", "bundle", "Landroid/os/Bundle;", "(Landroid/os/Bundle;)V", "rating", "", "getRating", "()I", "wantBlock", "", "getWantBlock", "()Z", "data_noAnalyticsRelease"})
        public static final class Response {
            private final int rating = 0;
            private final boolean wantBlock = false;
            
            public Response(@org.jetbrains.annotations.NotNull
            android.os.Bundle bundle) {
                super();
            }
            
            public final int getRating() {
                return 0;
            }
            
            public final boolean getWantBlock() {
                return false;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Ldev/octoshrimpy/quik/blocking/ShouldIAnswerBlockingClient$Companion;", "", "()V", "GET_NUMBER_RATING", "", "RATING_NEGATIVE", "RATING_NEUTRAL", "RATING_POSITIVE", "RATING_UNKNOWN", "data_noAnalyticsRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}