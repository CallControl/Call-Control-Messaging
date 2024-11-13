package dev.octoshrimpy.quik.feature.compose.editing;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\u0018\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0002H\u0002R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u001c"}, d2 = {"Ldev/octoshrimpy/quik/feature/compose/editing/ChipsAdapter;", "Ldev/octoshrimpy/quik/common/base/QkAdapter;", "Ldev/octoshrimpy/quik/model/Recipient;", "()V", "chipDeleted", "Lio/reactivex/subjects/PublishSubject;", "getChipDeleted", "()Lio/reactivex/subjects/PublishSubject;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "getView", "()Landroidx/recyclerview/widget/RecyclerView;", "setView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "onBindViewHolder", "", "holder", "Ldev/octoshrimpy/quik/common/base/QkViewHolder;", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "showDetailedChip", "context", "Landroid/content/Context;", "recipient", "presentation_noAnalyticsRelease"})
public final class ChipsAdapter extends dev.octoshrimpy.quik.common.base.QkAdapter<dev.octoshrimpy.quik.model.Recipient> {
    @org.jetbrains.annotations.Nullable
    private androidx.recyclerview.widget.RecyclerView view;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.subjects.PublishSubject<dev.octoshrimpy.quik.model.Recipient> chipDeleted = null;
    
    @javax.inject.Inject
    public ChipsAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final androidx.recyclerview.widget.RecyclerView getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.Nullable
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.subjects.PublishSubject<dev.octoshrimpy.quik.model.Recipient> getChipDeleted() {
        return null;
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
    
    /**
     * The [context] has to come from a view, because we're inflating a view that used themed attrs
     */
    private final void showDetailedChip(android.content.Context context, dev.octoshrimpy.quik.model.Recipient recipient) {
    }
}