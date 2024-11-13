package dev.octoshrimpy.quik.feature.themepicker;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\u0018\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0003H\u0016R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001d"}, d2 = {"Ldev/octoshrimpy/quik/feature/themepicker/ThemeAdapter;", "Ldev/octoshrimpy/quik/common/base/QkAdapter;", "", "", "context", "Landroid/content/Context;", "colors", "Ldev/octoshrimpy/quik/common/util/Colors;", "(Landroid/content/Context;Ldev/octoshrimpy/quik/common/util/Colors;)V", "colorSelected", "Lio/reactivex/subjects/Subject;", "getColorSelected", "()Lio/reactivex/subjects/Subject;", "iconTint", "value", "selectedColor", "getSelectedColor", "()I", "setSelectedColor", "(I)V", "onBindViewHolder", "", "holder", "Ldev/octoshrimpy/quik/common/base/QkViewHolder;", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "presentation_noAnalyticsRelease"})
public final class ThemeAdapter extends dev.octoshrimpy.quik.common.base.QkAdapter<java.util.List<? extends java.lang.Integer>> {
    private final android.content.Context context = null;
    private final dev.octoshrimpy.quik.common.util.Colors colors = null;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.subjects.Subject<java.lang.Integer> colorSelected = null;
    private int selectedColor = -1;
    private int iconTint = 0;
    
    @javax.inject.Inject
    public ThemeAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.util.Colors colors) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.subjects.Subject<java.lang.Integer> getColorSelected() {
        return null;
    }
    
    public final int getSelectedColor() {
        return 0;
    }
    
    public final void setSelectedColor(int value) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dev.octoshrimpy.quik.common.base.QkViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.base.QkViewHolder holder, int position) {
    }
}