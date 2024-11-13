package dev.octoshrimpy.quik.common.base;

import java.lang.System;

/**
 * Base RecyclerView.Adapter that provides some convenience when creating a new Adapter, such as
 * data list handing and item animations
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00028\u0000H\u0014\u00a2\u0006\u0002\u0010\u001dJ\u001d\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00028\u0000H\u0014\u00a2\u0006\u0002\u0010\u001dJ\u0006\u0010\u001f\u001a\u00020 J$\u0010!\u001a\u00020\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0002J\u0013\u0010%\u001a\u00028\u00002\u0006\u0010&\u001a\u00020\'\u00a2\u0006\u0002\u0010(J\b\u0010)\u001a\u00020\'H\u0016J\u0010\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u0014H\u0004J\b\u0010,\u001a\u00020 H\u0016J\u001a\u0010-\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u00142\b\b\u0002\u0010.\u001a\u00020\u001aH\u0004R0\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\f@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00060\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006/"}, d2 = {"Ldev/octoshrimpy/quik/common/base/QkAdapter;", "T", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Ldev/octoshrimpy/quik/common/base/QkViewHolder;", "()V", "value", "", "data", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "Landroid/view/View;", "emptyView", "getEmptyView", "()Landroid/view/View;", "setEmptyView", "(Landroid/view/View;)V", "selection", "", "", "selectionChanges", "Lio/reactivex/subjects/Subject;", "getSelectionChanges", "()Lio/reactivex/subjects/Subject;", "areContentsTheSame", "", "old", "new", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "areItemsTheSame", "clearSelection", "", "getDiffUtilCallback", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "oldData", "newData", "getItem", "position", "", "(I)Ljava/lang/Object;", "getItemCount", "isSelected", "id", "onDatasetChanged", "toggleSelection", "force", "presentation_noAnalyticsRelease"})
public abstract class QkAdapter<T extends java.lang.Object> extends androidx.recyclerview.widget.RecyclerView.Adapter<dev.octoshrimpy.quik.common.base.QkViewHolder> {
    @org.jetbrains.annotations.NotNull
    private java.util.List<? extends T> data;
    
    /**
     * This view can be set, and the adapter will automatically control the visibility of this view
     * based on the data
     */
    @org.jetbrains.annotations.Nullable
    private android.view.View emptyView;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.subjects.Subject<java.util.List<java.lang.Long>> selectionChanges = null;
    private final java.util.List<java.lang.Long> selection = null;
    
    public QkAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<T> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull
    java.util.List<? extends T> value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.view.View getEmptyView() {
        return null;
    }
    
    public final void setEmptyView(@org.jetbrains.annotations.Nullable
    android.view.View value) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.subjects.Subject<java.util.List<java.lang.Long>> getSelectionChanges() {
        return null;
    }
    
    /**
     * Toggles the selected state for a particular view
     *
     * If we are currently in selection mode (we have an active selection), then the state will
     * toggle. If we are not in selection mode, then we will only toggle if [force]
     */
    protected final boolean toggleSelection(long id, boolean force) {
        return false;
    }
    
    protected final boolean isSelected(long id) {
        return false;
    }
    
    public final void clearSelection() {
    }
    
    public final T getItem(int position) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    public void onDatasetChanged() {
    }
    
    /**
     * Allows the adapter implementation to provide a custom DiffUtil.Callback
     * If not, then the abstract implementation will be used
     */
    private final androidx.recyclerview.widget.DiffUtil.Callback getDiffUtilCallback(java.util.List<? extends T> oldData, java.util.List<? extends T> newData) {
        return null;
    }
    
    protected boolean areItemsTheSame(T old, T p1_54480) {
        return false;
    }
    
    protected boolean areContentsTheSame(T old, T p1_54480) {
        return false;
    }
}