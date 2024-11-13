package dev.octoshrimpy.quik.injection.android;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'J\b\u0010\t\u001a\u00020\nH\'J\b\u0010\u000b\u001a\u00020\fH\'J\b\u0010\r\u001a\u00020\u000eH\'J\b\u0010\u000f\u001a\u00020\u0010H\'J\b\u0010\u0011\u001a\u00020\u0012H\'J\b\u0010\u0013\u001a\u00020\u0014H\'J\b\u0010\u0015\u001a\u00020\u0016H\'J\b\u0010\u0017\u001a\u00020\u0018H\'J\b\u0010\u0019\u001a\u00020\u001aH\'\u00a8\u0006\u001b"}, d2 = {"Ldev/octoshrimpy/quik/injection/android/ActivityBuilderModule;", "", "()V", "bindBackupActivity", "Ldev/octoshrimpy/quik/feature/backup/BackupActivity;", "bindBlockingActivity", "Ldev/octoshrimpy/quik/feature/blocking/BlockingActivity;", "bindComposeActivity", "Ldev/octoshrimpy/quik/feature/compose/ComposeActivity;", "bindContactsActivity", "Ldev/octoshrimpy/quik/feature/contacts/ContactsActivity;", "bindConversationInfoActivity", "Ldev/octoshrimpy/quik/feature/conversationinfo/ConversationInfoActivity;", "bindGalleryActivity", "Ldev/octoshrimpy/quik/feature/gallery/GalleryActivity;", "bindMainActivity", "Ldev/octoshrimpy/quik/feature/main/MainActivity;", "bindNotificationPrefsActivity", "Ldev/octoshrimpy/quik/feature/notificationprefs/NotificationPrefsActivity;", "bindPlusActivity", "Ldev/octoshrimpy/quik/feature/plus/PlusActivity;", "bindQkReplyActivity", "Ldev/octoshrimpy/quik/feature/qkreply/QkReplyActivity;", "bindScheduledActivity", "Ldev/octoshrimpy/quik/feature/scheduled/ScheduledActivity;", "bindSettingsActivity", "Ldev/octoshrimpy/quik/feature/settings/SettingsActivity;", "presentation_noAnalyticsRelease"})
@dagger.Module
public abstract class ActivityBuilderModule {
    
    public ActivityBuilderModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.android.ContributesAndroidInjector(modules = {dev.octoshrimpy.quik.feature.main.MainActivityModule.class})
    @dev.octoshrimpy.quik.injection.scope.ActivityScope
    public abstract dev.octoshrimpy.quik.feature.main.MainActivity bindMainActivity();
    
    @org.jetbrains.annotations.NotNull
    @dagger.android.ContributesAndroidInjector(modules = {dev.octoshrimpy.quik.feature.plus.PlusActivityModule.class})
    @dev.octoshrimpy.quik.injection.scope.ActivityScope
    public abstract dev.octoshrimpy.quik.feature.plus.PlusActivity bindPlusActivity();
    
    @org.jetbrains.annotations.NotNull
    @dagger.android.ContributesAndroidInjector(modules = {})
    @dev.octoshrimpy.quik.injection.scope.ActivityScope
    public abstract dev.octoshrimpy.quik.feature.backup.BackupActivity bindBackupActivity();
    
    @org.jetbrains.annotations.NotNull
    @dagger.android.ContributesAndroidInjector(modules = {dev.octoshrimpy.quik.feature.compose.ComposeActivityModule.class})
    @dev.octoshrimpy.quik.injection.scope.ActivityScope
    public abstract dev.octoshrimpy.quik.feature.compose.ComposeActivity bindComposeActivity();
    
    @org.jetbrains.annotations.NotNull
    @dagger.android.ContributesAndroidInjector(modules = {dev.octoshrimpy.quik.feature.contacts.ContactsActivityModule.class})
    @dev.octoshrimpy.quik.injection.scope.ActivityScope
    public abstract dev.octoshrimpy.quik.feature.contacts.ContactsActivity bindContactsActivity();
    
    @org.jetbrains.annotations.NotNull
    @dagger.android.ContributesAndroidInjector(modules = {})
    @dev.octoshrimpy.quik.injection.scope.ActivityScope
    public abstract dev.octoshrimpy.quik.feature.conversationinfo.ConversationInfoActivity bindConversationInfoActivity();
    
    @org.jetbrains.annotations.NotNull
    @dagger.android.ContributesAndroidInjector(modules = {dev.octoshrimpy.quik.feature.gallery.GalleryActivityModule.class})
    @dev.octoshrimpy.quik.injection.scope.ActivityScope
    public abstract dev.octoshrimpy.quik.feature.gallery.GalleryActivity bindGalleryActivity();
    
    @org.jetbrains.annotations.NotNull
    @dagger.android.ContributesAndroidInjector(modules = {dev.octoshrimpy.quik.feature.notificationprefs.NotificationPrefsActivityModule.class})
    @dev.octoshrimpy.quik.injection.scope.ActivityScope
    public abstract dev.octoshrimpy.quik.feature.notificationprefs.NotificationPrefsActivity bindNotificationPrefsActivity();
    
    @org.jetbrains.annotations.NotNull
    @dagger.android.ContributesAndroidInjector(modules = {dev.octoshrimpy.quik.feature.qkreply.QkReplyActivityModule.class})
    @dev.octoshrimpy.quik.injection.scope.ActivityScope
    public abstract dev.octoshrimpy.quik.feature.qkreply.QkReplyActivity bindQkReplyActivity();
    
    @org.jetbrains.annotations.NotNull
    @dagger.android.ContributesAndroidInjector(modules = {dev.octoshrimpy.quik.feature.scheduled.ScheduledActivityModule.class})
    @dev.octoshrimpy.quik.injection.scope.ActivityScope
    public abstract dev.octoshrimpy.quik.feature.scheduled.ScheduledActivity bindScheduledActivity();
    
    @org.jetbrains.annotations.NotNull
    @dagger.android.ContributesAndroidInjector(modules = {})
    @dev.octoshrimpy.quik.injection.scope.ActivityScope
    public abstract dev.octoshrimpy.quik.feature.settings.SettingsActivity bindSettingsActivity();
    
    @org.jetbrains.annotations.NotNull
    @dagger.android.ContributesAndroidInjector(modules = {})
    @dev.octoshrimpy.quik.injection.scope.ActivityScope
    public abstract dev.octoshrimpy.quik.feature.blocking.BlockingActivity bindBlockingActivity();
}