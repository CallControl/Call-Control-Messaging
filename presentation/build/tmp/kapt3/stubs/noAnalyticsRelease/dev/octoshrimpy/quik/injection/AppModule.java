package dev.octoshrimpy.quik.injection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00e0\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0014H\u0007J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u001bH\u0007J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u001eH\u0007J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0007J\u0010\u0010#\u001a\u00020$2\u0006\u0010\u0017\u001a\u00020%H\u0007J\u0010\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)H\u0007J\b\u0010*\u001a\u00020)H\u0007J\u0010\u0010+\u001a\u00020,2\u0006\u0010\u0017\u001a\u00020-H\u0007J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0007J\u0010\u00102\u001a\u0002032\u0006\u00100\u001a\u000204H\u0007J\u0010\u00105\u001a\u0002062\u0006\u00100\u001a\u000207H\u0007J\u0010\u00108\u001a\u0002092\u0006\u00100\u001a\u00020:H\u0007J\u0010\u0010;\u001a\u00020<2\u0006\u00100\u001a\u00020=H\u0007J\u0010\u0010>\u001a\u00020?2\u0006\u00100\u001a\u00020@H\u0007J\u0010\u0010A\u001a\u00020B2\u0006\u00100\u001a\u00020CH\u0007J\u0010\u0010D\u001a\u00020E2\u0006\u0010\u0007\u001a\u00020FH\u0007J\u0010\u0010G\u001a\u00020H2\u0006\u0010\u0017\u001a\u00020IH\u0007J\b\u0010J\u001a\u00020KH\u0007J\u0010\u0010L\u001a\u00020M2\u0006\u0010\u0007\u001a\u00020NH\u0007J\u0010\u0010O\u001a\u00020P2\u0006\u0010\u0007\u001a\u00020QH\u0007J\u0010\u0010R\u001a\u00020S2\u0006\u0010\u0007\u001a\u00020TH\u0007J\u0010\u0010U\u001a\u00020V2\u0006\u0010\u0007\u001a\u00020WH\u0007J\u0010\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020[H\u0007J\u0010\u0010\\\u001a\u00020]2\u0006\u0010\u0017\u001a\u00020^H\u0007J\u0010\u0010_\u001a\u00020[2\u0006\u0010(\u001a\u00020)H\u0007J\u0010\u0010`\u001a\u00020a2\u0006\u0010\u0007\u001a\u00020bH\u0007J\u0010\u0010c\u001a\u00020d2\u0006\u0010\u0017\u001a\u00020eH\u0007J\u0010\u0010f\u001a\u00020g2\u0006\u0010h\u001a\u00020iH\u0007J\u0010\u0010j\u001a\u00020k2\u0006\u0010\u0007\u001a\u00020lH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006m"}, d2 = {"Ldev/octoshrimpy/quik/injection/AppModule;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "blockingClient", "Ldev/octoshrimpy/quik/blocking/BlockingClient;", "manager", "Ldev/octoshrimpy/quik/blocking/BlockingManager;", "changelogManager", "Ldev/octoshrimpy/quik/manager/ChangelogManager;", "Ldev/octoshrimpy/quik/manager/ChangelogManagerImpl;", "provideActiveConversationManager", "Ldev/octoshrimpy/quik/manager/ActiveConversationManager;", "Ldev/octoshrimpy/quik/manager/ActiveConversationManagerImpl;", "provideAlarmManager", "Ldev/octoshrimpy/quik/manager/AlarmManager;", "Ldev/octoshrimpy/quik/manager/AlarmManagerImpl;", "provideAnalyticsManager", "Ldev/octoshrimpy/quik/manager/AnalyticsManager;", "Ldev/octoshrimpy/quik/manager/AnalyticsManagerImpl;", "provideBackupRepository", "Ldev/octoshrimpy/quik/repository/BackupRepository;", "repository", "Ldev/octoshrimpy/quik/repository/BackupRepositoryImpl;", "provideBillingManager", "Ldev/octoshrimpy/quik/manager/BillingManager;", "Ldev/octoshrimpy/quik/common/util/BillingManagerImpl;", "provideBlockingRepository", "Ldev/octoshrimpy/quik/repository/BlockingRepository;", "Ldev/octoshrimpy/quik/repository/BlockingRepositoryImpl;", "provideContactAddedListener", "Ldev/octoshrimpy/quik/listener/ContactAddedListener;", "listener", "Ldev/octoshrimpy/quik/listener/ContactAddedListenerImpl;", "provideContactRepository", "Ldev/octoshrimpy/quik/repository/ContactRepository;", "Ldev/octoshrimpy/quik/repository/ContactRepositoryImpl;", "provideContentResolver", "Landroid/content/ContentResolver;", "context", "Landroid/content/Context;", "provideContext", "provideConversationRepository", "Ldev/octoshrimpy/quik/repository/ConversationRepository;", "Ldev/octoshrimpy/quik/repository/ConversationRepositoryImpl;", "provideCursorToContact", "Ldev/octoshrimpy/quik/mapper/CursorToContact;", "mapper", "Ldev/octoshrimpy/quik/mapper/CursorToContactImpl;", "provideCursorToContactGroup", "Ldev/octoshrimpy/quik/mapper/CursorToContactGroup;", "Ldev/octoshrimpy/quik/mapper/CursorToContactGroupImpl;", "provideCursorToContactGroupMember", "Ldev/octoshrimpy/quik/mapper/CursorToContactGroupMember;", "Ldev/octoshrimpy/quik/mapper/CursorToContactGroupMemberImpl;", "provideCursorToConversation", "Ldev/octoshrimpy/quik/mapper/CursorToConversation;", "Ldev/octoshrimpy/quik/mapper/CursorToConversationImpl;", "provideCursorToMessage", "Ldev/octoshrimpy/quik/mapper/CursorToMessage;", "Ldev/octoshrimpy/quik/mapper/CursorToMessageImpl;", "provideCursorToPart", "Ldev/octoshrimpy/quik/mapper/CursorToPart;", "Ldev/octoshrimpy/quik/mapper/CursorToPartImpl;", "provideCursorToRecipient", "Ldev/octoshrimpy/quik/mapper/CursorToRecipient;", "Ldev/octoshrimpy/quik/mapper/CursorToRecipientImpl;", "provideKeyManager", "Ldev/octoshrimpy/quik/manager/KeyManager;", "Ldev/octoshrimpy/quik/manager/KeyManagerImpl;", "provideMessageRepository", "Ldev/octoshrimpy/quik/repository/MessageRepository;", "Ldev/octoshrimpy/quik/repository/MessageRepositoryImpl;", "provideMoshi", "Lcom/squareup/moshi/Moshi;", "provideNotificationsManager", "Ldev/octoshrimpy/quik/manager/NotificationManager;", "Ldev/octoshrimpy/quik/common/util/NotificationManagerImpl;", "providePermissionsManager", "Ldev/octoshrimpy/quik/manager/PermissionManager;", "Ldev/octoshrimpy/quik/manager/PermissionManagerImpl;", "provideRatingManager", "Ldev/octoshrimpy/quik/manager/RatingManager;", "Ldev/octoshrimpy/quik/mapper/RatingManagerImpl;", "provideReferralManager", "Ldev/octoshrimpy/quik/manager/ReferralManager;", "Ldev/octoshrimpy/quik/manager/ReferralManagerImpl;", "provideRxPreferences", "Lcom/f2prateek/rx/preferences2/RxSharedPreferences;", "preferences", "Landroid/content/SharedPreferences;", "provideScheduledMessagesRepository", "Ldev/octoshrimpy/quik/repository/ScheduledMessageRepository;", "Ldev/octoshrimpy/quik/repository/ScheduledMessageRepositoryImpl;", "provideSharedPreferences", "provideShortcutManager", "Ldev/octoshrimpy/quik/manager/ShortcutManager;", "Ldev/octoshrimpy/quik/common/util/ShortcutManagerImpl;", "provideSyncRepository", "Ldev/octoshrimpy/quik/repository/SyncRepository;", "Ldev/octoshrimpy/quik/repository/SyncRepositoryImpl;", "provideViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Ldev/octoshrimpy/quik/common/ViewModelFactory;", "provideWidgetManager", "Ldev/octoshrimpy/quik/manager/WidgetManager;", "Ldev/octoshrimpy/quik/manager/WidgetManagerImpl;", "presentation_noAnalyticsRelease"})
@dagger.Module(subcomponents = {dev.octoshrimpy.quik.feature.conversationinfo.injection.ConversationInfoComponent.class, dev.octoshrimpy.quik.feature.themepicker.injection.ThemePickerComponent.class})
public final class AppModule {
    private android.app.Application application;
    
    public AppModule(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final android.content.Context provideContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final android.content.ContentResolver provideContentResolver(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final android.content.SharedPreferences provideSharedPreferences(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.f2prateek.rx.preferences2.RxSharedPreferences provideRxPreferences(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences preferences) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.squareup.moshi.Moshi provideMoshi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final androidx.lifecycle.ViewModelProvider.Factory provideViewModelFactory(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.ViewModelFactory factory) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final dev.octoshrimpy.quik.listener.ContactAddedListener provideContactAddedListener(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.listener.ContactAddedListenerImpl listener) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final dev.octoshrimpy.quik.manager.BillingManager provideBillingManager(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.util.BillingManagerImpl manager) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final dev.octoshrimpy.quik.manager.ActiveConversationManager provideActiveConversationManager(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.manager.ActiveConversationManagerImpl manager) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final dev.octoshrimpy.quik.manager.AlarmManager provideAlarmManager(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.manager.AlarmManagerImpl manager) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final dev.octoshrimpy.quik.manager.AnalyticsManager provideAnalyticsManager(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.manager.AnalyticsManagerImpl manager) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final dev.octoshrimpy.quik.blocking.BlockingClient blockingClient(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.blocking.BlockingManager manager) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final dev.octoshrimpy.quik.manager.ChangelogManager changelogManager(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.manager.ChangelogManagerImpl manager) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final dev.octoshrimpy.quik.manager.KeyManager provideKeyManager(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.manager.KeyManagerImpl manager) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final dev.octoshrimpy.quik.manager.NotificationManager provideNotificationsManager(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.util.NotificationManagerImpl manager) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final dev.octoshrimpy.quik.manager.PermissionManager providePermissionsManager(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.manager.PermissionManagerImpl manager) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final dev.octoshrimpy.quik.manager.RatingManager provideRatingManager(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.mapper.RatingManagerImpl manager) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final dev.octoshrimpy.quik.manager.ShortcutManager provideShortcutManager(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.util.ShortcutManagerImpl manager) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final dev.octoshrimpy.quik.manager.ReferralManager provideReferralManager(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.manager.ReferralManagerImpl manager) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final dev.octoshrimpy.quik.manager.WidgetManager provideWidgetManager(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.manager.WidgetManagerImpl manager) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final dev.octoshrimpy.quik.mapper.CursorToContact provideCursorToContact(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.mapper.CursorToContactImpl mapper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final dev.octoshrimpy.quik.mapper.CursorToContactGroup provideCursorToContactGroup(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.mapper.CursorToContactGroupImpl mapper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final dev.octoshrimpy.quik.mapper.CursorToContactGroupMember provideCursorToContactGroupMember(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.mapper.CursorToContactGroupMemberImpl mapper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final dev.octoshrimpy.quik.mapper.CursorToConversation provideCursorToConversation(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.mapper.CursorToConversationImpl mapper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final dev.octoshrimpy.quik.mapper.CursorToMessage provideCursorToMessage(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.mapper.CursorToMessageImpl mapper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final dev.octoshrimpy.quik.mapper.CursorToPart provideCursorToPart(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.mapper.CursorToPartImpl mapper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final dev.octoshrimpy.quik.mapper.CursorToRecipient provideCursorToRecipient(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.mapper.CursorToRecipientImpl mapper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final dev.octoshrimpy.quik.repository.BackupRepository provideBackupRepository(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.BackupRepositoryImpl repository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final dev.octoshrimpy.quik.repository.BlockingRepository provideBlockingRepository(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.BlockingRepositoryImpl repository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final dev.octoshrimpy.quik.repository.ContactRepository provideContactRepository(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.ContactRepositoryImpl repository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final dev.octoshrimpy.quik.repository.ConversationRepository provideConversationRepository(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.ConversationRepositoryImpl repository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final dev.octoshrimpy.quik.repository.MessageRepository provideMessageRepository(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.MessageRepositoryImpl repository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final dev.octoshrimpy.quik.repository.ScheduledMessageRepository provideScheduledMessagesRepository(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.ScheduledMessageRepositoryImpl repository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final dev.octoshrimpy.quik.repository.SyncRepository provideSyncRepository(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.SyncRepositoryImpl repository) {
        return null;
    }
}