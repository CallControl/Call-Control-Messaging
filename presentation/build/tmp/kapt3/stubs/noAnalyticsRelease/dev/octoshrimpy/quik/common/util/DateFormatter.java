package dev.octoshrimpy.quik.common.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH\u0002J\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0012"}, d2 = {"Ldev/octoshrimpy/quik/common/util/DateFormatter;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "getConversationTimestamp", "", "date", "", "getDetailedTimestamp", "getFormatter", "Ljava/text/SimpleDateFormat;", "pattern", "getMessageTimestamp", "getScheduledTimestamp", "getTimestamp", "presentation_noAnalyticsRelease"})
@javax.inject.Singleton
public final class DateFormatter {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    
    @javax.inject.Inject
    public DateFormatter(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getContext() {
        return null;
    }
    
    /**
     * Formats the [pattern] correctly for the current locale, and replaces 12 hour format with
     * 24 hour format if necessary
     */
    private final java.text.SimpleDateFormat getFormatter(java.lang.String pattern) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDetailedTimestamp(long date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTimestamp(long date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMessageTimestamp(long date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getConversationTimestamp(long date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getScheduledTimestamp(long date) {
        return null;
    }
}