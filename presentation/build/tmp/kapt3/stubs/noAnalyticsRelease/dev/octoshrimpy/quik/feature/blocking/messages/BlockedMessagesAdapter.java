package dev.octoshrimpy.quik.feature.blocking.messages;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000eH\u0016R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Ldev/octoshrimpy/quik/feature/blocking/messages/BlockedMessagesAdapter;", "Ldev/octoshrimpy/quik/common/base/QkRealmAdapter;", "Ldev/octoshrimpy/quik/model/Conversation;", "context", "Landroid/content/Context;", "dateFormatter", "Ldev/octoshrimpy/quik/common/util/DateFormatter;", "(Landroid/content/Context;Ldev/octoshrimpy/quik/common/util/DateFormatter;)V", "clicks", "Lio/reactivex/subjects/PublishSubject;", "", "getClicks", "()Lio/reactivex/subjects/PublishSubject;", "getItemViewType", "", "position", "onBindViewHolder", "", "holder", "Ldev/octoshrimpy/quik/common/base/QkViewHolder;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "presentation_noAnalyticsRelease"})
public final class BlockedMessagesAdapter extends dev.octoshrimpy.quik.common.base.QkRealmAdapter<dev.octoshrimpy.quik.model.Conversation> {
    private final android.content.Context context = null;
    private final dev.octoshrimpy.quik.common.util.DateFormatter dateFormatter = null;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.subjects.PublishSubject<java.lang.Long> clicks = null;
    
    @javax.inject.Inject
    public BlockedMessagesAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.util.DateFormatter dateFormatter) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.subjects.PublishSubject<java.lang.Long> getClicks() {
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
    
    @java.lang.Override
    public int getItemViewType(int position) {
        return 0;
    }
}