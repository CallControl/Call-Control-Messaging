package dev.octoshrimpy.quik.feature.themepicker;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0012J\b\u0010\u0018\u001a\u00020\u0016H\u0002J\b\u0010\u0019\u001a\u00020\u0016H\u0002J\b\u0010\u001a\u001a\u00020\u0016H\u0002R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001b"}, d2 = {"Ldev/octoshrimpy/quik/feature/themepicker/HSVPickerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "value", "", "hue", "setHue", "(F)V", "hues", "", "max", "min", "selectedColor", "Lio/reactivex/subjects/Subject;", "", "getSelectedColor", "()Lio/reactivex/subjects/Subject;", "setColor", "", "color", "setupBounds", "updateHue", "updateSelectedColor", "presentation_noAnalyticsRelease"})
public final class HSVPickerView extends androidx.constraintlayout.widget.ConstraintLayout {
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.subjects.Subject<java.lang.Integer> selectedColor = null;
    private final int[] hues = null;
    private float min = 0.0F;
    private float max = 0.0F;
    private float hue = 0.0F;
    private java.util.HashMap _$_findViewCache;
    
    @kotlin.jvm.JvmOverloads
    public HSVPickerView(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public HSVPickerView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.subjects.Subject<java.lang.Integer> getSelectedColor() {
        return null;
    }
    
    private final void setHue(float value) {
    }
    
    private final void setupBounds() {
    }
    
    private final void updateSelectedColor() {
    }
    
    public final void setColor(int color) {
    }
    
    private final void updateHue() {
    }
}