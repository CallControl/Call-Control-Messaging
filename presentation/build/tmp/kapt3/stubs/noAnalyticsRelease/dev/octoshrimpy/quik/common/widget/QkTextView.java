package dev.octoshrimpy.quik.common.widget;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J0\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0017H\u0014J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0017H\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001d"}, d2 = {"Ldev/octoshrimpy/quik/common/widget/QkTextView;", "Landroidx/emoji/widget/EmojiAppCompatTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "collapseEnabled", "", "getCollapseEnabled", "()Z", "setCollapseEnabled", "(Z)V", "textViewStyler", "Ldev/octoshrimpy/quik/common/util/TextViewStyler;", "getTextViewStyler", "()Ldev/octoshrimpy/quik/common/util/TextViewStyler;", "setTextViewStyler", "(Ldev/octoshrimpy/quik/common/util/TextViewStyler;)V", "onLayout", "", "changed", "left", "", "top", "right", "bottom", "setTextColor", "color", "presentation_noAnalyticsRelease"})
public class QkTextView extends androidx.emoji.widget.EmojiAppCompatTextView {
    @javax.inject.Inject
    public dev.octoshrimpy.quik.common.util.TextViewStyler textViewStyler;
    
    /**
     * Collapse a multiline list of strings into a single line
     *
     * Ex.
     *
     * Toronto, New York, Los Angeles,
     * Seattle, Portland
     *
     * Will be converted to
     *
     * Toronto, New York, Los Angeles, +2
     */
    private boolean collapseEnabled = false;
    private java.util.HashMap _$_findViewCache;
    
    @kotlin.jvm.JvmOverloads
    public QkTextView(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public QkTextView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.common.util.TextViewStyler getTextViewStyler() {
        return null;
    }
    
    public final void setTextViewStyler(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.util.TextViewStyler p0) {
    }
    
    public final boolean getCollapseEnabled() {
        return false;
    }
    
    public final void setCollapseEnabled(boolean p0) {
    }
    
    @java.lang.Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
    }
    
    @java.lang.Override
    public void setTextColor(int color) {
    }
}