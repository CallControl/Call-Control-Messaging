package dev.octoshrimpy.quik.common.util.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000F\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001e\u0010\b\u001a\u00020\t*\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\f\u001a\u0012\u0010\u000e\u001a\u00020\t*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f\u001a\n\u0010\u0011\u001a\u00020\t*\u00020\u0012\u001a\n\u0010\u0013\u001a\u00020\t*\u00020\u0014\u001a\u0012\u0010\u0015\u001a\u00020\t*\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\r\u001a?\u0010\u0017\u001a\u00020\t*\u00020\u000f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010\u001c\u001a\u0012\u0010\u001d\u001a\u00020\t*\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\r\u001a\u0012\u0010\u001d\u001a\u00020\t*\u00020\u001f2\u0006\u0010\u0016\u001a\u00020\r\u001a\u001c\u0010 \u001a\u00020\t*\u00020\u000f2\u0006\u0010!\u001a\u00020\u00012\b\b\u0002\u0010\"\u001a\u00020\r\u001a\n\u0010#\u001a\u00020\t*\u00020\u0012\"(\u0010\u0002\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0000\u001a\u00020\u00018F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\u00a8\u0006$"}, d2 = {"value", "", "animateLayoutChanges", "Landroid/view/ViewGroup;", "getAnimateLayoutChanges", "(Landroid/view/ViewGroup;)Z", "setAnimateLayoutChanges", "(Landroid/view/ViewGroup;Z)V", "addOnPageChangeListener", "", "Landroidx/viewpager/widget/ViewPager;", "listener", "Lkotlin/Function1;", "", "forwardTouches", "Landroid/view/View;", "parent", "hideKeyboard", "Landroid/widget/EditText;", "scrapViews", "Landroidx/recyclerview/widget/RecyclerView;", "setBackgroundTint", "color", "setPadding", "left", "top", "right", "bottom", "(Landroid/view/View;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "setTint", "Landroid/widget/ImageView;", "Landroid/widget/ProgressBar;", "setVisible", "visible", "invisible", "showKeyboard", "presentation_noAnalyticsRelease"})
public final class ViewExtensionsKt {
    
    public static final boolean getAnimateLayoutChanges(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup $this$animateLayoutChanges) {
        return false;
    }
    
    public static final void setAnimateLayoutChanges(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup $this$animateLayoutChanges, boolean value) {
    }
    
    public static final void showKeyboard(@org.jetbrains.annotations.NotNull
    android.widget.EditText $this$showKeyboard) {
    }
    
    public static final void hideKeyboard(@org.jetbrains.annotations.NotNull
    android.widget.EditText $this$hideKeyboard) {
    }
    
    public static final void setTint(@org.jetbrains.annotations.NotNull
    android.widget.ImageView $this$setTint, int color) {
    }
    
    public static final void setTint(@org.jetbrains.annotations.NotNull
    android.widget.ProgressBar $this$setTint, int color) {
    }
    
    public static final void setBackgroundTint(@org.jetbrains.annotations.NotNull
    android.view.View $this$setBackgroundTint, int color) {
    }
    
    public static final void setPadding(@org.jetbrains.annotations.NotNull
    android.view.View $this$setPadding, @org.jetbrains.annotations.Nullable
    java.lang.Integer left, @org.jetbrains.annotations.Nullable
    java.lang.Integer top, @org.jetbrains.annotations.Nullable
    java.lang.Integer right, @org.jetbrains.annotations.Nullable
    java.lang.Integer bottom) {
    }
    
    public static final void setVisible(@org.jetbrains.annotations.NotNull
    android.view.View $this$setVisible, boolean visible, int invisible) {
    }
    
    /**
     * If a view captures clicks at all, then the parent won't ever receive touch events. This is a
     * problem when we're trying to capture link clicks, but tapping or long pressing other areas of
     * the view no longer work. Also problematic when we try to long press on an image in the message
     * view
     */
    public static final void forwardTouches(@org.jetbrains.annotations.NotNull
    android.view.View $this$forwardTouches, @org.jetbrains.annotations.NotNull
    android.view.View parent) {
    }
    
    public static final void addOnPageChangeListener(@org.jetbrains.annotations.NotNull
    androidx.viewpager.widget.ViewPager $this$addOnPageChangeListener, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> listener) {
    }
    
    public static final void scrapViews(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView $this$scrapViews) {
    }
}