package dev.octoshrimpy.quik.feature.settings;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b;\b\u0086\b\u0018\u00002\u00020\u0001B\u00f5\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\n\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u0012\b\b\u0002\u0010\u0016\u001a\u00020\n\u0012\b\b\u0002\u0010\u0017\u001a\u00020\n\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\n\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001d\u00a2\u0006\u0002\u0010\u001eJ\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\t\u0010<\u001a\u00020\u0005H\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\nH\u00c6\u0003J\t\u0010?\u001a\u00020\u0005H\u00c6\u0003J\t\u0010@\u001a\u00020\u0005H\u00c6\u0003J\t\u0010A\u001a\u00020\u0003H\u00c6\u0003J\t\u0010B\u001a\u00020\nH\u00c6\u0003J\t\u0010C\u001a\u00020\nH\u00c6\u0003J\t\u0010D\u001a\u00020\nH\u00c6\u0003J\t\u0010E\u001a\u00020\nH\u00c6\u0003J\t\u0010F\u001a\u00020\u0005H\u00c6\u0003J\t\u0010G\u001a\u00020\u0003H\u00c6\u0003J\t\u0010H\u001a\u00020\nH\u00c6\u0003J\t\u0010I\u001a\u00020\u0005H\u00c6\u0003J\t\u0010J\u001a\u00020\u0003H\u00c6\u0003J\t\u0010K\u001a\u00020\u001dH\u00c6\u0003J\t\u0010L\u001a\u00020\u0003H\u00c6\u0003J\t\u0010M\u001a\u00020\u0005H\u00c6\u0003J\t\u0010N\u001a\u00020\u0005H\u00c6\u0003J\t\u0010O\u001a\u00020\nH\u00c6\u0003J\t\u0010P\u001a\u00020\nH\u00c6\u0003J\t\u0010Q\u001a\u00020\nH\u00c6\u0003J\t\u0010R\u001a\u00020\nH\u00c6\u0003J\u00f9\u0001\u0010S\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u00c6\u0001J\u0013\u0010T\u001a\u00020\n2\b\u0010U\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010V\u001a\u00020\u0003H\u00d6\u0001J\t\u0010W\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0018\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\f\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0011\u0010\u0010\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0011\u0010\u0019\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0011\u0010\u001b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\"R\u0011\u0010\u001a\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0017\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010)R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\"R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010)R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010)R\u0011\u0010\r\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010 R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\"R\u0011\u0010\u000e\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010)R\u0011\u0010\u0011\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010)R\u0011\u0010\u0015\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010 R\u0011\u0010\u0016\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010 R\u0011\u0010\u001c\u001a\u00020\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u0014\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010 R\u0011\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010\"R\u0011\u0010\u0012\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010)R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010\"\u00a8\u0006X"}, d2 = {"Ldev/octoshrimpy/quik/feature/settings/SettingsState;", "", "theme", "", "nightModeSummary", "", "nightModeId", "nightStart", "nightEnd", "black", "", "autoColor", "autoEmojiEnabled", "notificationsEnabled", "sendDelaySummary", "sendDelayId", "deliveryEnabled", "signature", "textSizeSummary", "textSizeId", "systemFontEnabled", "splitSmsEnabled", "stripUnicodeEnabled", "mobileOnly", "autoDelete", "longAsMms", "maxMmsSizeSummary", "maxMmsSizeId", "syncProgress", "Ldev/octoshrimpy/quik/repository/SyncRepository$SyncProgress;", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;IZLjava/lang/String;Ljava/lang/String;IZZZZIZLjava/lang/String;ILdev/octoshrimpy/quik/repository/SyncRepository$SyncProgress;)V", "getAutoColor", "()Z", "getAutoDelete", "()I", "getAutoEmojiEnabled", "getBlack", "getDeliveryEnabled", "getLongAsMms", "getMaxMmsSizeId", "getMaxMmsSizeSummary", "()Ljava/lang/String;", "getMobileOnly", "getNightEnd", "getNightModeId", "getNightModeSummary", "getNightStart", "getNotificationsEnabled", "getSendDelayId", "getSendDelaySummary", "getSignature", "getSplitSmsEnabled", "getStripUnicodeEnabled", "getSyncProgress", "()Ldev/octoshrimpy/quik/repository/SyncRepository$SyncProgress;", "getSystemFontEnabled", "getTextSizeId", "getTextSizeSummary", "getTheme", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "presentation_noAnalyticsRelease"})
public final class SettingsState {
    private final int theme = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String nightModeSummary = null;
    private final int nightModeId = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String nightStart = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String nightEnd = null;
    private final boolean black = false;
    private final boolean autoColor = false;
    private final boolean autoEmojiEnabled = false;
    private final boolean notificationsEnabled = false;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String sendDelaySummary = null;
    private final int sendDelayId = 0;
    private final boolean deliveryEnabled = false;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String signature = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String textSizeSummary = null;
    private final int textSizeId = 0;
    private final boolean systemFontEnabled = false;
    private final boolean splitSmsEnabled = false;
    private final boolean stripUnicodeEnabled = false;
    private final boolean mobileOnly = false;
    private final int autoDelete = 0;
    private final boolean longAsMms = false;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String maxMmsSizeSummary = null;
    private final int maxMmsSizeId = 0;
    @org.jetbrains.annotations.NotNull
    private final dev.octoshrimpy.quik.repository.SyncRepository.SyncProgress syncProgress = null;
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.feature.settings.SettingsState copy(int theme, @org.jetbrains.annotations.NotNull
    java.lang.String nightModeSummary, int nightModeId, @org.jetbrains.annotations.NotNull
    java.lang.String nightStart, @org.jetbrains.annotations.NotNull
    java.lang.String nightEnd, boolean black, boolean autoColor, boolean autoEmojiEnabled, boolean notificationsEnabled, @org.jetbrains.annotations.NotNull
    java.lang.String sendDelaySummary, int sendDelayId, boolean deliveryEnabled, @org.jetbrains.annotations.NotNull
    java.lang.String signature, @org.jetbrains.annotations.NotNull
    java.lang.String textSizeSummary, int textSizeId, boolean systemFontEnabled, boolean splitSmsEnabled, boolean stripUnicodeEnabled, boolean mobileOnly, int autoDelete, boolean longAsMms, @org.jetbrains.annotations.NotNull
    java.lang.String maxMmsSizeSummary, int maxMmsSizeId, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.SyncRepository.SyncProgress syncProgress) {
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
    
    public SettingsState() {
        super();
    }
    
    public SettingsState(int theme, @org.jetbrains.annotations.NotNull
    java.lang.String nightModeSummary, int nightModeId, @org.jetbrains.annotations.NotNull
    java.lang.String nightStart, @org.jetbrains.annotations.NotNull
    java.lang.String nightEnd, boolean black, boolean autoColor, boolean autoEmojiEnabled, boolean notificationsEnabled, @org.jetbrains.annotations.NotNull
    java.lang.String sendDelaySummary, int sendDelayId, boolean deliveryEnabled, @org.jetbrains.annotations.NotNull
    java.lang.String signature, @org.jetbrains.annotations.NotNull
    java.lang.String textSizeSummary, int textSizeId, boolean systemFontEnabled, boolean splitSmsEnabled, boolean stripUnicodeEnabled, boolean mobileOnly, int autoDelete, boolean longAsMms, @org.jetbrains.annotations.NotNull
    java.lang.String maxMmsSizeSummary, int maxMmsSizeId, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.SyncRepository.SyncProgress syncProgress) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getTheme() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNightModeSummary() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getNightModeId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNightStart() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNightEnd() {
        return null;
    }
    
    public final boolean component6() {
        return false;
    }
    
    public final boolean getBlack() {
        return false;
    }
    
    public final boolean component7() {
        return false;
    }
    
    public final boolean getAutoColor() {
        return false;
    }
    
    public final boolean component8() {
        return false;
    }
    
    public final boolean getAutoEmojiEnabled() {
        return false;
    }
    
    public final boolean component9() {
        return false;
    }
    
    public final boolean getNotificationsEnabled() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSendDelaySummary() {
        return null;
    }
    
    public final int component11() {
        return 0;
    }
    
    public final int getSendDelayId() {
        return 0;
    }
    
    public final boolean component12() {
        return false;
    }
    
    public final boolean getDeliveryEnabled() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSignature() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTextSizeSummary() {
        return null;
    }
    
    public final int component15() {
        return 0;
    }
    
    public final int getTextSizeId() {
        return 0;
    }
    
    public final boolean component16() {
        return false;
    }
    
    public final boolean getSystemFontEnabled() {
        return false;
    }
    
    public final boolean component17() {
        return false;
    }
    
    public final boolean getSplitSmsEnabled() {
        return false;
    }
    
    public final boolean component18() {
        return false;
    }
    
    public final boolean getStripUnicodeEnabled() {
        return false;
    }
    
    public final boolean component19() {
        return false;
    }
    
    public final boolean getMobileOnly() {
        return false;
    }
    
    public final int component20() {
        return 0;
    }
    
    public final int getAutoDelete() {
        return 0;
    }
    
    public final boolean component21() {
        return false;
    }
    
    public final boolean getLongAsMms() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMaxMmsSizeSummary() {
        return null;
    }
    
    public final int component23() {
        return 0;
    }
    
    public final int getMaxMmsSizeId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.repository.SyncRepository.SyncProgress component24() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.repository.SyncRepository.SyncProgress getSyncProgress() {
        return null;
    }
}