package dev.octoshrimpy.quik.common.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0016\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Ldev/octoshrimpy/quik/common/util/TextViewStyler;", "", "prefs", "Ldev/octoshrimpy/quik/util/Preferences;", "colors", "Ldev/octoshrimpy/quik/common/util/Colors;", "fontProvider", "Ldev/octoshrimpy/quik/common/util/FontProvider;", "(Ldev/octoshrimpy/quik/util/Preferences;Ldev/octoshrimpy/quik/common/util/Colors;Ldev/octoshrimpy/quik/common/util/FontProvider;)V", "applyAttributes", "", "textView", "Landroid/widget/TextView;", "attrs", "Landroid/util/AttributeSet;", "setTextSize", "textSizeAttr", "", "Companion", "presentation_noAnalyticsRelease"})
public final class TextViewStyler {
    private final dev.octoshrimpy.quik.util.Preferences prefs = null;
    private final dev.octoshrimpy.quik.common.util.Colors colors = null;
    private final dev.octoshrimpy.quik.common.util.FontProvider fontProvider = null;
    @org.jetbrains.annotations.NotNull
    public static final dev.octoshrimpy.quik.common.util.TextViewStyler.Companion Companion = null;
    public static final int COLOR_THEME = 0;
    public static final int COLOR_PRIMARY_ON_THEME = 1;
    public static final int COLOR_SECONDARY_ON_THEME = 2;
    public static final int COLOR_TERTIARY_ON_THEME = 3;
    public static final int SIZE_PRIMARY = 0;
    public static final int SIZE_SECONDARY = 1;
    public static final int SIZE_TERTIARY = 2;
    public static final int SIZE_TOOLBAR = 3;
    public static final int SIZE_DIALOG = 4;
    public static final int SIZE_EMOJI = 5;
    
    @javax.inject.Inject
    public TextViewStyler(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.util.Preferences prefs, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.util.Colors colors, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.util.FontProvider fontProvider) {
        super();
    }
    
    public final void applyAttributes(@org.jetbrains.annotations.NotNull
    android.widget.TextView textView, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
    }
    
    /**
     * @see SIZE_PRIMARY
     * @see SIZE_SECONDARY
     * @see SIZE_TERTIARY
     * @see SIZE_TOOLBAR
     */
    public final void setTextSize(@org.jetbrains.annotations.NotNull
    android.widget.TextView textView, int textSizeAttr) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Ldev/octoshrimpy/quik/common/util/TextViewStyler$Companion;", "", "()V", "COLOR_PRIMARY_ON_THEME", "", "COLOR_SECONDARY_ON_THEME", "COLOR_TERTIARY_ON_THEME", "COLOR_THEME", "SIZE_DIALOG", "SIZE_EMOJI", "SIZE_PRIMARY", "SIZE_SECONDARY", "SIZE_TERTIARY", "SIZE_TOOLBAR", "applyEditModeAttributes", "", "textView", "Landroid/widget/TextView;", "attrs", "Landroid/util/AttributeSet;", "presentation_noAnalyticsRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void applyEditModeAttributes(@org.jetbrains.annotations.NotNull
        android.widget.TextView textView, @org.jetbrains.annotations.Nullable
        android.util.AttributeSet attrs) {
        }
    }
}