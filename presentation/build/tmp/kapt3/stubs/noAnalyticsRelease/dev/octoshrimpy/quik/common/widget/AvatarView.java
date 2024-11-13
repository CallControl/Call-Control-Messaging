package dev.octoshrimpy.quik.common.widget;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u001c\u001a\u00020\u001dH\u0014J\u0010\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 J\b\u0010!\u001a\u00020\u001dH\u0002R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Ldev/octoshrimpy/quik/common/widget/AvatarView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "colors", "Ldev/octoshrimpy/quik/common/util/Colors;", "getColors", "()Ldev/octoshrimpy/quik/common/util/Colors;", "setColors", "(Ldev/octoshrimpy/quik/common/util/Colors;)V", "fullName", "", "lastUpdated", "", "Ljava/lang/Long;", "lookupKey", "navigator", "Ldev/octoshrimpy/quik/common/Navigator;", "getNavigator", "()Ldev/octoshrimpy/quik/common/Navigator;", "setNavigator", "(Ldev/octoshrimpy/quik/common/Navigator;)V", "photoUri", "theme", "Ldev/octoshrimpy/quik/common/util/Colors$Theme;", "onFinishInflate", "", "setRecipient", "recipient", "Ldev/octoshrimpy/quik/model/Recipient;", "updateView", "presentation_noAnalyticsRelease"})
public final class AvatarView extends android.widget.FrameLayout {
    @javax.inject.Inject
    public dev.octoshrimpy.quik.common.util.Colors colors;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.common.Navigator navigator;
    private java.lang.String lookupKey;
    private java.lang.String fullName;
    private java.lang.String photoUri;
    private java.lang.Long lastUpdated;
    private dev.octoshrimpy.quik.common.util.Colors.Theme theme;
    private java.util.HashMap _$_findViewCache;
    
    @kotlin.jvm.JvmOverloads
    public AvatarView(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public AvatarView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.common.util.Colors getColors() {
        return null;
    }
    
    public final void setColors(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.util.Colors p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.common.Navigator getNavigator() {
        return null;
    }
    
    public final void setNavigator(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.Navigator p0) {
    }
    
    /**
     * Use the [contact] information to display the avatar.
     */
    public final void setRecipient(@org.jetbrains.annotations.Nullable
    dev.octoshrimpy.quik.model.Recipient recipient) {
    }
    
    @java.lang.Override
    protected void onFinishInflate() {
    }
    
    private final void updateView() {
    }
}