package dev.octoshrimpy.quik.feature.compose.part;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J0\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH&J\u0010\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u0017H&R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u00020\rX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001e"}, d2 = {"Ldev/octoshrimpy/quik/feature/compose/part/PartBinder;", "", "()V", "clicks", "Lio/reactivex/subjects/Subject;", "", "getClicks", "()Lio/reactivex/subjects/Subject;", "partLayout", "", "getPartLayout", "()I", "theme", "Ldev/octoshrimpy/quik/common/util/Colors$Theme;", "getTheme", "()Ldev/octoshrimpy/quik/common/util/Colors$Theme;", "setTheme", "(Ldev/octoshrimpy/quik/common/util/Colors$Theme;)V", "bindPart", "", "holder", "Ldev/octoshrimpy/quik/common/base/QkViewHolder;", "part", "Ldev/octoshrimpy/quik/model/MmsPart;", "message", "Ldev/octoshrimpy/quik/model/Message;", "canGroupWithPrevious", "", "canGroupWithNext", "canBindPart", "presentation_noAnalyticsRelease"})
public abstract class PartBinder {
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.subjects.Subject<java.lang.Long> clicks = null;
    
    public PartBinder() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.subjects.Subject<java.lang.Long> getClicks() {
        return null;
    }
    
    public abstract int getPartLayout();
    
    @org.jetbrains.annotations.NotNull
    public abstract dev.octoshrimpy.quik.common.util.Colors.Theme getTheme();
    
    public abstract void setTheme(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.util.Colors.Theme p0);
    
    public abstract boolean canBindPart(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.model.MmsPart part);
    
    public abstract void bindPart(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.base.QkViewHolder holder, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.model.MmsPart part, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.model.Message message, boolean canGroupWithPrevious, boolean canGroupWithNext);
}