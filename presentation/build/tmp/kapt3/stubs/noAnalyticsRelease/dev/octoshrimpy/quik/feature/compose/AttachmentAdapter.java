package dev.octoshrimpy.quik.feature.compose;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bH\u0016R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Ldev/octoshrimpy/quik/feature/compose/AttachmentAdapter;", "Ldev/octoshrimpy/quik/common/base/QkAdapter;", "Ldev/octoshrimpy/quik/model/Attachment;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attachmentDeleted", "Lio/reactivex/subjects/Subject;", "getAttachmentDeleted", "()Lio/reactivex/subjects/Subject;", "getItemViewType", "", "position", "onBindViewHolder", "", "holder", "Ldev/octoshrimpy/quik/common/base/QkViewHolder;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "presentation_noAnalyticsRelease"})
public final class AttachmentAdapter extends dev.octoshrimpy.quik.common.base.QkAdapter<dev.octoshrimpy.quik.model.Attachment> {
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    public static final dev.octoshrimpy.quik.feature.compose.AttachmentAdapter.Companion Companion = null;
    private static final int VIEW_TYPE_IMAGE = 0;
    private static final int VIEW_TYPE_CONTACT = 1;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.subjects.Subject<dev.octoshrimpy.quik.model.Attachment> attachmentDeleted = null;
    
    @javax.inject.Inject
    public AttachmentAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.subjects.Subject<dev.octoshrimpy.quik.model.Attachment> getAttachmentDeleted() {
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
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Ldev/octoshrimpy/quik/feature/compose/AttachmentAdapter$Companion;", "", "()V", "VIEW_TYPE_CONTACT", "", "VIEW_TYPE_IMAGE", "presentation_noAnalyticsRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}