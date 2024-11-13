package dev.octoshrimpy.quik.manager;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0006"}, d2 = {"Ldev/octoshrimpy/quik/manager/WidgetManager;", "", "updateTheme", "", "updateUnreadCount", "Companion", "domain_release"})
public abstract interface WidgetManager {
    @org.jetbrains.annotations.NotNull
    public static final dev.octoshrimpy.quik.manager.WidgetManager.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ACTION_NOTIFY_DATASET_CHANGED = "dev.octoshrimpy.quik.intent.action.ACTION_NOTIFY_DATASET_CHANGED";
    
    public abstract void updateUnreadCount();
    
    public abstract void updateTheme();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Ldev/octoshrimpy/quik/manager/WidgetManager$Companion;", "", "()V", "ACTION_NOTIFY_DATASET_CHANGED", "", "domain_release"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String ACTION_NOTIFY_DATASET_CHANGED = "dev.octoshrimpy.quik.intent.action.ACTION_NOTIFY_DATASET_CHANGED";
        
        private Companion() {
            super();
        }
    }
}