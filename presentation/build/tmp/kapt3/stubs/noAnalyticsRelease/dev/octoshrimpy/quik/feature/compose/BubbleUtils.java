package dev.octoshrimpy.quik.feature.compose;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\bJ&\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Ldev/octoshrimpy/quik/feature/compose/BubbleUtils;", "", "()V", "TIMESTAMP_THRESHOLD", "", "canGroup", "", "message", "Ldev/octoshrimpy/quik/model/Message;", "other", "getBubble", "emojiOnly", "canGroupWithPrevious", "canGroupWithNext", "isMe", "presentation_noAnalyticsRelease"})
public final class BubbleUtils {
    @org.jetbrains.annotations.NotNull
    public static final dev.octoshrimpy.quik.feature.compose.BubbleUtils INSTANCE = null;
    public static final int TIMESTAMP_THRESHOLD = 10;
    
    private BubbleUtils() {
        super();
    }
    
    public final boolean canGroup(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.model.Message message, @org.jetbrains.annotations.Nullable
    dev.octoshrimpy.quik.model.Message other) {
        return false;
    }
    
    public final int getBubble(boolean emojiOnly, boolean canGroupWithPrevious, boolean canGroupWithNext, boolean isMe) {
        return 0;
    }
}