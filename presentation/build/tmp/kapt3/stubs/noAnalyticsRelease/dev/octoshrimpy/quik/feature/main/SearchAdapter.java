package dev.octoshrimpy.quik.feature.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H\u0014J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H\u0014J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\rH\u0016J\u0018\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\rH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Ldev/octoshrimpy/quik/feature/main/SearchAdapter;", "Ldev/octoshrimpy/quik/common/base/QkAdapter;", "Ldev/octoshrimpy/quik/model/SearchResult;", "colors", "Ldev/octoshrimpy/quik/common/util/Colors;", "context", "Landroid/content/Context;", "dateFormatter", "Ldev/octoshrimpy/quik/common/util/DateFormatter;", "navigator", "Ldev/octoshrimpy/quik/common/Navigator;", "(Ldev/octoshrimpy/quik/common/util/Colors;Landroid/content/Context;Ldev/octoshrimpy/quik/common/util/DateFormatter;Ldev/octoshrimpy/quik/common/Navigator;)V", "highlightColor", "", "getHighlightColor", "()I", "highlightColor$delegate", "Lkotlin/Lazy;", "areContentsTheSame", "", "old", "new", "areItemsTheSame", "onBindViewHolder", "", "holder", "Ldev/octoshrimpy/quik/common/base/QkViewHolder;", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "presentation_noAnalyticsRelease"})
public final class SearchAdapter extends dev.octoshrimpy.quik.common.base.QkAdapter<dev.octoshrimpy.quik.model.SearchResult> {
    private final android.content.Context context = null;
    private final dev.octoshrimpy.quik.common.util.DateFormatter dateFormatter = null;
    private final dev.octoshrimpy.quik.common.Navigator navigator = null;
    private final kotlin.Lazy highlightColor$delegate = null;
    
    @javax.inject.Inject
    public SearchAdapter(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.util.Colors colors, @org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.util.DateFormatter dateFormatter, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.Navigator navigator) {
        super();
    }
    
    private final int getHighlightColor() {
        return 0;
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
    protected boolean areItemsTheSame(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.model.SearchResult old, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.model.SearchResult p1_54480) {
        return false;
    }
    
    @java.lang.Override
    protected boolean areContentsTheSame(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.model.SearchResult old, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.model.SearchResult p1_54480) {
        return false;
    }
}