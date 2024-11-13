package dev.octoshrimpy.quik.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0018\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\fH\u0016J\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!H\u0016J\u001a\u0010\"\u001a\u00020\u00172\b\b\u0001\u0010#\u001a\u00020\f2\b\b\u0003\u0010$\u001a\u00020\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR*\u0010\u0010\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\f@FX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006%"}, d2 = {"Ldev/octoshrimpy/quik/common/MenuItemAdapter;", "Ldev/octoshrimpy/quik/common/base/QkAdapter;", "Ldev/octoshrimpy/quik/common/MenuItem;", "context", "Landroid/content/Context;", "colors", "Ldev/octoshrimpy/quik/common/util/Colors;", "(Landroid/content/Context;Ldev/octoshrimpy/quik/common/util/Colors;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "menuItemClicks", "Lio/reactivex/subjects/Subject;", "", "getMenuItemClicks", "()Lio/reactivex/subjects/Subject;", "value", "selectedItem", "getSelectedItem", "()Ljava/lang/Integer;", "setSelectedItem", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "onBindViewHolder", "", "holder", "Ldev/octoshrimpy/quik/common/base/QkViewHolder;", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onDetachedFromRecyclerView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "setData", "titles", "values", "presentation_noAnalyticsRelease"})
public final class MenuItemAdapter extends dev.octoshrimpy.quik.common.base.QkAdapter<dev.octoshrimpy.quik.common.MenuItem> {
    private final android.content.Context context = null;
    private final dev.octoshrimpy.quik.common.util.Colors colors = null;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.subjects.Subject<java.lang.Integer> menuItemClicks = null;
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer selectedItem;
    
    @javax.inject.Inject
    public MenuItemAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.util.Colors colors) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.subjects.Subject<java.lang.Integer> getMenuItemClicks() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getSelectedItem() {
        return null;
    }
    
    public final void setSelectedItem(@org.jetbrains.annotations.Nullable
    java.lang.Integer value) {
    }
    
    public final void setData(@androidx.annotation.ArrayRes
    int titles, @androidx.annotation.ArrayRes
    int values) {
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
    
    @java.lang.Override
    public void onDetachedFromRecyclerView(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
}