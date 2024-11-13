package dev.octoshrimpy.quik.migration;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Ldev/octoshrimpy/quik/migration/QkRealmMigration;", "Lio/realm/RealmMigration;", "cursorToContact", "Ldev/octoshrimpy/quik/mapper/CursorToContactImpl;", "prefs", "Ldev/octoshrimpy/quik/util/Preferences;", "(Ldev/octoshrimpy/quik/mapper/CursorToContactImpl;Ldev/octoshrimpy/quik/util/Preferences;)V", "migrate", "", "realm", "Lio/realm/DynamicRealm;", "oldVersion", "", "newVersion", "Companion", "data_noAnalyticsRelease"})
public final class QkRealmMigration implements io.realm.RealmMigration {
    private final dev.octoshrimpy.quik.mapper.CursorToContactImpl cursorToContact = null;
    private final dev.octoshrimpy.quik.util.Preferences prefs = null;
    @org.jetbrains.annotations.NotNull
    public static final dev.octoshrimpy.quik.migration.QkRealmMigration.Companion Companion = null;
    public static final long SchemaVersion = 11L;
    
    @javax.inject.Inject
    public QkRealmMigration(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.mapper.CursorToContactImpl cursorToContact, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.util.Preferences prefs) {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"ApplySharedPref"})
    @java.lang.Override
    public void migrate(@org.jetbrains.annotations.NotNull
    io.realm.DynamicRealm realm, long oldVersion, long newVersion) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Ldev/octoshrimpy/quik/migration/QkRealmMigration$Companion;", "", "()V", "SchemaVersion", "", "data_noAnalyticsRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}