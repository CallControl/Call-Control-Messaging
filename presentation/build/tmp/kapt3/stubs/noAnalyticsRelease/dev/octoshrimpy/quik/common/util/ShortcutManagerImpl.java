package dev.octoshrimpy.quik.common.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Ldev/octoshrimpy/quik/common/util/ShortcutManagerImpl;", "Ldev/octoshrimpy/quik/manager/ShortcutManager;", "context", "Landroid/content/Context;", "conversationRepo", "Ldev/octoshrimpy/quik/repository/ConversationRepository;", "messageRepo", "Ldev/octoshrimpy/quik/repository/MessageRepository;", "(Landroid/content/Context;Ldev/octoshrimpy/quik/repository/ConversationRepository;Ldev/octoshrimpy/quik/repository/MessageRepository;)V", "createShortcutForConversation", "Landroid/content/pm/ShortcutInfo;", "conversation", "Ldev/octoshrimpy/quik/model/Conversation;", "shortcutManager", "Landroid/content/pm/ShortcutManager;", "updateBadge", "", "updateShortcuts", "presentation_noAnalyticsRelease"})
public final class ShortcutManagerImpl implements dev.octoshrimpy.quik.manager.ShortcutManager {
    private final android.content.Context context = null;
    private final dev.octoshrimpy.quik.repository.ConversationRepository conversationRepo = null;
    private final dev.octoshrimpy.quik.repository.MessageRepository messageRepo = null;
    
    @javax.inject.Inject
    public ShortcutManagerImpl(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.ConversationRepository conversationRepo, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.MessageRepository messageRepo) {
        super();
    }
    
    @java.lang.Override
    public void updateBadge() {
    }
    
    @java.lang.Override
    public void updateShortcuts() {
    }
    
    @android.annotation.TargetApi(value = 25)
    private final android.content.pm.ShortcutInfo createShortcutForConversation(dev.octoshrimpy.quik.model.Conversation conversation, android.content.pm.ShortcutManager shortcutManager) {
        return null;
    }
}