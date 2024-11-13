package dev.octoshrimpy.quik.common.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00040\u0003B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010\u0018\u001a\u00020\t2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\bH\u0002J\u0006\u0010\u001a\u001a\u00020\tJ\u0017\u0010\u001b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u001c\u001a\u00020\u001dH\u0016\u00a2\u0006\u0002\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0013H\u0004J\u0010\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\t2\u0006\u0010#\u001a\u00020$H\u0016J\u0018\u0010&\u001a\u00020\t2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\bH\u0002J\u001a\u0010\'\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00132\b\b\u0002\u0010(\u001a\u00020 H\u0004J\u0018\u0010)\u001a\u00020\t2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\bH\u0016R \u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006*"}, d2 = {"Ldev/octoshrimpy/quik/common/base/QkRealmAdapter;", "T", "Lio/realm/RealmModel;", "Lio/realm/RealmRecyclerViewAdapter;", "Ldev/octoshrimpy/quik/common/base/QkViewHolder;", "()V", "emptyListener", "Lkotlin/Function1;", "Lio/realm/OrderedRealmCollection;", "", "value", "Landroid/view/View;", "emptyView", "getEmptyView", "()Landroid/view/View;", "setEmptyView", "(Landroid/view/View;)V", "selection", "", "", "selectionChanges", "Lio/reactivex/subjects/Subject;", "getSelectionChanges", "()Lio/reactivex/subjects/Subject;", "addListener", "data", "clearSelection", "getItem", "index", "", "(I)Lio/realm/RealmModel;", "isSelected", "", "id", "onAttachedToRecyclerView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onDetachedFromRecyclerView", "removeListener", "toggleSelection", "force", "updateData", "presentation_noAnalyticsRelease"})
public abstract class QkRealmAdapter<T extends io.realm.RealmModel> extends io.realm.RealmRecyclerViewAdapter<T, dev.octoshrimpy.quik.common.base.QkViewHolder> {
    
    /**
     * This view can be set, and the adapter will automatically control the visibility of this view
     * based on the data
     */
    @org.jetbrains.annotations.Nullable
    private android.view.View emptyView;
    private final kotlin.jvm.functions.Function1<io.realm.OrderedRealmCollection<T>, kotlin.Unit> emptyListener = null;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.subjects.Subject<java.util.List<java.lang.Long>> selectionChanges = null;
    private java.util.List<java.lang.Long> selection;
    
    public QkRealmAdapter() {
        super(null, false);
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
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public T getItem(int index) {
        return null;
    }
    
    @java.lang.Override
    public void updateData(@org.jetbrains.annotations.Nullable
    io.realm.OrderedRealmCollection<T> data) {
    }
    
    @java.lang.Override
    public void onAttachedToRecyclerView(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
    
    @java.lang.Override
    public void onDetachedFromRecyclerView(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
    
    private final void addListener(io.realm.OrderedRealmCollection<T> data) {
    }
    
    private final void removeListener(io.realm.OrderedRealmCollection<T> data) {
    }
}