package dev.octoshrimpy.quik.common.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001!B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u000e\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bJ\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u000bH\u0002J\u000e\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000bJ\u000e\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000bJ\u000e\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000bJ\u0012\u0010\u0018\u001a\u00020\u001e2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0018\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0 2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Ldev/octoshrimpy/quik/common/util/Colors;", "", "context", "Landroid/content/Context;", "phoneNumberUtils", "Ldev/octoshrimpy/quik/util/PhoneNumberUtils;", "prefs", "Ldev/octoshrimpy/quik/util/Preferences;", "(Landroid/content/Context;Ldev/octoshrimpy/quik/util/PhoneNumberUtils;Ldev/octoshrimpy/quik/util/Preferences;)V", "materialColors", "", "", "getMaterialColors", "()Ljava/util/List;", "minimumContrastRatio", "primaryTextLuminance", "", "randomColors", "secondaryTextLuminance", "tertiaryTextLuminance", "generateColor", "recipient", "Ldev/octoshrimpy/quik/model/Recipient;", "highlightColorForTheme", "theme", "measureLuminance", "color", "textPrimaryOnThemeForColor", "textSecondaryOnThemeForColor", "textTertiaryOnThemeForColor", "Ldev/octoshrimpy/quik/common/util/Colors$Theme;", "themeObservable", "Lio/reactivex/Observable;", "Theme", "presentation_noAnalyticsRelease"})
@javax.inject.Singleton
public final class Colors {
    private final android.content.Context context = null;
    private final dev.octoshrimpy.quik.util.PhoneNumberUtils phoneNumberUtils = null;
    private final dev.octoshrimpy.quik.util.Preferences prefs = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.util.List<java.lang.Integer>> materialColors = null;
    private final java.util.List<java.lang.Integer> randomColors = null;
    private final int minimumContrastRatio = 2;
    private final double primaryTextLuminance = 0.0;
    private final double secondaryTextLuminance = 0.0;
    private final double tertiaryTextLuminance = 0.0;
    
    @javax.inject.Inject
    public Colors(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.util.PhoneNumberUtils phoneNumberUtils, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.util.Preferences prefs) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.util.List<java.lang.Integer>> getMaterialColors() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.common.util.Colors.Theme theme(@org.jetbrains.annotations.Nullable
    dev.octoshrimpy.quik.model.Recipient recipient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.Observable<dev.octoshrimpy.quik.common.util.Colors.Theme> themeObservable(@org.jetbrains.annotations.Nullable
    dev.octoshrimpy.quik.model.Recipient recipient) {
        return null;
    }
    
    public final int highlightColorForTheme(int theme) {
        return 0;
    }
    
    public final int textPrimaryOnThemeForColor(int color) {
        return 0;
    }
    
    public final int textSecondaryOnThemeForColor(int color) {
        return 0;
    }
    
    public final int textTertiaryOnThemeForColor(int color) {
        return 0;
    }
    
    /**
     * Measures the luminance value of a color to be able to measure the contrast ratio between two materialColors
     * Based on https://stackoverflow.com/a/9733420
     */
    private final double measureLuminance(int color) {
        return 0.0;
    }
    
    private final int generateColor(dev.octoshrimpy.quik.model.Recipient recipient) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c2\u0003J\u001d\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\u00038FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\u00038FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\r\u0010\tR\u001b\u0010\u000f\u001a\u00020\u00038FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0010\u0010\tR\u001b\u0010\u0012\u001a\u00020\u00038FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0013\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\t\u00a8\u0006\u001f"}, d2 = {"Ldev/octoshrimpy/quik/common/util/Colors$Theme;", "", "theme", "", "colors", "Ldev/octoshrimpy/quik/common/util/Colors;", "(ILdev/octoshrimpy/quik/common/util/Colors;)V", "highlight", "getHighlight", "()I", "highlight$delegate", "Lkotlin/Lazy;", "textPrimary", "getTextPrimary", "textPrimary$delegate", "textSecondary", "getTextSecondary", "textSecondary$delegate", "textTertiary", "getTextTertiary", "textTertiary$delegate", "getTheme", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "presentation_noAnalyticsRelease"})
    public static final class Theme {
        private final int theme = 0;
        private final dev.octoshrimpy.quik.common.util.Colors colors = null;
        @org.jetbrains.annotations.NotNull
        private final kotlin.Lazy highlight$delegate = null;
        @org.jetbrains.annotations.NotNull
        private final kotlin.Lazy textPrimary$delegate = null;
        @org.jetbrains.annotations.NotNull
        private final kotlin.Lazy textSecondary$delegate = null;
        @org.jetbrains.annotations.NotNull
        private final kotlin.Lazy textTertiary$delegate = null;
        
        @org.jetbrains.annotations.NotNull
        public final dev.octoshrimpy.quik.common.util.Colors.Theme copy(int theme, @org.jetbrains.annotations.NotNull
        dev.octoshrimpy.quik.common.util.Colors colors) {
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
        
        public Theme(int theme, @org.jetbrains.annotations.NotNull
        dev.octoshrimpy.quik.common.util.Colors colors) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getTheme() {
            return 0;
        }
        
        private final dev.octoshrimpy.quik.common.util.Colors component2() {
            return null;
        }
        
        public final int getHighlight() {
            return 0;
        }
        
        public final int getTextPrimary() {
            return 0;
        }
        
        public final int getTextSecondary() {
            return 0;
        }
        
        public final int getTextTertiary() {
            return 0;
        }
    }
}