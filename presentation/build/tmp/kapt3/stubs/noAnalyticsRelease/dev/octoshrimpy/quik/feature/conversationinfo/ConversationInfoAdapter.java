package dev.octoshrimpy.quik.feature.conversationinfo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0002H\u0014J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0016J\u0018\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\'2\u0006\u0010$\u001a\u00020#H\u0016J\u0018\u0010(\u001a\u00020\'2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020#H\u0016R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\fR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\f\u00a8\u0006,"}, d2 = {"Ldev/octoshrimpy/quik/feature/conversationinfo/ConversationInfoAdapter;", "Ldev/octoshrimpy/quik/common/base/QkAdapter;", "Ldev/octoshrimpy/quik/feature/conversationinfo/ConversationInfoItem;", "context", "Landroid/content/Context;", "colors", "Ldev/octoshrimpy/quik/common/util/Colors;", "(Landroid/content/Context;Ldev/octoshrimpy/quik/common/util/Colors;)V", "archiveClicks", "Lio/reactivex/subjects/Subject;", "", "getArchiveClicks", "()Lio/reactivex/subjects/Subject;", "blockClicks", "getBlockClicks", "deleteClicks", "getDeleteClicks", "mediaClicks", "", "getMediaClicks", "nameClicks", "getNameClicks", "notificationClicks", "getNotificationClicks", "recipientClicks", "getRecipientClicks", "recipientLongClicks", "getRecipientLongClicks", "themeClicks", "getThemeClicks", "areItemsTheSame", "", "old", "new", "getItemViewType", "", "position", "onBindViewHolder", "holder", "Ldev/octoshrimpy/quik/common/base/QkViewHolder;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "presentation_noAnalyticsRelease"})
public final class ConversationInfoAdapter extends dev.octoshrimpy.quik.common.base.QkAdapter<dev.octoshrimpy.quik.feature.conversationinfo.ConversationInfoItem> {
    private final android.content.Context context = null;
    private final dev.octoshrimpy.quik.common.util.Colors colors = null;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.subjects.Subject<java.lang.Long> recipientClicks = null;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.subjects.Subject<java.lang.Long> recipientLongClicks = null;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.subjects.Subject<java.lang.Long> themeClicks = null;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.subjects.Subject<kotlin.Unit> nameClicks = null;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.subjects.Subject<kotlin.Unit> notificationClicks = null;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.subjects.Subject<kotlin.Unit> archiveClicks = null;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.subjects.Subject<kotlin.Unit> blockClicks = null;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.subjects.Subject<kotlin.Unit> deleteClicks = null;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.subjects.Subject<java.lang.Long> mediaClicks = null;
    
    @javax.inject.Inject
    public ConversationInfoAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.util.Colors colors) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.subjects.Subject<java.lang.Long> getRecipientClicks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.subjects.Subject<java.lang.Long> getRecipientLongClicks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.subjects.Subject<java.lang.Long> getThemeClicks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.subjects.Subject<kotlin.Unit> getNameClicks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.subjects.Subject<kotlin.Unit> getNotificationClicks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.subjects.Subject<kotlin.Unit> getArchiveClicks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.subjects.Subject<kotlin.Unit> getBlockClicks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.subjects.Subject<kotlin.Unit> getDeleteClicks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.subjects.Subject<java.lang.Long> getMediaClicks() {
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
    
    @java.lang.Override
    protected boolean areItemsTheSame(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.conversationinfo.ConversationInfoItem old, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.conversationinfo.ConversationInfoItem p1_54480) {
        return false;
    }
}