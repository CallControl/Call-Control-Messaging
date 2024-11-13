package dev.octoshrimpy.quik.feature.conversations;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u001a\u0010 \u001a\u0004\u0018\u00010\u00182\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u0014H\u0002J@\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u00142\u0006\u0010/\u001a\u000200H\u0016J \u00101\u001a\u0002002\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u00102\u001a\u00020*H\u0016J\u0018\u00103\u001a\u00020$2\u0006\u0010)\u001a\u00020*2\u0006\u00104\u001a\u00020\u0014H\u0016R \u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R#\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00140\u001c0\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f\u00a8\u00065"}, d2 = {"Ldev/octoshrimpy/quik/feature/conversations/ConversationItemTouchCallback;", "Landroidx/recyclerview/widget/ItemTouchHelper$SimpleCallback;", "colors", "Ldev/octoshrimpy/quik/common/util/Colors;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "prefs", "Ldev/octoshrimpy/quik/util/Preferences;", "context", "Landroid/content/Context;", "(Ldev/octoshrimpy/quik/common/util/Colors;Lio/reactivex/disposables/CompositeDisposable;Ldev/octoshrimpy/quik/util/Preferences;Landroid/content/Context;)V", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "getAdapter", "()Landroidx/recyclerview/widget/RecyclerView$Adapter;", "setAdapter", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V", "backgroundPaint", "Landroid/graphics/Paint;", "iconLength", "", "leftAction", "rightAction", "swipeLeftIcon", "Landroid/graphics/Bitmap;", "swipeRightIcon", "swipes", "Lio/reactivex/subjects/Subject;", "Lkotlin/Pair;", "", "getSwipes", "()Lio/reactivex/subjects/Subject;", "iconForAction", "action", "tint", "onChildDraw", "", "c", "Landroid/graphics/Canvas;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "dX", "", "dY", "actionState", "isCurrentlyActive", "", "onMove", "target", "onSwiped", "direction", "presentation_noAnalyticsRelease"})
public final class ConversationItemTouchCallback extends androidx.recyclerview.widget.ItemTouchHelper.SimpleCallback {
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.subjects.Subject<kotlin.Pair<java.lang.Long, java.lang.Integer>> swipes = null;
    
    /**
     * Setting the adapter allows us to animate back to the original position
     */
    @org.jetbrains.annotations.Nullable
    private androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter;
    private final android.graphics.Paint backgroundPaint = null;
    private int rightAction = 0;
    private android.graphics.Bitmap swipeRightIcon;
    private int leftAction = 0;
    private android.graphics.Bitmap swipeLeftIcon;
    private final int iconLength = 0;
    
    @javax.inject.Inject
    public ConversationItemTouchCallback(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.util.Colors colors, @org.jetbrains.annotations.NotNull
    io.reactivex.disposables.CompositeDisposable disposables, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.util.Preferences prefs, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(0, 0);
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.subjects.Subject<kotlin.Pair<java.lang.Long, java.lang.Integer>> getSwipes() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final androidx.recyclerview.widget.RecyclerView.Adapter<?> getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.Nullable
    androidx.recyclerview.widget.RecyclerView.Adapter<?> p0) {
    }
    
    @java.lang.Override
    public boolean onMove(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, @org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder target) {
        return false;
    }
    
    @java.lang.Override
    public void onChildDraw(@org.jetbrains.annotations.NotNull
    android.graphics.Canvas c, @org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) {
    }
    
    @java.lang.Override
    public void onSwiped(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int direction) {
    }
    
    private final android.graphics.Bitmap iconForAction(int action, int tint) {
        return null;
    }
}