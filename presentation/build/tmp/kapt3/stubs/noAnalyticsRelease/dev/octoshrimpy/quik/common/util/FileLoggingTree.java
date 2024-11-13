package dev.octoshrimpy.quik.common.util;

import java.lang.System;

/**
 * Based off Vipin Kumar's FileLoggingTree: https://medium.com/@vicky7230/file-logging-with-timber-4e63a1b86a66
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J*\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Ldev/octoshrimpy/quik/common/util/FileLoggingTree;", "Ltimber/log/Timber$DebugTree;", "prefs", "Ldev/octoshrimpy/quik/util/Preferences;", "(Ldev/octoshrimpy/quik/util/Preferences;)V", "fileLock", "", "log", "", "priority", "", "tag", "", "message", "t", "", "presentation_noAnalyticsRelease"})
@javax.inject.Singleton
public final class FileLoggingTree extends timber.log.Timber.DebugTree {
    private final dev.octoshrimpy.quik.util.Preferences prefs = null;
    private final boolean fileLock = false;
    
    @javax.inject.Inject
    public FileLoggingTree(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.util.Preferences prefs) {
        super();
    }
    
    @java.lang.Override
    protected void log(int priority, @org.jetbrains.annotations.NotNull
    java.lang.String tag, @org.jetbrains.annotations.NotNull
    java.lang.String message, @org.jetbrains.annotations.Nullable
    java.lang.Throwable t) {
    }
}