package dev.octoshrimpy.quik.manager;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Ldev/octoshrimpy/quik/manager/AlarmManagerImpl;", "Ldev/octoshrimpy/quik/manager/AlarmManager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getScheduledMessageIntent", "Landroid/app/PendingIntent;", "id", "", "setAlarm", "", "date", "intent", "data_noAnalyticsRelease"})
public final class AlarmManagerImpl implements dev.octoshrimpy.quik.manager.AlarmManager {
    private final android.content.Context context = null;
    
    @javax.inject.Inject
    public AlarmManagerImpl(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.app.PendingIntent getScheduledMessageIntent(long id) {
        return null;
    }
    
    @java.lang.Override
    public void setAlarm(long date, @org.jetbrains.annotations.NotNull
    android.app.PendingIntent intent) {
    }
}