package dev.octoshrimpy.quik.feature.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u00a7\u0001\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%\u0012\u0006\u0010&\u001a\u00020\'\u0012\u0006\u0010(\u001a\u00020)\u0012\u0006\u0010*\u001a\u00020+\u00a2\u0006\u0002\u0010,J\u0010\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0002H\u0016R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\'X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Ldev/octoshrimpy/quik/feature/main/MainViewModel;", "Ldev/octoshrimpy/quik/common/base/QkViewModel;", "Ldev/octoshrimpy/quik/feature/main/MainView;", "Ldev/octoshrimpy/quik/feature/main/MainState;", "billingManager", "Ldev/octoshrimpy/quik/manager/BillingManager;", "contactAddedListener", "Ldev/octoshrimpy/quik/listener/ContactAddedListener;", "markAllSeen", "Ldev/octoshrimpy/quik/interactor/MarkAllSeen;", "migratePreferences", "Ldev/octoshrimpy/quik/interactor/MigratePreferences;", "syncRepository", "Ldev/octoshrimpy/quik/repository/SyncRepository;", "changelogManager", "Ldev/octoshrimpy/quik/manager/ChangelogManager;", "conversationRepo", "Ldev/octoshrimpy/quik/repository/ConversationRepository;", "deleteConversations", "Ldev/octoshrimpy/quik/interactor/DeleteConversations;", "markArchived", "Ldev/octoshrimpy/quik/interactor/MarkArchived;", "markPinned", "Ldev/octoshrimpy/quik/interactor/MarkPinned;", "markRead", "Ldev/octoshrimpy/quik/interactor/MarkRead;", "markUnarchived", "Ldev/octoshrimpy/quik/interactor/MarkUnarchived;", "markUnpinned", "Ldev/octoshrimpy/quik/interactor/MarkUnpinned;", "markUnread", "Ldev/octoshrimpy/quik/interactor/MarkUnread;", "navigator", "Ldev/octoshrimpy/quik/common/Navigator;", "permissionManager", "Ldev/octoshrimpy/quik/manager/PermissionManager;", "prefs", "Ldev/octoshrimpy/quik/util/Preferences;", "ratingManager", "Ldev/octoshrimpy/quik/manager/RatingManager;", "syncContacts", "Ldev/octoshrimpy/quik/interactor/SyncContacts;", "syncMessages", "Ldev/octoshrimpy/quik/interactor/SyncMessages;", "(Ldev/octoshrimpy/quik/manager/BillingManager;Ldev/octoshrimpy/quik/listener/ContactAddedListener;Ldev/octoshrimpy/quik/interactor/MarkAllSeen;Ldev/octoshrimpy/quik/interactor/MigratePreferences;Ldev/octoshrimpy/quik/repository/SyncRepository;Ldev/octoshrimpy/quik/manager/ChangelogManager;Ldev/octoshrimpy/quik/repository/ConversationRepository;Ldev/octoshrimpy/quik/interactor/DeleteConversations;Ldev/octoshrimpy/quik/interactor/MarkArchived;Ldev/octoshrimpy/quik/interactor/MarkPinned;Ldev/octoshrimpy/quik/interactor/MarkRead;Ldev/octoshrimpy/quik/interactor/MarkUnarchived;Ldev/octoshrimpy/quik/interactor/MarkUnpinned;Ldev/octoshrimpy/quik/interactor/MarkUnread;Ldev/octoshrimpy/quik/common/Navigator;Ldev/octoshrimpy/quik/manager/PermissionManager;Ldev/octoshrimpy/quik/util/Preferences;Ldev/octoshrimpy/quik/manager/RatingManager;Ldev/octoshrimpy/quik/interactor/SyncContacts;Ldev/octoshrimpy/quik/interactor/SyncMessages;)V", "bindView", "", "view", "presentation_noAnalyticsRelease"})
public final class MainViewModel extends dev.octoshrimpy.quik.common.base.QkViewModel<dev.octoshrimpy.quik.feature.main.MainView, dev.octoshrimpy.quik.feature.main.MainState> {
    private final dev.octoshrimpy.quik.manager.ChangelogManager changelogManager = null;
    private final dev.octoshrimpy.quik.repository.ConversationRepository conversationRepo = null;
    private final dev.octoshrimpy.quik.interactor.DeleteConversations deleteConversations = null;
    private final dev.octoshrimpy.quik.interactor.MarkArchived markArchived = null;
    private final dev.octoshrimpy.quik.interactor.MarkPinned markPinned = null;
    private final dev.octoshrimpy.quik.interactor.MarkRead markRead = null;
    private final dev.octoshrimpy.quik.interactor.MarkUnarchived markUnarchived = null;
    private final dev.octoshrimpy.quik.interactor.MarkUnpinned markUnpinned = null;
    private final dev.octoshrimpy.quik.interactor.MarkUnread markUnread = null;
    private final dev.octoshrimpy.quik.common.Navigator navigator = null;
    private final dev.octoshrimpy.quik.manager.PermissionManager permissionManager = null;
    private final dev.octoshrimpy.quik.util.Preferences prefs = null;
    private final dev.octoshrimpy.quik.manager.RatingManager ratingManager = null;
    private final dev.octoshrimpy.quik.interactor.SyncContacts syncContacts = null;
    private final dev.octoshrimpy.quik.interactor.SyncMessages syncMessages = null;
    
    @javax.inject.Inject
    public MainViewModel(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.manager.BillingManager billingManager, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.listener.ContactAddedListener contactAddedListener, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.interactor.MarkAllSeen markAllSeen, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.interactor.MigratePreferences migratePreferences, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.SyncRepository syncRepository, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.manager.ChangelogManager changelogManager, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.ConversationRepository conversationRepo, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.interactor.DeleteConversations deleteConversations, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.interactor.MarkArchived markArchived, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.interactor.MarkPinned markPinned, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.interactor.MarkRead markRead, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.interactor.MarkUnarchived markUnarchived, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.interactor.MarkUnpinned markUnpinned, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.interactor.MarkUnread markUnread, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.Navigator navigator, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.manager.PermissionManager permissionManager, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.util.Preferences prefs, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.manager.RatingManager ratingManager, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.interactor.SyncContacts syncContacts, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.interactor.SyncMessages syncMessages) {
        super(null);
    }
    
    @java.lang.Override
    public void bindView(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.main.MainView view) {
    }
}