package dev.octoshrimpy.quik.feature.compose.part;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$H\u0016J\u0018\u0010&\u001a\u00020\'2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010%\u001a\u00020$H\u0016J\u0018\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020$H\u0016J*\u0010,\u001a\u00020\'2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001d@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\u00a8\u0006-"}, d2 = {"Ldev/octoshrimpy/quik/feature/compose/part/PartsAdapter;", "Ldev/octoshrimpy/quik/common/base/QkAdapter;", "Ldev/octoshrimpy/quik/model/MmsPart;", "colors", "Ldev/octoshrimpy/quik/common/util/Colors;", "fileBinder", "Ldev/octoshrimpy/quik/feature/compose/part/FileBinder;", "mediaBinder", "Ldev/octoshrimpy/quik/feature/compose/part/MediaBinder;", "vCardBinder", "Ldev/octoshrimpy/quik/feature/compose/part/VCardBinder;", "(Ldev/octoshrimpy/quik/common/util/Colors;Ldev/octoshrimpy/quik/feature/compose/part/FileBinder;Ldev/octoshrimpy/quik/feature/compose/part/MediaBinder;Ldev/octoshrimpy/quik/feature/compose/part/VCardBinder;)V", "bodyVisible", "", "clicks", "Lio/reactivex/Observable;", "", "getClicks", "()Lio/reactivex/Observable;", "holder", "Ldev/octoshrimpy/quik/common/base/QkViewHolder;", "message", "Ldev/octoshrimpy/quik/model/Message;", "next", "partBinders", "", "Ldev/octoshrimpy/quik/feature/compose/part/PartBinder;", "previous", "value", "Ldev/octoshrimpy/quik/common/util/Colors$Theme;", "theme", "getTheme", "()Ldev/octoshrimpy/quik/common/util/Colors$Theme;", "setTheme", "(Ldev/octoshrimpy/quik/common/util/Colors$Theme;)V", "getItemViewType", "", "position", "onBindViewHolder", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "presentation_noAnalyticsRelease"})
public final class PartsAdapter extends dev.octoshrimpy.quik.common.base.QkAdapter<dev.octoshrimpy.quik.model.MmsPart> {
    private final java.util.List<dev.octoshrimpy.quik.feature.compose.part.PartBinder> partBinders = null;
    @org.jetbrains.annotations.NotNull
    private dev.octoshrimpy.quik.common.util.Colors.Theme theme;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.Observable<java.lang.Long> clicks = null;
    private dev.octoshrimpy.quik.model.Message message;
    private dev.octoshrimpy.quik.model.Message previous;
    private dev.octoshrimpy.quik.model.Message next;
    private dev.octoshrimpy.quik.common.base.QkViewHolder holder;
    private boolean bodyVisible = true;
    
    @javax.inject.Inject
    public PartsAdapter(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.util.Colors colors, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.compose.part.FileBinder fileBinder, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.compose.part.MediaBinder mediaBinder, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.compose.part.VCardBinder vCardBinder) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.common.util.Colors.Theme getTheme() {
        return null;
    }
    
    public final void setTheme(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.util.Colors.Theme value) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.Observable<java.lang.Long> getClicks() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.model.Message message, @org.jetbrains.annotations.Nullable
    dev.octoshrimpy.quik.model.Message previous, @org.jetbrains.annotations.Nullable
    dev.octoshrimpy.quik.model.Message next, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.base.QkViewHolder holder) {
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
    public int getItemViewType(int position) {
        return 0;
    }
}