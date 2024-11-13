package dev.octoshrimpy.quik.feature.notificationprefs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b-\b\u0086\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0013J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0005H\u00c6\u0003J\t\u0010(\u001a\u00020\u0007H\u00c6\u0003J\t\u0010)\u001a\u00020\u0007H\u00c6\u0003J\t\u0010*\u001a\u00020\u0005H\u00c6\u0003J\t\u0010+\u001a\u00020\u0007H\u00c6\u0003J\t\u0010,\u001a\u00020\u0005H\u00c6\u0003J\t\u0010-\u001a\u00020\nH\u00c6\u0003J\t\u0010.\u001a\u00020\u0007H\u00c6\u0003J\t\u0010/\u001a\u00020\u0005H\u00c6\u0003J\t\u00100\u001a\u00020\u0005H\u00c6\u0003J\t\u00101\u001a\u00020\u0005H\u00c6\u0003J\u008b\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u0007H\u00c6\u0001J\u0013\u00103\u001a\u00020\u00072\b\u00104\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00105\u001a\u00020\nH\u00d6\u0001J\t\u00106\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\r\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\u0011\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\u0012\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0011\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000f\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001a\u00a8\u00067"}, d2 = {"Ldev/octoshrimpy/quik/feature/notificationprefs/NotificationPrefsState;", "", "threadId", "", "conversationTitle", "", "notificationsEnabled", "", "previewSummary", "previewId", "", "wakeEnabled", "action1Summary", "action2Summary", "action3Summary", "vibrationEnabled", "ringtoneName", "qkReplyEnabled", "qkReplyTapDismiss", "(JLjava/lang/String;ZLjava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZ)V", "getAction1Summary", "()Ljava/lang/String;", "getAction2Summary", "getAction3Summary", "getConversationTitle", "getNotificationsEnabled", "()Z", "getPreviewId", "()I", "getPreviewSummary", "getQkReplyEnabled", "getQkReplyTapDismiss", "getRingtoneName", "getThreadId", "()J", "getVibrationEnabled", "getWakeEnabled", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "presentation_noAnalyticsRelease"})
public final class NotificationPrefsState {
    private final long threadId = 0L;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String conversationTitle = null;
    private final boolean notificationsEnabled = false;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String previewSummary = null;
    private final int previewId = 0;
    private final boolean wakeEnabled = false;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String action1Summary = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String action2Summary = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String action3Summary = null;
    private final boolean vibrationEnabled = false;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ringtoneName = null;
    private final boolean qkReplyEnabled = false;
    private final boolean qkReplyTapDismiss = false;
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.feature.notificationprefs.NotificationPrefsState copy(long threadId, @org.jetbrains.annotations.NotNull
    java.lang.String conversationTitle, boolean notificationsEnabled, @org.jetbrains.annotations.NotNull
    java.lang.String previewSummary, int previewId, boolean wakeEnabled, @org.jetbrains.annotations.NotNull
    java.lang.String action1Summary, @org.jetbrains.annotations.NotNull
    java.lang.String action2Summary, @org.jetbrains.annotations.NotNull
    java.lang.String action3Summary, boolean vibrationEnabled, @org.jetbrains.annotations.NotNull
    java.lang.String ringtoneName, boolean qkReplyEnabled, boolean qkReplyTapDismiss) {
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
    
    public NotificationPrefsState() {
        super();
    }
    
    public NotificationPrefsState(long threadId, @org.jetbrains.annotations.NotNull
    java.lang.String conversationTitle, boolean notificationsEnabled, @org.jetbrains.annotations.NotNull
    java.lang.String previewSummary, int previewId, boolean wakeEnabled, @org.jetbrains.annotations.NotNull
    java.lang.String action1Summary, @org.jetbrains.annotations.NotNull
    java.lang.String action2Summary, @org.jetbrains.annotations.NotNull
    java.lang.String action3Summary, boolean vibrationEnabled, @org.jetbrains.annotations.NotNull
    java.lang.String ringtoneName, boolean qkReplyEnabled, boolean qkReplyTapDismiss) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getThreadId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getConversationTitle() {
        return null;
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean getNotificationsEnabled() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPreviewSummary() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getPreviewId() {
        return 0;
    }
    
    public final boolean component6() {
        return false;
    }
    
    public final boolean getWakeEnabled() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAction1Summary() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAction2Summary() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAction3Summary() {
        return null;
    }
    
    public final boolean component10() {
        return false;
    }
    
    public final boolean getVibrationEnabled() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRingtoneName() {
        return null;
    }
    
    public final boolean component12() {
        return false;
    }
    
    public final boolean getQkReplyEnabled() {
        return false;
    }
    
    public final boolean component13() {
        return false;
    }
    
    public final boolean getQkReplyTapDismiss() {
        return false;
    }
}