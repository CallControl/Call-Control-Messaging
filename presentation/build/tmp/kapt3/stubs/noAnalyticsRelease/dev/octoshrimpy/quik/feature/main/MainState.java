package dev.octoshrimpy.quik.feature.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\nH\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003Jm\u0010\'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010(\u001a\u00020\u00032\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010*\u001a\u00020+H\u00d6\u0001J\t\u0010,\u001a\u00020-H\u00d6\u0001R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011\u00a8\u0006."}, d2 = {"Ldev/octoshrimpy/quik/feature/main/MainState;", "", "hasError", "", "page", "Ldev/octoshrimpy/quik/feature/main/MainPage;", "drawerOpen", "upgraded", "showRating", "syncing", "Ldev/octoshrimpy/quik/repository/SyncRepository$SyncProgress;", "defaultSms", "smsPermission", "contactPermission", "notificationPermission", "(ZLdev/octoshrimpy/quik/feature/main/MainPage;ZZZLdev/octoshrimpy/quik/repository/SyncRepository$SyncProgress;ZZZZ)V", "getContactPermission", "()Z", "getDefaultSms", "getDrawerOpen", "getHasError", "getNotificationPermission", "getPage", "()Ldev/octoshrimpy/quik/feature/main/MainPage;", "getShowRating", "getSmsPermission", "getSyncing", "()Ldev/octoshrimpy/quik/repository/SyncRepository$SyncProgress;", "getUpgraded", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "", "presentation_noAnalyticsRelease"})
public final class MainState {
    private final boolean hasError = false;
    @org.jetbrains.annotations.NotNull
    private final dev.octoshrimpy.quik.feature.main.MainPage page = null;
    private final boolean drawerOpen = false;
    private final boolean upgraded = false;
    private final boolean showRating = false;
    @org.jetbrains.annotations.NotNull
    private final dev.octoshrimpy.quik.repository.SyncRepository.SyncProgress syncing = null;
    private final boolean defaultSms = false;
    private final boolean smsPermission = false;
    private final boolean contactPermission = false;
    private final boolean notificationPermission = false;
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.feature.main.MainState copy(boolean hasError, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.main.MainPage page, boolean drawerOpen, boolean upgraded, boolean showRating, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.SyncRepository.SyncProgress syncing, boolean defaultSms, boolean smsPermission, boolean contactPermission, boolean notificationPermission) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public MainState() {
        super();
    }
    
    public MainState(boolean hasError, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.main.MainPage page, boolean drawerOpen, boolean upgraded, boolean showRating, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.SyncRepository.SyncProgress syncing, boolean defaultSms, boolean smsPermission, boolean contactPermission, boolean notificationPermission) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final boolean getHasError() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.feature.main.MainPage component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.feature.main.MainPage getPage() {
        return null;
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean getDrawerOpen() {
        return false;
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final boolean getUpgraded() {
        return false;
    }
    
    public final boolean component5() {
        return false;
    }
    
    public final boolean getShowRating() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.repository.SyncRepository.SyncProgress component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.repository.SyncRepository.SyncProgress getSyncing() {
        return null;
    }
    
    public final boolean component7() {
        return false;
    }
    
    public final boolean getDefaultSms() {
        return false;
    }
    
    public final boolean component8() {
        return false;
    }
    
    public final boolean getSmsPermission() {
        return false;
    }
    
    public final boolean component9() {
        return false;
    }
    
    public final boolean getContactPermission() {
        return false;
    }
    
    public final boolean component10() {
        return false;
    }
    
    public final boolean getNotificationPermission() {
        return false;
    }
}