package dev.octoshrimpy.quik.feature.gallery;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0018\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0015H\u0016R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u000e\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0010 \r*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u00110\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Ldev/octoshrimpy/quik/feature/gallery/GalleryPagerAdapter;", "Ldev/octoshrimpy/quik/common/base/QkRealmAdapter;", "Ldev/octoshrimpy/quik/model/MmsPart;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "clicks", "Lio/reactivex/subjects/Subject;", "Landroid/view/View;", "getClicks", "()Lio/reactivex/subjects/Subject;", "contentResolver", "Landroid/content/ContentResolver;", "kotlin.jvm.PlatformType", "exoPlayers", "", "Lcom/google/android/exoplayer2/ExoPlayer;", "", "destroy", "", "getItemViewType", "", "position", "onBindViewHolder", "holder", "Ldev/octoshrimpy/quik/common/base/QkViewHolder;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "presentation_noAnalyticsRelease"})
public final class GalleryPagerAdapter extends dev.octoshrimpy.quik.common.base.QkRealmAdapter<dev.octoshrimpy.quik.model.MmsPart> {
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    public static final dev.octoshrimpy.quik.feature.gallery.GalleryPagerAdapter.Companion Companion = null;
    private static final int VIEW_TYPE_INVALID = 0;
    private static final int VIEW_TYPE_IMAGE = 1;
    private static final int VIEW_TYPE_VIDEO = 2;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.subjects.Subject<android.view.View> clicks = null;
    private final android.content.ContentResolver contentResolver = null;
    private final java.util.Set<com.google.android.exoplayer2.ExoPlayer> exoPlayers = null;
    
    @javax.inject.Inject
    public GalleryPagerAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.subjects.Subject<android.view.View> getClicks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dev.octoshrimpy.quik.common.base.QkViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.base.QkViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemViewType(int position) {
        return 0;
    }
    
    public final void destroy() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Ldev/octoshrimpy/quik/feature/gallery/GalleryPagerAdapter$Companion;", "", "()V", "VIEW_TYPE_IMAGE", "", "VIEW_TYPE_INVALID", "VIEW_TYPE_VIDEO", "presentation_noAnalyticsRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}