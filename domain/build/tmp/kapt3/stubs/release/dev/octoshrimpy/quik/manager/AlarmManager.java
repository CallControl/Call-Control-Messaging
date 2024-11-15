package dev.octoshrimpy.quik.manager;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0003H&\u00a8\u0006\n"}, d2 = {"Ldev/octoshrimpy/quik/manager/AlarmManager;", "", "getScheduledMessageIntent", "Landroid/app/PendingIntent;", "id", "", "setAlarm", "", "date", "intent", "domain_release"})
public abstract interface AlarmManager {
    
    @org.jetbrains.annotations.NotNull
    public abstract android.app.PendingIntent getScheduledMessageIntent(long id);
    
    public abstract void setAlarm(long date, @org.jetbrains.annotations.NotNull
    android.app.PendingIntent intent);
}