package dev.octoshrimpy.quik.manager;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0011\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Ldev/octoshrimpy/quik/manager/ChangelogManagerImpl;", "Ldev/octoshrimpy/quik/manager/ChangelogManager;", "context", "Landroid/content/Context;", "moshi", "Lcom/squareup/moshi/Moshi;", "prefs", "Ldev/octoshrimpy/quik/util/Preferences;", "(Landroid/content/Context;Lcom/squareup/moshi/Moshi;Ldev/octoshrimpy/quik/util/Preferences;)V", "didUpdate", "", "getChangelog", "Ldev/octoshrimpy/quik/manager/ChangelogManager$CumulativeChangelog;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markChangelogSeen", "", "Changeset", "data_noAnalyticsRelease"})
public final class ChangelogManagerImpl implements dev.octoshrimpy.quik.manager.ChangelogManager {
    private final android.content.Context context = null;
    private final com.squareup.moshi.Moshi moshi = null;
    private final dev.octoshrimpy.quik.util.Preferences prefs = null;
    
    @javax.inject.Inject
    public ChangelogManagerImpl(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.squareup.moshi.Moshi moshi, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.util.Preferences prefs) {
        super();
    }
    
    @java.lang.Override
    public boolean didUpdate() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getChangelog(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super dev.octoshrimpy.quik.manager.ChangelogManager.CumulativeChangelog> continuation) {
        return null;
    }
    
    @java.lang.Override
    public void markChangelogSeen() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0010\b\u0001\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0004\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\nH\u00c6\u0003Je\u0010\u001b\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0003\u0010\b\u001a\u00020\u00042\b\b\u0003\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020\nH\u00d6\u0001J\t\u0010 \u001a\u00020\u0004H\u00d6\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006!"}, d2 = {"Ldev/octoshrimpy/quik/manager/ChangelogManagerImpl$Changeset;", "", "added", "", "", "improved", "removed", "fixed", "versionName", "versionCode", "", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;I)V", "getAdded", "()Ljava/util/List;", "getFixed", "getImproved", "getRemoved", "getVersionCode", "()I", "getVersionName", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "data_noAnalyticsRelease"})
    @com.squareup.moshi.JsonClass(generateAdapter = false)
    public static final class Changeset {
        @org.jetbrains.annotations.Nullable
        private final java.util.List<java.lang.String> added = null;
        @org.jetbrains.annotations.Nullable
        private final java.util.List<java.lang.String> improved = null;
        @org.jetbrains.annotations.Nullable
        private final java.util.List<java.lang.String> removed = null;
        @org.jetbrains.annotations.Nullable
        private final java.util.List<java.lang.String> fixed = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String versionName = null;
        private final int versionCode = 0;
        
        @org.jetbrains.annotations.NotNull
        public final dev.octoshrimpy.quik.manager.ChangelogManagerImpl.Changeset copy(@org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "added")
        java.util.List<java.lang.String> added, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "improved")
        java.util.List<java.lang.String> improved, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "removed")
        java.util.List<java.lang.String> removed, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "fixed")
        java.util.List<java.lang.String> fixed, @org.jetbrains.annotations.NotNull
        @com.squareup.moshi.Json(name = "versionName")
        java.lang.String versionName, @com.squareup.moshi.Json(name = "versionCode")
        int versionCode) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public Changeset(@org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "added")
        java.util.List<java.lang.String> added, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "improved")
        java.util.List<java.lang.String> improved, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "removed")
        java.util.List<java.lang.String> removed, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "fixed")
        java.util.List<java.lang.String> fixed, @org.jetbrains.annotations.NotNull
        @com.squareup.moshi.Json(name = "versionName")
        java.lang.String versionName, @com.squareup.moshi.Json(name = "versionCode")
        int versionCode) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<java.lang.String> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<java.lang.String> getAdded() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<java.lang.String> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<java.lang.String> getImproved() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<java.lang.String> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<java.lang.String> getRemoved() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<java.lang.String> component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<java.lang.String> getFixed() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getVersionName() {
            return null;
        }
        
        public final int component6() {
            return 0;
        }
        
        public final int getVersionCode() {
            return 0;
        }
    }
}