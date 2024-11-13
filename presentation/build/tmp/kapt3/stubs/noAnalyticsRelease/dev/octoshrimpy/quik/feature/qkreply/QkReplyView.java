package dev.octoshrimpy.quik.feature.qkreply;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0010\u001a\u00020\u000bH&J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H&R\u0016\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0006\u00a8\u0006\u0014"}, d2 = {"Ldev/octoshrimpy/quik/feature/qkreply/QkReplyView;", "Ldev/octoshrimpy/quik/common/base/QkView;", "Ldev/octoshrimpy/quik/feature/qkreply/QkReplyState;", "changeSimIntent", "Lio/reactivex/Observable;", "getChangeSimIntent", "()Lio/reactivex/Observable;", "menuItemIntent", "", "getMenuItemIntent", "sendIntent", "", "getSendIntent", "textChangedIntent", "", "getTextChangedIntent", "finish", "setDraft", "draft", "", "presentation_noAnalyticsRelease"})
public abstract interface QkReplyView extends dev.octoshrimpy.quik.common.base.QkView<dev.octoshrimpy.quik.feature.qkreply.QkReplyState> {
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Integer> getMenuItemIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.CharSequence> getTextChangedIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> getChangeSimIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<kotlin.Unit> getSendIntent();
    
    public abstract void setDraft(@org.jetbrains.annotations.NotNull
    java.lang.String draft);
    
    public abstract void finish();
}