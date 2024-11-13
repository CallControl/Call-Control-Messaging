package dev.octoshrimpy.quik.feature.notificationprefs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B1\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0002H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Ldev/octoshrimpy/quik/feature/notificationprefs/NotificationPrefsViewModel;", "Ldev/octoshrimpy/quik/common/base/QkViewModel;", "Ldev/octoshrimpy/quik/feature/notificationprefs/NotificationPrefsView;", "Ldev/octoshrimpy/quik/feature/notificationprefs/NotificationPrefsState;", "threadId", "", "context", "Landroid/content/Context;", "conversationRepo", "Ldev/octoshrimpy/quik/repository/ConversationRepository;", "navigator", "Ldev/octoshrimpy/quik/common/Navigator;", "prefs", "Ldev/octoshrimpy/quik/util/Preferences;", "(JLandroid/content/Context;Ldev/octoshrimpy/quik/repository/ConversationRepository;Ldev/octoshrimpy/quik/common/Navigator;Ldev/octoshrimpy/quik/util/Preferences;)V", "notifications", "Lcom/f2prateek/rx/preferences2/Preference;", "", "previews", "", "ringtone", "", "vibration", "wake", "bindView", "", "view", "presentation_noAnalyticsRelease"})
public final class NotificationPrefsViewModel extends dev.octoshrimpy.quik.common.base.QkViewModel<dev.octoshrimpy.quik.feature.notificationprefs.NotificationPrefsView, dev.octoshrimpy.quik.feature.notificationprefs.NotificationPrefsState> {
    private final long threadId = 0L;
    private final android.content.Context context = null;
    private final dev.octoshrimpy.quik.repository.ConversationRepository conversationRepo = null;
    private final dev.octoshrimpy.quik.common.Navigator navigator = null;
    private final dev.octoshrimpy.quik.util.Preferences prefs = null;
    private final com.f2prateek.rx.preferences2.Preference<java.lang.Boolean> notifications = null;
    private final com.f2prateek.rx.preferences2.Preference<java.lang.Integer> previews = null;
    private final com.f2prateek.rx.preferences2.Preference<java.lang.Boolean> wake = null;
    private final com.f2prateek.rx.preferences2.Preference<java.lang.Boolean> vibration = null;
    private final com.f2prateek.rx.preferences2.Preference<java.lang.String> ringtone = null;
    
    @javax.inject.Inject
    public NotificationPrefsViewModel(@javax.inject.Named(value = "threadId")
    long threadId, @org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.ConversationRepository conversationRepo, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.Navigator navigator, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.util.Preferences prefs) {
        super(null);
    }
    
    @java.lang.Override
    public void bindView(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.notificationprefs.NotificationPrefsView view) {
    }
}