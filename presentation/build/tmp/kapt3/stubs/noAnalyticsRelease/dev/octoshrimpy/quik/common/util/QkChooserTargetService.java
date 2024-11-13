package dev.octoshrimpy.quik.common.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0015"}, d2 = {"Ldev/octoshrimpy/quik/common/util/QkChooserTargetService;", "Landroid/service/chooser/ChooserTargetService;", "()V", "conversationRepo", "Ldev/octoshrimpy/quik/repository/ConversationRepository;", "getConversationRepo", "()Ldev/octoshrimpy/quik/repository/ConversationRepository;", "setConversationRepo", "(Ldev/octoshrimpy/quik/repository/ConversationRepository;)V", "createShortcutForConversation", "Landroid/service/chooser/ChooserTarget;", "conversation", "Ldev/octoshrimpy/quik/model/Conversation;", "onCreate", "", "onGetChooserTargets", "", "targetActivityName", "Landroid/content/ComponentName;", "matchedFilter", "Landroid/content/IntentFilter;", "presentation_noAnalyticsRelease"})
public final class QkChooserTargetService extends android.service.chooser.ChooserTargetService {
    @javax.inject.Inject
    public dev.octoshrimpy.quik.repository.ConversationRepository conversationRepo;
    
    public QkChooserTargetService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.repository.ConversationRepository getConversationRepo() {
        return null;
    }
    
    public final void setConversationRepo(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.ConversationRepository p0) {
    }
    
    @java.lang.Override
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.List<android.service.chooser.ChooserTarget> onGetChooserTargets(@org.jetbrains.annotations.Nullable
    android.content.ComponentName targetActivityName, @org.jetbrains.annotations.Nullable
    android.content.IntentFilter matchedFilter) {
        return null;
    }
    
    private final android.service.chooser.ChooserTarget createShortcutForConversation(dev.octoshrimpy.quik.model.Conversation conversation) {
        return null;
    }
}